package Lectures.DesingPatterns.StructuralDP.Facade.After.SubsystemClasses;

public class SoundSystem {
    public void on() {
        System.out.println("Sound system ON");
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}
