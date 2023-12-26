package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class FinanceReportTest {
    @Test
    public void TestFinanceReport1() {
        int size = 2;
        //создаем объект FinanceReport, с заданным размером массива
        FinanceReport FR = new FinanceReport(size);
        assertEquals(size, FR.NumberOfPayments());
        assertEquals(null, FR.getAuthor());
        assertEquals(0, FR.getCreation_date());
        assertEquals(0, FR.getCreation_month());
        assertEquals(0, FR.getCreation_year());
    }
    @Test
    public void TestFinanceReport2() {
        //создаем массив
        int size = 2;
        Payment[] payArr = new Payment[size];
        //создаем платеж 0
        String expectedName = "Danila";
        int expectedDate = 21;
        int expectedMonth = 3;
        int expectedYear = 2004;
        int expectedAmount = 100253;
        Payment pay0 = new Payment(expectedName, expectedDate, expectedMonth, expectedYear, expectedAmount);
        //создаем платеж 1
        String expectedName2 = "Anna";
        int expectedDate2 = 11;
        int expectedMonth2 = 10;
        int expectedYear2 = 2005;
        int expectedAmount2 = 16843;
        Payment pay1 = new Payment(expectedName2, expectedDate2, expectedMonth2, expectedYear2, expectedAmount2);
        //заполняем массив
        payArr[0] = pay0;
        payArr[1] = pay1;
        //создаем объект FinanceReport, с заданным массивом
        FinanceReport FR = new FinanceReport(payArr);
        assertEquals(size, FR.NumberOfPayments());
        assertEquals(pay0, FR.getAccess(0));
        assertEquals(pay1, FR.getAccess(1));
        assertEquals(null, FR.getAuthor());
        assertEquals(0, FR.getCreation_date());
        assertEquals(0, FR.getCreation_month());
        assertEquals(0, FR.getCreation_year());
    }
    @Test
    public void TestFinanceReport3() {
        //создаем объект FinanceReport, с заданным массивом
        int size = 2;
        Payment[] payArr = new Payment[size];
        String expectedName = "Danila";
        int expectedDate = 21;
        int expectedMonth = 3;
        int expectedYear = 2004;
        int expectedAmount = 100253;
        Payment pay0 = new Payment(expectedName, expectedDate, expectedMonth, expectedYear, expectedAmount);
        String expectedName2 = "Anna";
        int expectedDate2 = 11;
        int expectedMonth2 = 10;
        int expectedYear2 = 2005;
        int expectedAmount2 = 16843;
        Payment pay1 = new Payment(expectedName2, expectedDate2, expectedMonth2, expectedYear2, expectedAmount2);
        payArr[0] = pay0;
        payArr[1] = pay1;
        FinanceReport FR = new FinanceReport(payArr);
        FR.setAuthor("Danila");
        FR.setCreation_date(20);
        FR.setCreation_month(12);
        FR.setCreation_year(2023);
        //создаем копию объекта FinanceReport (конструктором копирования)
        FinanceReport copyFR = new FinanceReport(FR);
        assertEquals(payArr.length, copyFR.NumberOfPayments());
        assertEquals(FR.getAccess(0), copyFR.getAccess(0));
        assertEquals(FR.getAccess(1), copyFR.getAccess(1));
        assertEquals(FR.getAuthor(), copyFR.getAuthor());
        assertEquals(FR.getCreation_date(), copyFR.getCreation_date());
        assertEquals(FR.getCreation_month(), copyFR.getCreation_month());
        assertEquals(FR.getCreation_year(), copyFR.getCreation_year());
        FR.setAuthor("Aleksey");
        FR.getAccess(0).setAmount(10000);
        assertEquals(false, FR.equals(copyFR));
    }
    @Test
    public void TestToString() {
        //создаем объект FinanceReport
        int size = 2;
        Payment[] payArr = new Payment[size];
        String expectedName = "Danila";
        int expectedDate = 21;
        int expectedMonth = 3;
        int expectedYear = 2004;
        int expectedAmount = 100253;
        Payment pay0 = new Payment(expectedName, expectedDate, expectedMonth, expectedYear, expectedAmount);
        String expectedName2 = "Anna";
        int expectedDate2 = 11;
        int expectedMonth2 = 10;
        int expectedYear2 = 2005;
        int expectedAmount2 = 16843;
        Payment pay1 = new Payment(expectedName2, expectedDate2, expectedMonth2, expectedYear2, expectedAmount2);
        payArr[0] = pay0;
        payArr[1] = pay1;
        FinanceReport FR = new FinanceReport(payArr);
        FR.setAuthor("Danila");
        FR.setCreation_date(20);
        FR.setCreation_month(12);
        FR.setCreation_year(2023);
        String expected = "[Автор: Danila, дата: 20.12.2023, Платежи: [\n     Плательщик: Danila, дата: 21.3.2004 сумма: 1002 руб. 53 коп.\n     Плательщик: Anna, дата: 11.10.2005 сумма: 168 руб. 43 коп.\n]]";
        assertEquals(expected, FR.toString());
        System.out.println(FR.toString());
    }
}