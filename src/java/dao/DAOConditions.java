/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AboutUs;
import model.Conditions;

/**
 *
 * @author MinhLe
 */
public class DAOConditions extends DBContext {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<Conditions> getAllConditions() {
        ArrayList<Conditions> list = new ArrayList<>();
        String sql = "SELECT n.news_id, n.newsgroup_id, n.image,"
                + " n.title, n.content FROM news n where newsgroup_id = 13";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Conditions(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public int getTotalPages(int pageSize) {
        int totalRecords = 0;
        int totalPages = 0;

        try {
            String sql = "SELECT COUNT(*) FROM news where newsgroup_id = 13";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                totalRecords = rs.getInt(1);
            }
            totalPages = (int) Math.ceil((double) totalRecords / pageSize);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return totalPages;
    }

    public ArrayList<Conditions> pagingConditions(int pageNumber, int pageSize) {
        ArrayList<Conditions> list = new ArrayList<>();
        int offset = (pageNumber - 1) * pageSize;
        String sql = "SELECT n.news_id, n.newsgroup_id, n.image, n.title, n.content "
                + "FROM news n where newsgroup_id= 13 "
                + "ORDER BY news_id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, offset);
            ps.setInt(2, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Conditions(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Conditions> getConditions(int id) {
        ArrayList<Conditions> list = new ArrayList<>();
        String sql = "SELECT n.news_id, n.newsgroup_id, n.image, n.title, n.content "
                + "FROM news n where newsgroup_id=13 and news_id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Conditions(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public ArrayList<Conditions> searchConditions(String name) {
        ArrayList<Conditions> list = new ArrayList<>();
        String sql = "SELECT n.news_id, n.newsgroup_id, n.image, n.title, n.content "
                + "FROM news n where newsgroup_id=13 and n.title LIKE '%' + ? + '%'";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Conditions(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void insertConditions(Conditions co) {
        String sql = "INSERT INTO [dbo].[news]\n"
                + "           ([title]\n"
                + "           ,[image]\n"
                + "           ,[content]\n"
                + "           ,[newsgroup_id])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, co.getTitle());
            ps.setString(2, co.getImage());
            ps.setString(3, co.getContent());
            ps.setInt(4, co.getNewsgroup_id());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateConditions(Conditions co) {
        String sql = "UPDATE [dbo].[news]\n"
                + "   SET [title] = ?\n"
                + "      ,[image] = ?\n"
                + "      ,[content] = ?\n"
                + " WHERE news_id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, co.getTitle());
            ps.setString(2, co.getImage());
            ps.setString(3, co.getContent());
            ps.setInt(4, co.getNews_id());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public int removeConditions(int id) {
        int n = 0;
        String sql = "delete from news where newsgroup_id = 13 and news_id= " + id;
        try {
            ps = connection.prepareStatement(sql);
            n = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return n;
    }
}
