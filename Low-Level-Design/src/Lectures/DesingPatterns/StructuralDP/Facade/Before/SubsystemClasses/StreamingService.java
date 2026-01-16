package Lectures.DesingPatterns.StructuralDP.Facade.Before.SubsystemClasses;

public class StreamingService {
    public void login() {
        System.out.println("Logged into streaming service");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}
