package LLDProjects.TicTacToe.ChatGPTTicTacToe;

import LLDProjects.TicTacToe.ChatGPTTicTacToe.MakeMoveStrategy.MakeMoveStrategy;
import lombok.Getter;

public class Player {
    // 🔑 REQUIRED
    @Getter
    private char symbol;
    private MakeMoveStrategy strategy;

    public Player(String name, char symbol, MakeMoveStrategy strategy) {
        this.symbol = symbol;
        this.strategy = strategy;
    }

    public Move makeMove(Board board) {
        return strategy.makeMove(board, this);
    }
}
