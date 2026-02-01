package LLDProjects.TicTacToe.ChatGPTTicTacToe;

public class Move {
    private int row;
    private int col;
    private Player player;

    public Move(int row, int col, Player player) {
        this.row = row;
        this.col = col;
        this.player = player;
    }

    public int getRow() {        // 🔑 MUST be public
        return row;
    }

    public int getCol() {        // 🔑 MUST be public
        return col;
    }

    public Player getPlayer() {  // 🔑 MUST be public
        return player;
    }
}
