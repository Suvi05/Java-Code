package LLDProjects.SOLID_Principles.DesigningBird;

import java.util.List;

public interface BirdRepository {
    void save(Bird bird);

    Bird findByName(String name);

    List<Bird> findAll();
}
