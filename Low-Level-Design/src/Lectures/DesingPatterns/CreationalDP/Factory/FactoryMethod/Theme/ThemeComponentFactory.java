package Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme;

//Step 3: Create Component Factory - We have multiple Factory Methods in this class.
public interface ThemeComponentFactory {
    Button createButton();

    Menu createMenu();
}
