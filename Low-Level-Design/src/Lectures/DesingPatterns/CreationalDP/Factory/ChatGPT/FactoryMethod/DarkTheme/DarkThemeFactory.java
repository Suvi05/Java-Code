package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.DarkTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.Button;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.TextBox;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.ThemeFactory;

public class DarkThemeFactory extends ThemeFactory {
    public Button createButton() {
        return new DarkButton();
    }

    public TextBox createTextBox() {
        return new DarkTextBox();
    }
}
