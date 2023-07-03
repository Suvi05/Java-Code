package Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.Algorithm;

import Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.TaxRegime;

//Step 3: Create a Common Factory Class
//This class is only having 1 responsibility - Choose the correct Regime
public class TaxCalculatorFactory {
    public static TaxAlgorithm getTaxAlgorithm(TaxRegime taxRegime) {
        switch (taxRegime) {
            case OLD:
                return new OldTaxAlgorithm();
            case NEW:
                return new NewTaxAlgorithm();
        }
        throw new RuntimeException("Exception Occurred" + taxRegime);
    }
}
