package LLDProjects.TicTacToe.ChatGPTTicTacToe.MakeMoveStrategy;

import LLDProjects.TicTacToe.ChatGPTTicTacToe.Board;
import LLDProjects.TicTacToe.ChatGPTTicTacToe.Move;
import LLDProjects.TicTacToe.ChatGPTTicTacToe.Player;

public interface MakeMoveStrategy {
    Move makeMove(Board board, Player player);
}
