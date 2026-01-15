package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.DarkTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.Button;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Dark Button");
    }
}
