package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.LightTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Light Button");
    }
}
