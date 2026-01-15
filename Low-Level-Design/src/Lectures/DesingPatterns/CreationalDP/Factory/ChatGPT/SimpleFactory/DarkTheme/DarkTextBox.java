package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.DarkTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.TextBox;

public class DarkTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Dark TextBox");
    }
}
