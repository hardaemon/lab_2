package org.example;
import java.util.Objects;

public class Payment {
    private String name;
    private int date;
    private int month;
    private int year;
    private int amount;

    Payment() {
        name = "";
        date = 0;
        month = 0;
        year = 0;
        amount = 0;
    }

    Payment(String name, int date, int month, int year, int amount) {
    this.name = name;
    this.date = date;
    this.month = month;
    this.year = year;
    this.amount = amount;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getDate() { return date; }
    public void setDate(int date) { this.date = date; }

    public int getMonth() { return month; }
    public void setMonth(int month) { this.month = month; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    @Override
    public String toString() {
        int rubles = amount/100;
        int cent = amount - (amount/100) * 100;
        return String.format("     Плательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.\n", name, date, month, year, rubles, cent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment payment)) return false;
        return date == payment.date && month == payment.month && year == payment.year && amount == payment.amount && Objects.equals(name, payment.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name, date, month, year, amount); }
}
