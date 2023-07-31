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
import model.Returns;

/**
 *
 * @author MinhLe
 */
public class DAOReturns extends DBContext {
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<Returns> getAllReturns() {
        ArrayList<Returns> list = new ArrayList<>();
        String sql = "SELECT n.news_id, n.newsgroup_id, n.image,"
                + " n.title, n.content FROM news n where newsgroup_id = 16";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Returns(rs.getInt(1),
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
            String sql = "SELECT COUNT(*) FROM news where newsgroup_id = 16";
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

    public ArrayList<Returns> pagingReturns(int pageNumber, int pageSize) {
        ArrayList<Returns> list = new ArrayList<>();
        int offset = (pageNumber - 1) * pageSize;
        String sql = "SELECT n.news_id, n.newsgroup_id, n.image, n.title, n.content "
                + "FROM news n where newsgroup_id= 16 "
                + "ORDER BY news_id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, offset);
            ps.setInt(2, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Returns(rs.getInt(1),
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

    public ArrayList<Returns> getReturns(int id) {
        ArrayList<Returns> list = new ArrayList<>();
        String sql = "SELECT n.news_id, n.newsgroup_id, n.image, n.title, n.content "
                + "FROM news n where newsgroup_id=16 and news_id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Returns(rs.getInt(1),
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

    public ArrayList<Returns> searchReturns(String name) {
        ArrayList<Returns> list = new ArrayList<>();
        String sql = "SELECT n.news_id, n.newsgroup_id, n.image, n.title, n.content "
                + "FROM news n where newsgroup_id=16 and n.title LIKE '%' + ? + '%'";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Returns(rs.getInt(1),
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

    public void insertReturns(Returns r) {
        String sql = "INSERT INTO [dbo].[news]\n"
                + "           ([title]\n"
                + "           ,[image]\n"
                + "           ,[content]\n"
                + "           ,[newsgroup_id])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, r.getTitle());
            ps.setString(2, r.getImage());
            ps.setString(3, r.getContent());
            ps.setInt(4, r.getNewsgroup_id());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateReturns(Returns r) {
        String sql = "UPDATE [dbo].[news]\n"
                + "   SET [title] = ?\n"
                + "      ,[image] = ?\n"
                + "      ,[content] = ?\n"
                + " WHERE news_id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, r.getTitle());
            ps.setString(2, r.getImage());
            ps.setString(3, r.getContent());
            ps.setInt(4, r.getNews_id());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public int removeReturns(int id) {
        int n = 0;
        String sql = "delete from news where newsgroup_id = 16 and news_id= " + id;
        try {
            ps = connection.prepareStatement(sql);
            n = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return n;
    }
}
