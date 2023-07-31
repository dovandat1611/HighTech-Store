/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.News;
import model.NewsView;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class DAONewsTest {

    DAONews dao = new DAONews();

    public DAONewsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNewsDetail method, of class DAONews.
     */
    @Test

    // 0 | 1 | -1 | "" | "String" 
    public void testGetNewsDetail() {
        System.out.println("getNewsDetail");
        int id = 1;
        DAONews instance = new DAONews();
        ArrayList<NewsView> expResult = dao.getNewsDetail(1);
        ArrayList<NewsView> result = instance.getNewsDetail(id);
        assertEquals(expResult.get(0).getNews_id(), result.get(0).getNews_id());
    }

    /**
     * Test of searchNews method, of class DAONews.
     */
    @Test

    // H | "" | "dsadasd"
    public void testSearchNews() {
        System.out.println("searchNews");
        String title = "H";
        DAONews instance = new DAONews();
        ArrayList<NewsView> expResult = dao.searchNews(title);
        ArrayList<NewsView> result = instance.searchNews(title);
        assertEquals(expResult.size(), result.size());
        for (int i = 0; i < expResult.size(); i++) {
            NewsView expectedNews = expResult.get(i);
            NewsView actualNews = result.get(i);
            assertEquals(expectedNews.getTitle(), actualNews.getTitle());
        }
    }

    /**
     * Test of searchNewsById method, of class DAONews.
     */
    @Test
    public void testSearchNewsById() {
        System.out.println("searchNewsById");
        String title = "";
        int newsgroup_id = 1;
        DAONews instance = new DAONews();
        ArrayList<NewsView> expResult = instance.searchNewsById(title, newsgroup_id);
        ArrayList<NewsView> result = instance.searchNewsById(title, newsgroup_id);
        assertEquals(expResult.size(), result.size());
        for (int i = 0; i < expResult.size(); i++) {
            NewsView expectedNews = expResult.get(i);
            NewsView actualNews = result.get(i);
            assertEquals(expectedNews.getNews_id(), actualNews.getNews_id());
        }
    }

    /**
     * Test of searchNewsGroup method, of class DAONews.
     */
    @Test
    public void testSearchNewsGroup() {
        System.out.println("searchNewsGroup");
        int id = 1;
        DAONews instance = new DAONews();
        ArrayList<NewsView> expResult = instance.searchNewsGroup(id);
        ArrayList<NewsView> result = instance.searchNewsGroup(id);
        assertEquals(expResult.get(0).getNews_id(), result.get(0).getNews_id());
    }

    /**
     * Test of getRelatedNews method, of class DAONews.
     */
    @Test
    public void testGetRelatedNews() {
        System.out.println("getRelatedNews");
        int id = 1;
        DAONews instance = new DAONews();
        ArrayList<NewsView> expResult = instance.getRelatedNews(id);
        ArrayList<NewsView> result = instance.getRelatedNews(id);
        assertEquals(expResult.size(), result.size());
        for (int i = 0; i < expResult.size(); i++) {
            NewsView expectedNews = expResult.get(i);
            NewsView actualNews = result.get(i);
            assertEquals(expectedNews.getNews_id(), actualNews.getNews_id());
        }
    }

//    /**
//     * Test of insertNews method, of class DAONews.
//     */
//    @Test
//    public void testInsertNews() {
//        System.out.println("insertNews");
//        News n = new News(0, 0, "ex.jpg", "ex", "ex", "", null, "ex", null);
//        DAONews instance = new DAONews();
//        instance.insertNews(n);
//    }
//    /**
//     * Test of updateNews method, of class DAONews.
//     */
//    @Test
//    public void testUpdateNews() {
//        System.out.println("updateNews");
//        News n = null;
//        DAONews instance = new DAONews();
//        instance.updateNews(n);
//    }
    /**
     * Test of deleteNews method, of class DAONews.
     */
    @Test
    public void testDeleteNews() {
        System.out.println("deleteNews");
        int id = 0;
        DAONews instance = new DAONews();
        int expResult = 0;
        int result = instance.deleteNews(id);
        assertEquals(expResult, result);
    }
}
