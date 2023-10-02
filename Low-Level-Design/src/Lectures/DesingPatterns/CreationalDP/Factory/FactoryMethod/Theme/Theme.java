package Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme;

//Step 1: Create Parent Class
//Step 4: Add Factory Methods
public abstract class Theme {
    private String name;
    private String lightColor;
    private String authorName;

    //Factory Of Factories
    public abstract ThemeComponentFactory createComponentFactory();
    //This one is factory method in main class to give the corresponding object of Abstract Factory Class
}

//Factory is preventing us from calling the Constructor Directly