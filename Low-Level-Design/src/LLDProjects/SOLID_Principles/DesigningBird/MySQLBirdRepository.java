package LLDProjects.SOLID_Principles.DesigningBird;

import java.util.ArrayList;
import java.util.List;

public class MySQLBirdRepository implements BirdRepository {
    BirdRepository birdRepository;

    MySQLBirdRepository(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }

    ArrayList<Bird> birdList = new ArrayList<>();

    @Override
    public void save(Bird bird) {
        birdList.add(bird);
    }

    @Override
    public Bird findByName(String name) {
        return birdRepository.findByName(name);
    }

    @Override
    public List<Bird> findAll() {
        return birdList;
    }
}
