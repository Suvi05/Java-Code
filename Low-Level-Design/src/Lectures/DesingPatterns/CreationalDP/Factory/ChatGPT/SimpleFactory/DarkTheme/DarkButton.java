package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.DarkTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.Button;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Dark Button");
    }
}
