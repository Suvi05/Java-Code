package Lectures.DesingPatterns.StructuralDP.Facade.After;

public class Client {

    public static void main(String[] args) {

        HomeTheatreFacade theatre = new HomeTheatreFacade();

        // One method call = full movie setup
        theatre.watchMovie("Inception");
    }
}
/*
  ✅ CLEAN CLIENT

  Client only knows ONE class: HomeTheatreFacade
  Complexity is completely hidden.
 */