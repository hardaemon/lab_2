package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {
    @Test
    public void TestPayment1() {
        String expectedName = "";
        int expected = 0;
        Payment pay = new Payment();
        assertEquals(expectedName, pay.getName());
        assertEquals(expected, pay.getDate());
        assertEquals(expected, pay.getMonth());
        assertEquals(expected, pay.getYear());
        assertEquals(expected, pay.getAmount());
    }
    @Test
    public void TestPayment2() {
        String expectedName = "Danila";
        int expectedDate = 21;
        int expectedMonth = 3;
        int expectedYear = 2004;
        int expectedAmount = 100253;
        Payment pay = new Payment(expectedName, expectedDate, expectedMonth, expectedYear, expectedAmount);
        assertEquals(expectedName, pay.getName());
        assertEquals(expectedDate, pay.getDate());
        assertEquals(expectedMonth, pay.getMonth());
        assertEquals(expectedYear, pay.getYear());
        assertEquals(expectedAmount, pay.getAmount());
    }
    @Test
    public void TestToString() {
        String expectedName = "Danila";
        int expectedDate = 21;
        int expectedMonth = 3;
        int expectedYear = 2004;
        int expectedAmount = 100253;
        Payment pay = new Payment(expectedName, expectedDate, expectedMonth, expectedYear, expectedAmount);
        String expected = "     Плательщик: Danila, дата: 21.3.2004 сумма: 1002 руб. 53 коп.\n";
        assertEquals(expected, pay.toString());
        System.out.println(pay.toString());
    }
    @Test
    public void TestEquals() {
        String expectedName = "Danila";
        int expectedDate = 21;
        int expectedMonth = 3;
        int expectedYear = 2004;
        int expectedAmount = 100253;
        Payment pay = new Payment(expectedName, expectedDate, expectedMonth, expectedYear, expectedAmount);
        //проверка на true
        boolean expectedTrue = true;
        Payment pay2 = new Payment(expectedName, expectedDate, expectedMonth, expectedYear, expectedAmount);
        assertEquals(expectedTrue, pay.equals(pay2));
        //проверка на false
        boolean expectedFalse = false;
        String expectedName3 = "Danil";
        int expectedDate3 = 21;
        int expectedMonth3 = 3;
        int expectedYear3 = 2004;
        int expectedAmount3 = 100253;
        Payment pay3 = new Payment(expectedName3, expectedDate3, expectedMonth3, expectedYear3, expectedAmount3);
        assertEquals(expectedFalse, pay.equals(pay3));
    }
    @Test
    public void TestHashCode() {
        String expectedName = "Danila";
        int expectedDate = 21;
        int expectedMonth = 3;
        int expectedYear = 2004;
        int expectedAmount = 100253;
        Payment pay = new Payment(expectedName, expectedDate, expectedMonth, expectedYear, expectedAmount);
        //проверка на true
        String expectedName2 = "Danila";
        int expectedDate2 = 21;
        int expectedMonth2 = 3;
        int expectedYear2 = 2004;
        int expectedAmount2 = 100253;
        boolean hashCodeTrue = true;
        Payment pay2 = new Payment(expectedName2, expectedDate2, expectedMonth2, expectedYear2, expectedAmount2);
        assertEquals(hashCodeTrue, pay.hashCode()==pay2.hashCode());
        //проверка на false
        String expectedName3 = "Danil";
        int expectedDate3 = 21;
        int expectedMonth3 = 3;
        int expectedYear3 = 2004;
        int expectedAmount3 = 100253;
        boolean hashCodeFalse = false;
        Payment pay3 = new Payment(expectedName3, expectedDate3, expectedMonth3, expectedYear3, expectedAmount3);
        assertEquals(hashCodeFalse, pay.hashCode()==pay3.hashCode());
    }
}