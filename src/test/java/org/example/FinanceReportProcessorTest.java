package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class FinanceReportProcessorTest {
    @Test
    public void TestSearchName() {
        //создаем объект FinanceReport
        int size = 4;
        Payment[] payArr = new Payment[size];
        String expectedName = "Danila";
        int expectedAmount = 100253;
        Payment pay0 = new Payment();
        pay0.setName(expectedName);
        pay0.setAmount(expectedAmount);

        String expectedName2 = "Anna";
        int expectedAmount2 = 16843;
        Payment pay1 = new Payment();
        pay1.setName(expectedName2);
        pay1.setAmount(expectedAmount2);

        String expectedName3 = "Andrey";
        int expectedAmount3 = 66593;
        Payment pay2 = new Payment();
        pay2.setName(expectedName3);
        pay2.setAmount(expectedAmount3);

        String expectedName4 = "Ivan";
        int expectedAmount4 = 593374;
        Payment pay3 = new Payment();
        pay3.setName(expectedName4);
        pay3.setAmount(expectedAmount4);

        payArr[0] = pay0;
        payArr[1] = pay1;
        payArr[2] = pay2;
        payArr[3] = pay3;
        FinanceReport FR = new FinanceReport(payArr);
        int expected = 2;
        Payment[] PaymentExpected = new Payment[expected];
        PaymentExpected[0] = new Payment();
        PaymentExpected[0].setName(expectedName2);
        PaymentExpected[0].setAmount(expectedAmount2);
        PaymentExpected[1] = new Payment();
        PaymentExpected[1].setName(expectedName3);
        PaymentExpected[1].setAmount(expectedAmount3);
        FinanceReport FRExpected = new FinanceReport(expected);
        FRExpected.setAccess(pay1, 0);
        FRExpected.setAccess(pay2, 1);
        assertEquals(FRExpected.getAccess(0), FinanceReportProcessor.searchName(FR,"A").getAccess(0));
        assertEquals(FRExpected.getAccess(1), FinanceReportProcessor.searchName(FR,"A").getAccess(1));
        assertEquals(FRExpected.NumberOfPayments(), FinanceReportProcessor.searchName(FR,"A").NumberOfPayments());
        assertEquals(FRExpected.getAuthor(), FinanceReportProcessor.searchName(FR,"A").getAuthor());
        assertEquals(FRExpected.getCreation_date(), FinanceReportProcessor.searchName(FR,"A").getCreation_date());
        assertEquals(FRExpected.getCreation_month(), FinanceReportProcessor.searchName(FR,"A").getCreation_month());
        assertEquals(FRExpected.getCreation_year(), FinanceReportProcessor.searchName(FR,"A").getCreation_year());
        assertEquals(FRExpected.toString(), FinanceReportProcessor.searchName(FR,"A").toString());
        System.out.println(FinanceReportProcessor.searchName(FR,"A").toString());
    }
    @Test
    public void TestLessSize() {
        //создаем объект FinanceReport
        int size = 4;
        Payment[] payArr = new Payment[size];
        String expectedName = "Danila";
        int expectedAmount = 100253;
        Payment pay0 = new Payment();
        pay0.setName(expectedName);
        pay0.setAmount(expectedAmount);

        String expectedName2 = "Anna";
        int expectedAmount2 = 16843;
        Payment pay1 = new Payment();
        pay1.setName(expectedName2);
        pay1.setAmount(expectedAmount2);

        String expectedName3 = "Andrey";
        int expectedAmount3 = 66593;
        Payment pay2 = new Payment();
        pay2.setName(expectedName3);
        pay2.setAmount(expectedAmount3);

        String expectedName4 = "Ivan";
        int expectedAmount4 = 593374;
        Payment pay3 = new Payment();
        pay3.setName(expectedName4);
        pay3.setAmount(expectedAmount4);

        payArr[0] = pay0;
        payArr[1] = pay1;
        payArr[2] = pay2;
        payArr[3] = pay3;
        FinanceReport FR = new FinanceReport(payArr);
        int expected = 3;
        Payment[] PaymentExpected = new Payment[expected];
        PaymentExpected[0] = new Payment();
        PaymentExpected[0].setName(expectedName);
        PaymentExpected[0].setAmount(expectedAmount);
        PaymentExpected[1] = new Payment();
        PaymentExpected[1].setName(expectedName2);
        PaymentExpected[1].setAmount(expectedAmount2);
        PaymentExpected[2] = new Payment();
        PaymentExpected[2].setName(expectedName3);
        PaymentExpected[2].setAmount(expectedAmount3);
        FinanceReport FRExpected = new FinanceReport(expected);
        FRExpected.setAccess(pay0, 0);
        FRExpected.setAccess(pay1, 1);
        FRExpected.setAccess(pay2, 2);
        assertEquals(FRExpected.getAccess(0), FinanceReportProcessor.lessSize(FR,111111).getAccess(0));
        assertEquals(FRExpected.getAccess(1), FinanceReportProcessor.lessSize(FR,111111).getAccess(1));
        assertEquals(FRExpected.getAccess(2), FinanceReportProcessor.lessSize(FR,111111).getAccess(2));
        assertEquals(FRExpected.NumberOfPayments(), FinanceReportProcessor.lessSize(FR,111111).NumberOfPayments());
        assertEquals(FRExpected.getAuthor(), FinanceReportProcessor.lessSize(FR,111111).getAuthor());
        assertEquals(FRExpected.getCreation_date(), FinanceReportProcessor.lessSize(FR,111111).getCreation_date());
        assertEquals(FRExpected.getCreation_month(), FinanceReportProcessor.lessSize(FR,111111).getCreation_month());
        assertEquals(FRExpected.getCreation_year(), FinanceReportProcessor.lessSize(FR,111111).getCreation_year());
        assertEquals(FRExpected.toString(), FinanceReportProcessor.lessSize(FR,111111).toString());
        System.out.println(FinanceReportProcessor.lessSize(FR,111111).toString());
    }
}