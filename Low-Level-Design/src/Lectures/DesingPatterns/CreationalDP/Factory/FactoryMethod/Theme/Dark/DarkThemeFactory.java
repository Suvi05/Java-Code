package Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Dark;

import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Button;
import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Menu;
import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.ThemeComponentFactory;

public class DarkThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
