package Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax;

import Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.Algorithm.TaxCalculatorFactory;

public class TaxCalculator {
    public static Double calculateTax(TaxRegime taxRegime, SalaryDetails salaryDetails) {
        return TaxCalculatorFactory
                .getTaxAlgorithm(taxRegime)
                .calculateTax(salaryDetails);
    }
}
