package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.LightTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.TextBox;

public class LightTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Light TextBox");
    }
}
