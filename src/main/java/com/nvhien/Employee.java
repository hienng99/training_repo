package com.nvhien;

public class Employee {
    private double coefficientsSalary;
    private long basePay;
    private int dayOff;
    private int otAmount;

    public Employee(double coefficientsSalary, long basePay, int dayOff, int otAmount) {
        this.coefficientsSalary = coefficientsSalary;
        this.basePay = basePay;
        this.dayOff = dayOff;
        this.otAmount = otAmount;
    }

    public long getSalary() {
        return (long) Math.ceil(this.coefficientsSalary * this.basePay);
    }

    public long getSalaryWithDayOff() {
        return (long) Math.ceil(this.getSalary() - this.dayOff * (this.getSalary() / 30));
    }

    public long getSalaryWithOT() {
        return (long) Math.ceil(this.getSalary() + this.otAmount * 15);
    }
}
