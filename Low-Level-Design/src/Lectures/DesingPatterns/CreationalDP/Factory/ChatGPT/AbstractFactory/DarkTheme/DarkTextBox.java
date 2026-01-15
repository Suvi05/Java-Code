package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.DarkTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.TextBox;

public class DarkTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Dark TextBox");
    }
}
