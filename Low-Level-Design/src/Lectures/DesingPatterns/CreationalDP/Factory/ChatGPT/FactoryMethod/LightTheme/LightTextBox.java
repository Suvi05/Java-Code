package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.LightTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.TextBox;

public class LightTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Light TextBox");
    }
}
