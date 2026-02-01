package LLDProjects.TicTacToe.MyTicTacToe.WinningStrategies;

import LLDProjects.TicTacToe.MyTicTacToe.Board;
import LLDProjects.TicTacToe.MyTicTacToe.Cell;
import LLDProjects.TicTacToe.MyTicTacToe.Move;

public interface WinningStrategies {
    boolean checkWinner(Board board, Move lastMove);
}
