package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.LightTheme;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.SimpleFactory.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Light Button");
    }
}
