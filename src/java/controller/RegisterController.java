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
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Customer;
import model.News;
import utils.Vadidate;

/**
 *
 * @author Lenovo
 */
public class RegisterController extends HttpServlet {

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
        
        // Code Register
        
        DAOCustomer dao = new DAOCustomer();
        Vadidate v = new Vadidate();

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        Date dob = Date.valueOf(request.getParameter("dob"));
        String gmail = request.getParameter("gmail");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String haspassword = v.hashPassword(password);
        String status = "Active";
        if (v.checkGmail(gmail) == true && v.checkAccountCustomer(username) == true && v.checkPhone(phone) == true
                && v.checkPassword(password) == true) {
            if (gender.equals("1")) {
                Customer cus = new Customer(0, name, phone, null, dob, gmail, true, address, username, haspassword, status);
                dao.insertCustomer(cus);
                response.sendRedirect("LoginController");
            } else {
                Customer cus = new Customer(0, name, phone, null, dob, gmail, true, address, username, haspassword, status);
                dao.insertCustomer(cus);
                response.sendRedirect("LoginController");
            }

        } else {
            if (v.checkGmail(gmail) == false) {
                String ms1 = "*invalid gmail!";
                request.setAttribute("ms1", ms1);
            }
            if (v.checkPassword(password) == false) {
                String ms2 = "*password more than 6 characters";
                request.setAttribute("ms2", ms2);
            }
            if (v.checkPhone(phone) == false) {
                String ms3 = "*Phone is full number";
                request.setAttribute("ms3", ms3);
            }
            if (v.checkAccountCustomer(username) == false) {
                String ms4 = "*username is exist! pls enter another username";
                request.setAttribute("ms4", ms4);
            }
            request.getRequestDispatcher("Client/register.jsp").forward(request, response);
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
        
        // Call jsp
        request.getRequestDispatcher("Client/register.jsp").forward(request, response);
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
