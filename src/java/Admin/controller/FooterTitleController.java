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
 * @author MinhLe
 */
public class FooterTitleController extends HttpServlet {

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

        if (service.equals("updateFooterTitle")) {

            String submit = request.getParameter("submit");

            if (submit == null) {

                int id = Integer.parseInt(request.getParameter("id"));
                ArrayList<News> list = dao.getFooterTitleById(id);
                request.setAttribute("data", list);
                dispath(request, response, "Admin/update/updateFooterTitle.jsp");

            } else {

                int news_id = Integer.parseInt(request.getParameter("news_id"));
                String oldtitle = request.getParameter("oldtitle");
                String title = request.getParameter("title");
                dao.updateFooterChangesTitle(oldtitle, title);
                News ft = new News(news_id, title);
                dao.updateFooterTitle(ft);
                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=7");
            }
        }

        if (service.equals("insertFooterTitle")) {

            String submit = request.getParameter("submit");

            if (submit == null) {

                dispath(request, response, "Admin/add/addFooterTitle.jsp");

            } else {
                String title = request.getParameter("title");
                
                News ft = new News(0, 7, null, title, null,
                        null, null, null, null);

                dao.insertNews(ft);

                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=7");
            }
        }

        if (service.equals("deleteAboutUs")) {
            int news_id = Integer.parseInt(request.getParameter("id"));
            int n = dao.deleteNews(news_id);
            if (n <= 0) {
                ArrayList<NewsView> list = dao.getAllNews();
                String ms = "Cannot delete AboutUs";
                request.setAttribute("data", list);
                request.setAttribute("ms", ms);
                dispath(request, response, "Admin/news.jsp");
            } else {
                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=7");
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
