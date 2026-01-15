package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.LightTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.Button;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.TextBox;
import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.ThemeFactory;

public class LightThemeFactory extends ThemeFactory {
    public Button createButton(){
        return new LightButton();
    }
    public TextBox createTextBox(){
        return new LightTextBox();
    }
}
