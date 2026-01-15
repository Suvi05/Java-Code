package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.LightTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.TextBox;

public class LightTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Light TextBox");
    }
}
