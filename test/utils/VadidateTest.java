/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package utils;

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
public class VadidateTest {

    public VadidateTest() {
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
     * Test of checkGmail method, of class Vadidate.
     */
    @Test

    public void testCheckGmail() {
        System.out.println("checkGmail");
        String gmail = ""; // example@gmail.com True | example@gmail False | @gmail.com False | example!@gmail.com False
        Vadidate instance = new Vadidate();
        boolean expResult = false;
        boolean result = instance.checkGmail(gmail);
        assertEquals(expResult, result);
        if (result == expResult) {
            System.out.println("Test case 'testCheckGmail' passed. Result: " + result);
        } else {
            System.out.println("Test case 'testCheckGmail' failed. Result: " + result);
        }
    }

    /**
     * Test of checkPassword method, of class Vadidate.
     */
    @Test
    // Input and expected to test 
    // aBcD1 false | abcABC123 false | 12345 false | abcdef false | ABCD1234 false 
    // abcd@#$% false | Abcd1234@ true | abcA1@ true | "" false
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "Abcd1234@";
        Vadidate instance = new Vadidate();
        boolean expResult = true;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        if (result == expResult) {
            System.out.println("Test case 'testCheckPassword' passed. Result: " + result);
        } else {
            System.out.println("Test case 'testCheckPassword' failed. Result: " + result);
        }
    }

    /**
     * Test of checkPhone method, of class Vadidate.
     */
    @Test

    //1234567890 true | 12a3456789 false | 123-456-7890 false | empty "" false
    public void testCheckPhone() {
        System.out.println("checkPhone");
        String str = "1234567890";
        Vadidate instance = new Vadidate();
        boolean expResult = true;
        boolean result = instance.checkPhone(str);
        assertEquals(expResult, result);
        if (result == expResult) {
            System.out.println("Test case 'testCheckPhone' passed. Result: " + result);
        } else {
            System.out.println("Test case 'testCheckPhone' failed. Result: " + result);
        }
    }

    /**
     * Test of checkAccountAdmin method, of class Vadidate.
     */
    @Test

    // exist username : dovandat false | new username: username123 true | empty false
    public void testCheckAccountAdmin() {
        System.out.println("checkAccountAdmin");
        String str = "dovandat";
        Vadidate instance = new Vadidate();
        boolean expResult = false;
        boolean result = instance.checkAccountAdmin(str);
        assertEquals(expResult, result);
        if (result == expResult) {
            System.out.println("Test case 'testCheckAccountAdmin' passed. Result: " + result);
        } else {
            System.out.println("Test case 'testCheckAccountAdmin' failed. Result: " + result);
        }
    }

    /**
     * Test of checkAccountCustomer method, of class Vadidate.
     */
    @Test

    // exist username : dovandat false | new username: username123 true | empty false
    public void testCheckAccountCustomerTrue() {
        System.out.println("checkAccountCustomer");
        String str = "username123";
        Vadidate instance = new Vadidate();
        boolean expResult = false;
        boolean result = instance.checkAccountCustomer(str);
        assertEquals(expResult, result);
        if (result == expResult) {
            System.out.println("Test case 'testCheckAccountCustomer' passed. Result: " + result);
        } else {
            System.out.println("Test case 'testCheckAccountCustomer' failed. Result: " + result);
        }
    }
    
    @Test

    // exist username : dovandat false | new username: username123 true | empty false
    public void testCheckAccountCustomerEmpty() {
        System.out.println("checkAccountCustomer");
        String str = "";
        Vadidate instance = new Vadidate();
        boolean expResult = false;
        boolean result = instance.checkAccountCustomer(str);
        assertEquals(expResult, result);
        if (result == expResult) {
            System.out.println("Test case 'testCheckAccountCustomer' passed. Result: " + result);
        } else {
            System.out.println("Test case 'testCheckAccountCustomer' failed. Result: " + result);
        }
    }
    
        public void testCheckAccountCustomerFalse() {
        System.out.println("checkAccountCustomer");
        String str = "dovandat";
        Vadidate instance = new Vadidate();
        boolean expResult = false;
        boolean result = instance.checkAccountCustomer(str);
        assertEquals(expResult, result);
        if (result == expResult) {
            System.out.println("Test case 'testCheckAccountCustomer' passed. Result: " + result);
        } else {
            System.out.println("Test case 'testCheckAccountCustomer' failed. Result: " + result);
        }
    }

    /**
     * Test of checkAccountGmailCustomer method, of class Vadidate.
     */
    @Test

    // dovandat1611@gmail.com false | sample@gmail.com true | "" false 
    // @gmail.com false |  sample false | sample!@gmail.com false
    public void testCheckAccountGmailCustomer() {
        System.out.println("checkAccountGmailCustomer");
        String str = "dovandat1611@gmail.com";
        Vadidate instance = new Vadidate();
        boolean expResult = false;
        boolean result = instance.checkAccountGmailCustomer(str);
        assertEquals(expResult, result);
        if (result == expResult) {
            System.out.println("Test case 'testCheckAccountGmailCustomer' passed. Result: " + result);
        } else {
            System.out.println("Test case 'testCheckAccountGmailCustomer' failed. Result: " + result);
        }
    }

    /**
     * Test of checkAccountGmailAdmin method, of class Vadidate.
     */
    @Test

    // dovandat1611@gmail.com false | sample@gmail.com true | "" false 
    // @gmail.com false |  sample false | sample!@gmail.com false
    public void testCheckAccountGmailAdmin() {
        System.out.println("checkAccountGmailAdmin");
        String str = "";
        Vadidate instance = new Vadidate();
        boolean expResult = false;
        boolean result = instance.checkAccountGmailAdmin(str);
        assertEquals(expResult, result);
        if (result == expResult) {
            System.out.println("Test case 'testCheckAccountGmailAdmin' passed. Result: " + result);
        } else {
            System.out.println("Test case 'testCheckAccountGmailAdmin' failed. Result: " + result);
        }
    }

    /**
     * Test of convertMonthNumberToName method, of class Vadidate.
     */
    
    @Test
    // 0 13 "" 5 10 -1 
    public void testConvertMonthNumberToName() {
        System.out.println("convertMonthNumberToName");
        String monthNumber = "5";
        Vadidate instance = new Vadidate();
        String expResult = "MAY";
        String result = instance.convertMonthNumberToName(monthNumber);
        assertEquals(expResult, result);
    }
}
