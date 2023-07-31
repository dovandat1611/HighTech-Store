/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import jakarta.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.ArrayList;
import javax.print.attribute.standard.DateTimeAtCompleted;
import model.Customer;
import model.TopLoyalCustomers;
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
public class DAOCustomerTest {

    public DAOCustomerTest() {
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
     * Test of getCustomer method, of class DAOCustomer.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        int id = 1;
        DAOCustomer instance = new DAOCustomer();
        ArrayList<Customer> expResult = instance.getCustomer(id);
        ArrayList<Customer> result = instance.getCustomer(id);
        assertEquals(expResult.get(0).getCustomer_id(), result.get(0).getCustomer_id());
    }

    /**
     * Test of getTotalPages method, of class DAOCustomer.
     */
    @Test
    public void testGetTotalPages() {
        System.out.println("getTotalPages");
        int pageSize = 10;
        DAOCustomer instance = new DAOCustomer();
        int expResult = 1;
        int result = instance.getTotalPages(pageSize);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchCustomer method, of class DAOCustomer.
     */
    @Test
    public void testSearchCustomer() {
        System.out.println("searchCustomer");
        String name = "Ð";
        DAOCustomer instance = new DAOCustomer();
        ArrayList<Customer> expResult = instance.searchCustomer(name);
        ArrayList<Customer> result = instance.searchCustomer(name);
        assertEquals(expResult.size(), result.size());
        for (int i = 0; i < expResult.size(); i++) {
            Customer expectedNews = expResult.get(i);
            Customer actualNews = result.get(i);
            assertEquals(expectedNews.getCustomer_id(), actualNews.getCustomer_id());
        }
    }

    /**
     * Test of getCustomerUsername method, of class DAOCustomer.
     */
    @Test
    public void testGetCustomerUsername() {
        System.out.println("getCustomerUsername");
        String username = "dovandat";
        DAOCustomer instance = new DAOCustomer();
        ArrayList<Customer> expResult = instance.getCustomerUsername(username);
        ArrayList<Customer> result = instance.getCustomerUsername(username);
        assertEquals(expResult.get(0).getUsername(), result.get(0).getUsername());
    }

    /**
     * Test of updateCustomerStatus method, of class DAOCustomer.
     */
    @Test
    public void testUpdateCustomerStatus() {
        System.out.println("updateCustomerStatus");
        int id = 1;
        String status = "Active";
        DAOCustomer instance = new DAOCustomer();
        instance.updateCustomerStatus(id, status);
    }

    /**
     * Test of checkLogin method, of class DAOCustomer.
     */
//    @Test
//    public void testCheckLogin() {
//        System.out.println("checkLogin");
//        String user = "dovandat";
//        String pass = "Dovandat123@";
//        DAOCustomer instance = new DAOCustomer();
//        Customer expResult = instance.checkLogin(user, pass);
//        Customer result = instance.checkLogin(user, pass);
//        assertEquals(expResult.getCustomer_id(), result.getCustomer_id());
//    }

    /**
     * Test of checkUsernameAndEmailExists method, of class DAOCustomer.
     */
    @Test
    public void testCheckUsernameAndEmailExists() {
        System.out.println("checkUsernameAndEmailExists");
        String username = "dovandat";
        String email = "dovandat1611@gmail.com";
        DAOCustomer instance = new DAOCustomer();
        boolean expResult = true;
        boolean result = instance.checkUsernameAndEmailExists(username, email);
        assertEquals(expResult, result);
    }

    //    /**
//     * Test of changePassword method, of class DAOCustomer.
//     */
//    @Test
//    public void testChangePassword() {
//        System.out.println("changePassword");
//        String newpass = "Dovandat123@";
//        String username = "dovandat123";
//        DAOCustomer instance = new DAOCustomer();
//        instance.changePassword(newpass, username);
//    }
//    /**
//     * Test of deleteCustomer method, of class DAOCustomer.
//     */
//    @Test
//    public void testDeleteCustomer() {
//        System.out.println("deleteCustomer");
//        int id = 1;
//        DAOCustomer instance = new DAOCustomer();
//        int expResult = 0;
//        int result = instance.deleteCustomer(id);
//        assertEquals(expResult, result);
//    }
//    /**
//     * Test of uploadImageCustomer method, of class DAOCustomer.
//     */
//    @Test
//    public void testUploadImageCustomer() {
//        System.out.println("uploadImageCustomer");
//        String image = "";
//        int customer_id = 0;
//        DAOCustomer instance = new DAOCustomer();
//        instance.uploadImageCustomer(image, customer_id);
//    }
//    /**
//     * Test of insertGuestCustomer method, of class DAOCustomer.
//     */
//    @Test
//    public void testInsertGuestCustomer() {
//        System.out.println("insertGuestCustomer");
//        String name = "";
//        String phone = "";
//        String gmail = "";
//        boolean gender = false;
//        String address = "";
//        String username = "";
//        String password = "";
//        String status = "";
//        DAOCustomer instance = new DAOCustomer();
//        instance.insertGuestCustomer(name, phone, gmail, gender, address, username, password, status);
//        
//    }
    //    /**
//     * Test of insertCustomer method, of class DAOCustomer.
//     */
//    @Test
//    public void testInsertCustomer() {
//        System.out.println("insertCustomer");
//        Customer cus = null;
//        DAOCustomer instance = new DAOCustomer();
//        instance.insertCustomer(cus);
//    }
//    
//    /**
//     * Test of updateCustomer method, of class DAOCustomer.
//     */
//    @Test
//    public void testUpdateCustomer() {
//        System.out.println("updateCustomer");
//        Customer cus = null;
//        DAOCustomer instance = new DAOCustomer();
//        instance.updateCustomer(cus);
//    }
//    /**
//     * Test of editCustomer method, of class DAOCustomer.
//     */
//    @Test
//    public void testEditCustomer() {
//        System.out.println("editCustomer");
//        String name = "";
//        String phone = "";
//        Date dob = null;
//        String gmail = "";
//        boolean gender = false;
//        String address = "";
//        int customer_id = 0;
//        DAOCustomer instance = new DAOCustomer();
//        instance.editCustomer(name, phone, dob, gmail, gender, address, customer_id);
//    }    
}
