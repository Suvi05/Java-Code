package LLDProjects.TicTacToe.ChatGPTTicTacToe;

public class Cell {
    private Character symbol; // null means empty

    boolean isEmpty() {
        return symbol == null;
    }

    Character getSymbol() {
        return symbol;
    }

    void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    void clear() {
        this.symbol = null;
    }
}