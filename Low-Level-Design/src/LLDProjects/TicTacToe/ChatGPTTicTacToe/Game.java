package LLDProjects.TicTacToe.ChatGPTTicTacToe;

import LLDProjects.TicTacToe.ChatGPTTicTacToe.WinningStrategy.WinningStrategy;

import java.util.List;

public class Game {
    Board board;
    TurnManager turnManager;
    MoveHistory moveHistory;
    List<WinningStrategy> winningStrategies;
    GameState gameState = GameState.IN_PROGRESS;

    Game(Board board,
         TurnManager turnManager,
         MoveHistory moveHistory,
         List<WinningStrategy> strategies) {

        this.board = board;
        this.turnManager = turnManager;
        this.moveHistory = moveHistory;
        this.winningStrategies = strategies;
    }

    void makeMove() {
        Player player = turnManager.currentPlayer();
        Move move = player.makeMove(board);

        board.applyMove(move);
        moveHistory.record(move);

        for (WinningStrategy strategy : winningStrategies) {
            if (strategy.checkWinner(board, move)) {
                gameState = GameState.WON;
                return;
            }
        }

        if (board.isFull()) {
            gameState = GameState.DRAW;
            return;
        }

        turnManager.moveNext();
    }

    void undo() {
        if (moveHistory.isEmpty()) return;

        Move last = moveHistory.undo();
        board.undoMove(last);
        turnManager.rollback();
        gameState = GameState.IN_PROGRESS;
    }
}
