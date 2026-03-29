package LLDProjects.SOLID_Principles.DesigningBird;

public class Game {
    Flyable flyable;

    Game(Flyable flyable) {
        this.flyable = flyable;
    }

    void render() {
        this.flyable.fly();
    }
}
