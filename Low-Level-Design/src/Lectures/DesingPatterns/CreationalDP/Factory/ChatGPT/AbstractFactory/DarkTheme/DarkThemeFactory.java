package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.DarkTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.Button;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.TextBox;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.ThemeFactory;

public class DarkThemeFactory implements ThemeFactory {
    public Button createButton() {
        return new DarkButton();
    }

    public TextBox createTextBox() {
        return new DarkTextBox();
    }
}
