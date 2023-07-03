package Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Dark;

import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Theme;
import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.ThemeComponentFactory;

//Step 2: Create Sub Classes
public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        System.out.println("From Dark Theme Component Factory");
        return new DarkThemeFactory();
    }
}
