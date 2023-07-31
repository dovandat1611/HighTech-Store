/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Admin.controller;

import dao.DAONews;
import dao.DAONewsGroup;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Admin;
import model.News;
import model.NewsGroup;
import model.NewsView;

/**
 *
 * @author Lenovo
 */
public class BannerController extends HttpServlet {

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
        DAONewsGroup daoG = new DAONewsGroup();
        HttpSession session = request.getSession();
        Admin ad = (Admin) session.getAttribute("account");
        String service = request.getParameter("service");

        if (service.equals("updateBanner")) {
            String submit = request.getParameter("submit");
            if (submit == null) {
                int id = Integer.parseInt(request.getParameter("id"));
                ArrayList<News> list = dao.getNews(id);
                request.setAttribute("data", list);
                dispath(request, response, "Admin/update/updateBanner.jsp");

            } else {
                String image;
                String img = request.getParameter("image");
                if (img.isEmpty()) {
                    image = request.getParameter("imageoriginal");
                } else {
                    image = "images/banner/" + img;
                }
                String title = request.getParameter("title");
                String content = request.getParameter("content");
                int id = Integer.parseInt(request.getParameter("news_id"));

                News news = new News(id, 0, image, title, content,
                        null, null, null, null);
                dao.updateBanner(news);

                ArrayList<News> searchnews = dao.getNews(id);
                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=" + searchnews.get(0).getNewsgroup_id());
            }
        }
        if (service.equals("insertBanner")) {
            String submit = request.getParameter("submit");
            if (submit == null) {
                ArrayList<NewsGroup> groups = daoG.getAllNewsGroup();
                request.setAttribute("listG", groups);
                dispath(request, response, "Admin/add/addBanner.jsp");

            } else {
                LocalDate localDate = LocalDate.now();
                Date date = Date.valueOf(localDate);
                String image;
                String img = request.getParameter("image");
                if (img.isEmpty()) {
                    image = request.getParameter("imageoriginal");
                } else {
                    image = "images/banner/" + img;
                }
                String title = request.getParameter("title");
                String content = request.getParameter("content");
                int ngid = Integer.valueOf(request.getParameter("newsgroup_id"));
                News news = new News(0, ngid, image, title, content,
                        ad.getName(), date, null, null);

                dao.insertBanner(news);
                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=" + ngid);
            }

        }
        if (service.equals("deleteBanner")) {
            int id = Integer.parseInt(request.getParameter("id"));
            ArrayList<News> searchnews = dao.getNews(id);
            int n = dao.deleteNews(id);
            if (n <= 0) {
                ArrayList<NewsView> list = dao.getAllNews();
                String ms = "Cannot delete News";
                request.setAttribute("ms", ms);
                request.setAttribute("data", list);
                dispath(request, response, "Admin/news.jsp");
            } else {
                response.sendRedirect("NewsController?service=searchNewsGroup&newsgroup_id=" + searchnews.get(0).getNewsgroup_id());
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
