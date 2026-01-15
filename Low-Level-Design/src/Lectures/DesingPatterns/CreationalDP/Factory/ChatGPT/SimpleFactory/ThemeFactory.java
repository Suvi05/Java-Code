package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.DarkTheme.DarkButton;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.DarkTheme.DarkTextBox;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.LightTheme.LightButton;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.LightTheme.LightTextBox;

public class ThemeFactory {
    static Button createButton(String theme) {
        if (theme.equals("LIGHT")) return new LightButton();
        else return new DarkButton();
    }

    static TextBox createTextBox(String theme) {
        if (theme.equals("LIGHT")) return new LightTextBox();
        else return new DarkTextBox();
    }
}
