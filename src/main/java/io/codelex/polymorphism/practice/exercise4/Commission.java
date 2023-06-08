package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    private double employeeTotalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        employeeTotalSales = totalSales;
    }

    @Override
    public double pay() {
        double basePayment = super.pay();
        double commissionPayment = employeeTotalSales * commissionRate;
        employeeTotalSales = 0;
        return basePayment + commissionPayment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + employeeTotalSales;
        return result;
    }
}
