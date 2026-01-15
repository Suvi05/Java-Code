package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.LightTheme.LightThemeFactory;

public class Client {
    public static void main(String[] args) {
        ThemeFactory themeFactory = new LightThemeFactory();
        Button b = themeFactory.createButton();
        TextBox t = themeFactory.createTextBox();
        b.render();
        t.render();
    }
}
//Abstract Factory product creation hide karta hai, factory creation nahi.
//DI use karenge to ye new bhi hat jaayega.