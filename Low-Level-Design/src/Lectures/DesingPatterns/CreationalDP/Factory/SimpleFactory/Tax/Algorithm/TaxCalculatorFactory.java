package Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.Algorithm;

import Lectures.DesingPatterns.CreationalDP.Factory.SimpleFactory.Tax.TaxRegime;

//Step 3: Create a Common Factory Class
//This class is only having 1 responsibility - Choose the correct Regime
public class TaxCalculatorFactory {
    public static TaxAlgorithm getTaxAlgorithm(TaxRegime taxRegime) {
        return switch (taxRegime) {
            case OLD -> new OldTaxAlgorithm();
            case NEW -> new NewTaxAlgorithm();
        };
    }
}
