package Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme;

//Step 1: Create Parent Class
//Step 4: Add Factory Methods
public abstract class Theme {
    private String name;
    private String lightColor;
    private String authorName;

    //Factory Of Factories
    public abstract ThemeComponentFactory createComponentFactory();

}
