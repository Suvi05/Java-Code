package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.entities;

public abstract class BoardEntity {
    protected int start;
    protected int end;

    public BoardEntity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public abstract int apply();
}
