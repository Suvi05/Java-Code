package Lectures.DesingPatterns.StructuralDP.Facade.After;

import Lectures.DesingPatterns.StructuralDP.Facade.After.SubsystemClasses.Lights;
import Lectures.DesingPatterns.StructuralDP.Facade.After.SubsystemClasses.SoundSystem;
import Lectures.DesingPatterns.StructuralDP.Facade.After.SubsystemClasses.StreamingService;
import Lectures.DesingPatterns.StructuralDP.Facade.After.SubsystemClasses.TV;

public class HomeTheatreFacade {
    private final TV tv;
    private final SoundSystem soundSystem;
    private final StreamingService streamingService;
    private final Lights lights;

    public HomeTheatreFacade() {
        this.tv = new TV();
        this.soundSystem = new SoundSystem();
        this.streamingService = new StreamingService();
        this.lights = new Lights();
    }

    /**
     * High-level operation exposed to client
     */
    public void watchMovie(String movie) {
        tv.on();

        soundSystem.on();
        soundSystem.setVolume(15);

        lights.dim();

        streamingService.login();
        streamingService.playMovie(movie);
    }
}
