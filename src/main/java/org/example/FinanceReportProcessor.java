package org.example;
import java.util.ArrayList;

public class FinanceReportProcessor {
    FinanceReportProcessor() {}

    public static FinanceReport searchName(FinanceReport FR, String symbol) {
        int count = -1;
        int size = 0;
        for (int i = 0; i < FR.NumberOfPayments(); i++) {
            if (FR.getAccess(i).getName().startsWith(symbol)) {
                size++;
            }
        }
        Payment[] pay = new Payment[size];
        for (int i = 0; i < FR.NumberOfPayments(); i++) {
            if (FR.getAccess(i).getName().startsWith(symbol)) {
                count++;
                pay[count] = new Payment();
                pay[count].setName(FR.getAccess(i).getName());
                pay[count].setAmount(FR.getAccess(i).getAmount());
            }
        }
        return new FinanceReport(pay);
    }
    public static FinanceReport lessSize(FinanceReport FR, int size) {
        int count = -1;
        int sizearr = 0;
        for (int i = 0; i < FR.NumberOfPayments(); i++) {
            if (FR.getAccess(i).getAmount() < size) {
                sizearr++;
            }
        }
        Payment[] pay = new Payment[sizearr];
        for (int i = 0; i < FR.NumberOfPayments(); i++) {
            if (FR.getAccess(i).getAmount() < size) {
                count++;
                pay[count] = new Payment();
                pay[count].setName(FR.getAccess(i).getName());
                pay[count].setAmount(FR.getAccess(i).getAmount());
            }
        }
        return new FinanceReport(pay);
    }
}
