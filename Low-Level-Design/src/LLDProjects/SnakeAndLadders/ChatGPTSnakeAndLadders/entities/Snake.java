package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.entities;

public class Snake extends BoardEntity {

    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public int apply() {
        return end;
    }
}
