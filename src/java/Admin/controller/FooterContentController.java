/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Admin.controller;

import dao.DAONews;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.News;
import model.NewsView;

/**
 *
 * @author Lenovo
 */
public class FooterContentController extends HttpServlet {

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

        DAONews dao = new DAONews();
        String service = request.getParameter("service");

        if (service.equals("updateFooterContent")) {

            String submit = request.getParameter("submit");

            if (submit == null) {

                int id = Integer.parseInt(request.getParameter("id"));
                ArrayList<News> list = dao.getFooterTitleById(id);
                request.setAttribute("data", list);
                dispath(request, response, "Admin/update/updateFooter.jsp");

            } else {

                int news_id = Integer.parseInt(request.getParameter("news_id"));
                String title = request.getParameter("title");
                String content = request.getParameter("content");
                News ft = new News(news_id, title, content);
                dao.updateFooter(ft);
                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=8");
            }
        }

        if (service.equals("insertFooterContent")) {

            String submit = request.getParameter("submit");

            if (submit == null) {
                
                ArrayList<News> list = dao.getFooterTitle();
                request.setAttribute("data", list);
                dispath(request, response, "Admin/add/addFooter.jsp");

            } else {
                String image = request.getParameter("image");
                String title = request.getParameter("title");
                String content = request.getParameter("content");
                News news = new News(0, 8, image, title, content,
                        null, null, null, null);
                dao.updateFooter(news);
                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=8");
            }
        }

        if (service.equals("deleteFooterContent")) {
            int id = Integer.parseInt(request.getParameter("id"));
            int n = dao.deleteNews(id);
            if (n <= 0) {
                ArrayList<NewsView> list = dao.getAllNews();
                String ms = "Cannot delete News";
                request.setAttribute("ms", ms);
                request.setAttribute("data", list);
                dispath(request, response, "Admin/news.jsp");
            } else {
                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=8");
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
