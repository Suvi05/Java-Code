package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.LightTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.AbstractFactory.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Light Button");
    }
}
