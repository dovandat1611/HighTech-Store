/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Admin.controller;

import dao.DAOCareer;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Career;

/**
 *
 * @author MinhLe
 */
public class CareerController extends HttpServlet {

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
        DAOCareer dao = new DAOCareer();
        String service = request.getParameter("service");

        if (service.equals("updateCareer")) {
            String submit = request.getParameter("submit");
            if (submit == null) {
                int news_id = Integer.parseInt(request.getParameter("id"));
                ArrayList<Career> list = dao.getCareer(news_id);
                request.setAttribute("data", list);
                dispath(request, response, "Admin/update/updateCareer.jsp");
            } else {
                String image;
                int news_id = Integer.parseInt(request.getParameter("id"));
                String title = request.getParameter("title");
                String content = request.getParameter("content");
                String img = request.getParameter("image");
                if (img.isEmpty()) {
                    image = request.getParameter("imageoriginal");
                } else {
                    image = "images/about/" + img;
                }
                Career c = new Career(news_id, 0, image, title, content);

                dao.updateCareer(c);

                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=14");
            }
        }

        if (service.equals("insertCareer")) {
            String submit = request.getParameter("submit");
            if (submit == null) {
                dispath(request, response, "Admin/add/addCareer.jsp");
            } else {
                String title = request.getParameter("title");
                String image =  request.getParameter("image");
                String content = request.getParameter("content");
                Career c = new Career(0, 14, image, title, content);

                dao.insertCareer(c);

                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=14");
            }
        }

        if (service.equals("deleteCareer")) {
            int news_id = Integer.parseInt(request.getParameter("id"));
            int n = dao.removeCareer(news_id);
            if (n <= 0) {
                ArrayList<Career> list = dao.getAllCareer();
                String ms = "Cannot delete Conditions";
                request.setAttribute("data", list);
                request.setAttribute("ms", ms);
                dispath(request, response, "Admin/news.jsp");
            } else {
                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=14");
            }
        }

    }

    void dispath(HttpServletRequest request, HttpServletResponse response, String url) throws ServletException, IOException {
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
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
        processRequest(request, response);
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
