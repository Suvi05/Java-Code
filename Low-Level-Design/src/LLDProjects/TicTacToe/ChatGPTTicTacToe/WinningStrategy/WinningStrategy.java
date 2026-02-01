package LLDProjects.TicTacToe.ChatGPTTicTacToe.WinningStrategy;

import LLDProjects.TicTacToe.ChatGPTTicTacToe.Board;
import LLDProjects.TicTacToe.ChatGPTTicTacToe.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move lastMove);
}
