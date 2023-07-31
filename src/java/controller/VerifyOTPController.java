/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAOCustomer;
import dao.DAONews;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import model.News;
/**
 *
 * @author Lenovo
 */
public class VerifyOTPController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Footer
        DAONews daoN = new DAONews();
        ArrayList<News> titlefooter = daoN.getFooterTitle();
        String title1 = titlefooter.get(0).getTitle();
        String title2 = titlefooter.get(1).getTitle();
        String title3 = titlefooter.get(2).getTitle();
        String title4 = titlefooter.get(3).getTitle();
        ArrayList<News> footer1 = daoN.getFooter(title1);
        ArrayList<News> footer2 = daoN.getFooter(title2);
        ArrayList<News> footer3 = daoN.getFooter(title3);
        ArrayList<News> footer4 = daoN.getFooter(title4);
        request.setAttribute("titlefooter", titlefooter);
        request.setAttribute("footer1", footer1);
        request.setAttribute("footer2", footer2);
        request.setAttribute("footer3", footer3);
        request.setAttribute("footer4", footer4);
        
        // Code OTP
        DAOCustomer dao = new DAOCustomer();

        String otp = request.getParameter("otp");
        String email = dao.getEmailFromSession(request);

        if (dao.verifyOTP(email, otp, request)) {
            // Chuyển hướng đến trang tạo/xác nhận mật khẩu mới
            response.sendRedirect("UpdatePasswordController");
        } else {
            request.getRequestDispatcher("Client/forgotpassword.jsp").forward(request, response);
            HttpSession session = request.getSession();
            if (session != null) {
                session.invalidate();
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("Client/OTP.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
