package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.LightTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.Button;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.TextBox;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.ThemeFactory;

public class LightThemeFactory implements ThemeFactory {
    public Button createButton(){
        return new LightButton();
    }
    public TextBox createTextBox(){
        return new LightTextBox();
    }
}
