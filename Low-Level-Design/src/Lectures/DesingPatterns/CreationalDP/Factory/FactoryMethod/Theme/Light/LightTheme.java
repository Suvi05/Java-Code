package Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Light;

import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Theme;
import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.ThemeComponentFactory;

//Step 2: Create Sub Classes
public class LightTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        System.out.println("From Light Theme Component Factory");
        return new LightThemeFactory();
    }
}
