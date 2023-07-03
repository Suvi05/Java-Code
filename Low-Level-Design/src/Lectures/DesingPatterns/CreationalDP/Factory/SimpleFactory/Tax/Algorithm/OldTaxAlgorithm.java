package Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.Algorithm;

import Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.SalaryDetails;

//Step 2: Create Concrete Classes
public class OldTaxAlgorithm implements TaxAlgorithm {

    @Override
    public double calculateTax(SalaryDetails salaryDetails) {
        return 0.4 * salaryDetails.getBasepay() + 0.3 * salaryDetails.getHra() + 0.2 * salaryDetails.getLta();
    }
}
