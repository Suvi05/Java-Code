package LLDProjects.TicTacToe.ScalerTicTacToe.strategies.gamewinningstrategies;

import LLDProjects.TicTacToe.ScalerTicTacToe.models.Board;
import LLDProjects.TicTacToe.ScalerTicTacToe.models.Cell;
import LLDProjects.TicTacToe.ScalerTicTacToe.models.Player;

public interface GameWinningStrategy {
    boolean checkIfWon(Board board, Player player, Cell moveCell);
}
