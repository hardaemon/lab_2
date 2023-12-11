package org.example;

public class FinanceReport {
    private Payment[] array;
    private String author;
    private int creation_date;
    private int creation_month;
    private int creation_year;
    //конструктор, с заданным размером массива
    FinanceReport(int size) {
        array = new Payment[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Payment();
        }
    }
    //конструктор, с заданным массивом
    FinanceReport(Payment[] arr) {
        array = new Payment[arr.length];
        Payment temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            array[i] = temp;
        }
    }
    //конструктор копирования
    FinanceReport(FinanceReport otherFR) {
        this.array = new Payment[otherFR.array.length];
        Payment temp;
        for (int i = 0; i < otherFR.array.length; i++) {
            temp = otherFR.array[i];
            this.array[i] = temp;
        }
        this.author = otherFR.author;
        this.creation_date = otherFR.creation_date;
        this.creation_month = otherFR.creation_month;
        this.creation_year = otherFR.creation_year;
    }

    public int getCreation_date() { return creation_date; }
    public void setCreation_date(int creation_date) { this.creation_date = creation_date; }

    public int getCreation_month() { return creation_month; }
    public void setCreation_month(int creation_month) { this.creation_month = creation_month; }

    public int getCreation_year() { return creation_year; }
    public void setCreation_year(int creation_year) { this.creation_year = creation_year; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int NumberOfPayments() { return array.length; }

    public Payment getAccess(int i) { return array[i]; }
    public void setAccess(Payment pay, int i) { array[i] = pay; }

    public String toString() {
        String out1 = String.format("[Автор: %s, дата: %d.%d.%d, Платежи: [\n", author, creation_date, creation_month, creation_year);
        String out2 = "";
        int rubles = 0;
        int cent = 0;
        for (int i = 0; i < array.length; i++) {
            rubles = array[i].getAmount()/100;
            cent = array[i].getAmount() - (array[i].getAmount()/100) * 100;
            out2 = out2.concat(String.format("     Плательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.\n", array[i].getName(), array[i].getDate(), array[i].getMonth(), array[i].getYear(), rubles, cent));
        }
        return out1 + out2 + "]]";
    }
}
