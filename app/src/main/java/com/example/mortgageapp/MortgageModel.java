package com.example.mortgageapp;

public class MortgageModel
{
    private double principle;
    private int amortization;
    private double interestrate;

    public MortgageModel(String p, String a, String i)
    {
        this.principle = p;
        this.amortization = a;
        this.interestrate = i;
    }

    public String computepayment()
    {
        double r = this.interestrate/120;
        double n = this.amortization * 12;
        double P = this.principle;
        double result = (r * P)/(1-Math.pow((1+r), -n));
        String payment = String.format("%,d", result);
        return payment;
    }
}



