package org.example;
import java.util.ArrayList;

public class FinanceReportProcessor {
    public static FinanceReport searchName(FinanceReport FR, String symbol) {
        ArrayList<Payment> list = new ArrayList<Payment>();
        for (int i = 0; i < FR.NumberOfPayments(); i++) {
            if(FR.getAccess(i).getName().startsWith(symbol)) {
                list.add(FR.getAccess(i));
            }
        }
        return new FinanceReport(list.toArray(new Payment[0]));
    }
    public static FinanceReport lessSize(FinanceReport FR, int size) {
        ArrayList<Payment> list = new ArrayList<Payment>();
        for (int i = 0; i < FR.NumberOfPayments(); i++) {
            if(FR.getAccess(i).getAmount() < size) {
                list.add(FR.getAccess(i));
            }
        }
        return new FinanceReport(list.toArray(new Payment[0]));
    }
}
