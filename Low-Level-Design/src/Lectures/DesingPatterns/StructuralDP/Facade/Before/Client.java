package Lectures.DesingPatterns.StructuralDP.Facade.Before;

import Lectures.DesingPatterns.StructuralDP.Facade.Before.SubsystemClasses.Lights;
import Lectures.DesingPatterns.StructuralDP.Facade.Before.SubsystemClasses.SoundSystem;
import Lectures.DesingPatterns.StructuralDP.Facade.Before.SubsystemClasses.StreamingService;
import Lectures.DesingPatterns.StructuralDP.Facade.Before.SubsystemClasses.TV;

public class Client {
    public static void main(String[] args) {

        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        StreamingService streamingService = new StreamingService();
        Lights lights = new Lights();

        // Client ko sab kuch manually manage karna pad raha hai
        tv.on();

        soundSystem.on();
        soundSystem.setVolume(10);

        lights.dim();

        streamingService.login();
        streamingService.playMovie("Inception");
    }
}
/*
❌ PROBLEM:
Client ko poore system ke internals pata hone chahiye.
Agar sequence change hua ya naya step aaya → client change.

* Client tightly coupled to subsystems
* Too many method calls
* Hard to change sequence
* Poor readability
*/