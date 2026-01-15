package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.DarkTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.Button;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Dark Button");
    }
}
