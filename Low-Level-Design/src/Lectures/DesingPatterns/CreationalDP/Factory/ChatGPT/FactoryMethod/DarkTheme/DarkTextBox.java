package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.DarkTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.TextBox;

public class DarkTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Dark TextBox");
    }
}
