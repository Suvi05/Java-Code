package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models;

public class Player {
    private final String name;
    private int currentPosition = 0;
    private boolean hasStarted = false;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int position) {
        this.currentPosition = position;
    }

    public boolean hasStarted() {
        return hasStarted;
    }

    public void startGame() {
        this.hasStarted = true;
    }
}
