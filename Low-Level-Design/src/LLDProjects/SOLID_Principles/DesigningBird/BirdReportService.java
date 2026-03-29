package LLDProjects.SOLID_Principles.DesigningBird;

import java.util.List;

public class BirdReportService {
    BirdRepository birdRepository;

    BirdReportService(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }

    void generateReport() {
        System.out.println("Print Birds");
        List<Bird> birds = birdRepository.findAll();
        for (Bird bird : birds) {
            System.out.println(bird.toString());
        }
    }
}
