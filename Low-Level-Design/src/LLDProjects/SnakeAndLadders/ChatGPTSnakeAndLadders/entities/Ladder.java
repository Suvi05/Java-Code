package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.entities;

public class Ladder extends BoardEntity {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public int apply() {
        return end;
    }
}
