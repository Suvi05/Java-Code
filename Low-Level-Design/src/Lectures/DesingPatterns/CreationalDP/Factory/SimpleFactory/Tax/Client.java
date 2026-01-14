package Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax;

import Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.Algorithm.TaxAlgorithm;
import Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.Algorithm.TaxCalculatorFactory;

public class Client {
    public static void main(String[] args) {
        SalaryDetails salaryDetails = new SalaryDetails(100000, 20000, 15000);
        TaxAlgorithm taxAlgorithm = TaxCalculatorFactory.getTaxAlgorithm(TaxRegime.OLD);
        double tax = taxAlgorithm.calculateTax(salaryDetails);
        System.out.println("TAX : " + tax);
    }
}
