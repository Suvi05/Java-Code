package Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax;

import lombok.Getter;

@Getter //It is an easy way to create Getters and Setters
public class SalaryDetails {
    private double basepay;
    private double hra;
    private double lta;

    SalaryDetails(double basepay, double hra, double lta) {
        this.basepay = basepay;
        this.hra = hra;
        this.lta = lta;
    }
}
