package Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod;

import Lectures.DesingPatterns.CreationalDP.Factory.ChatGPT.FactoryMethod.LightTheme.LightThemeFactory;

public class Client {
    public static void main(String[] args) {
        ThemeFactory themeFactory = new LightThemeFactory();
        Button b = themeFactory.createButton();
        TextBox t = themeFactory.createTextBox();
        b.render();
        t.render();
    }
}
/*
Yahan kya ho raha hai?

Haan, new hai ✔️

Par tu PRODUCT ko new nahi kar raha

Tu sirf FACTORY choose kar raha hai

👉 Client ka decision:

“Aaj LIGHT theme chahiye”

❌ Client ye nahi bol raha:

new LightButton();
new LightTextBox();


🔥 Yahin decoupling start hoti hai

🔴 Line 2
Button b = themeFactory.createButton();

Yahan magic hai 🔥

Client ko nahi pata:

LightButton ka constructor

DarkButton exist karta hai ya nahi

Client sirf bol raha:

“Factory, mujhe button de”

👉 Product creation hide ho gaya

🔴 Line 3
TextBox t = themeFactory.createTextBox();


Same story:

Client ko concrete class ka naam tak nahi pata

Sirf abstraction use ho rahi hai

🔴 Line 4–5
b.render();
t.render();


👉 Polymorphism:

Light / Dark ka logic andar hi andar change ho jaata hai

Client untouched

🔑 AB CORE QUESTION: “new” kahaan gaya?
❌ Galat expectation

Factory Method ka matlab = client me new bilkul nahi hona chahiye

✅ Sahi samajh

Factory Method ka matlab = client me new PRODUCT nahi hona chahiye

🎯 Real Comparison (CLEAR DIFFERENCE)
❌ Without Factory Method
Button b = new LightButton();   // ❌ client coupled
TextBox t = new LightTextBox();

✅ With Factory Method
ThemeFactory f = new LightThemeFactory(); // OK
Button b = f.createButton();              // product hidden
 */