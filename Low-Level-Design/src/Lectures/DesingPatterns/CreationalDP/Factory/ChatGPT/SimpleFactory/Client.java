package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Button b = ThemeFactory.createButton("LIGHT");
        TextBox t = ThemeFactory.createTextBox("DARK");
        b.render();
        t.render();
    }
}
