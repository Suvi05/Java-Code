package LLDProjects.TicTacToe.ScalerTicTacToe.strategies.botplayingstrategies;

import LLDProjects.TicTacToe.ScalerTicTacToe.models.Board;
import LLDProjects.TicTacToe.ScalerTicTacToe.models.Cell;
import LLDProjects.TicTacToe.ScalerTicTacToe.models.Move;
import LLDProjects.TicTacToe.ScalerTicTacToe.models.Player;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeNextMove(Board board, Player player) {

        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.isEmpty()) {
                    Move move = new Move();
                    move.setSymbol(player.getSymbol());
                    move.setPlayer(player);
                    move.setCell(cell);
                    return move;
                }
            }
        }
        return null;
    }
}
