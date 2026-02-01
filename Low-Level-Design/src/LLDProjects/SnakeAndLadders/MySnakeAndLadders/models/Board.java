package LLDProjects.SnakeAndLadders.MySnakeAndLadders.models;

public class Board {
    private int sizeOfBoard;

    public Board(int sizeOfBoard) {
        this.sizeOfBoard = sizeOfBoard;
    }

    public void generateBoard(int n, Level level) {
        //Here we will use Factory Design pattern to create different type of Boards
        //EASY LEVEL = x Ladders and y Snakes, where x>y
        //MEDIUM LEVEL = x Ladders and y Snakes, where x=y
        //HARD LEVEL = x Ladders and y Snakes, where x<y
    }

    public void applyMove(Player player, int diceValue) {

        int currentPos = player.getCurrentPosition();
        int newPos = currentPos + diceValue;

        // Boundary check: board ke bahar nahi ja sakte
        if (newPos > sizeOfBoard * sizeOfBoard) {
            return; // no move
        }

        // TODO: apply snake / ladder / frog here

        player.setCurrentPosition(newPos);
    }

    public boolean hasPlayerWon(Player player) {
        return player.getCurrentPosition() == sizeOfBoard * sizeOfBoard;
    }
}