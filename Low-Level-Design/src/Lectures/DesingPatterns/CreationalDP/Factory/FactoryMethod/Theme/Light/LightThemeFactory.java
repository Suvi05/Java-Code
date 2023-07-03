package Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Light;

import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Button;
import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Menu;
import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.ThemeComponentFactory;

public class LightThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Menu createMenu() {
        return new LightMenu();
    }
}
