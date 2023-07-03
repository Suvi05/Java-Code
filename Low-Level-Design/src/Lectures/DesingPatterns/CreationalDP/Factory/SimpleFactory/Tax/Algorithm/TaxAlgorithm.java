package Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.Algorithm;

import Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.SalaryDetails;

//Step 1: Create Interface

public interface TaxAlgorithm {
    double calculateTax(SalaryDetails salaryDetails);
}
