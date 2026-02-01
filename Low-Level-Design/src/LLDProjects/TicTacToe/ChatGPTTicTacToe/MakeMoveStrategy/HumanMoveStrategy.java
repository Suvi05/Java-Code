package LLDProjects.TicTacToe.ChatGPTTicTacToe.MakeMoveStrategy;

import LLDProjects.TicTacToe.ChatGPTTicTacToe.Board;
import LLDProjects.TicTacToe.ChatGPTTicTacToe.Move;
import LLDProjects.TicTacToe.ChatGPTTicTacToe.Player;

import java.util.Scanner;

public class HumanMoveStrategy implements MakeMoveStrategy {
    private Scanner sc = new Scanner(System.in);

    public Move makeMove(Board board, Player player) {
        int r = sc.nextInt();
        int c = sc.nextInt();
        return new Move(r, c, player);
    }
}
