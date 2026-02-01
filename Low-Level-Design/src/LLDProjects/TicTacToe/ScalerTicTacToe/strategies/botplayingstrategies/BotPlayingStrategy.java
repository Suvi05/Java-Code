package LLDProjects.TicTacToe.ScalerTicTacToe.strategies.botplayingstrategies;

import LLDProjects.TicTacToe.ScalerTicTacToe.models.Board;
import LLDProjects.TicTacToe.ScalerTicTacToe.models.Move;
import LLDProjects.TicTacToe.ScalerTicTacToe.models.Player;

public interface BotPlayingStrategy {
    Move makeNextMove(Board board, Player player);
}
