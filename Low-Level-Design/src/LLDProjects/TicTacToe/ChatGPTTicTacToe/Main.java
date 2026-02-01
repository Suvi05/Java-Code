package LLDProjects.TicTacToe.ChatGPTTicTacToe;

import LLDProjects.TicTacToe.ChatGPTTicTacToe.MakeMoveStrategy.HumanMoveStrategy;
import LLDProjects.TicTacToe.ChatGPTTicTacToe.WinningStrategy.NormalWinningStrategy;
import LLDProjects.TicTacToe.ChatGPTTicTacToe.WinningStrategy.WinningStrategy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Board board = new Board(3);

        Player p1 = new Player("A", 'X', new HumanMoveStrategy());
        Player p2 = new Player("B", 'O', new HumanMoveStrategy());

        List<Player> players = Arrays.asList(p1, p2);

        TurnManager turnManager = new TurnManager(players);
        MoveHistory history = new MoveHistory();

        List<WinningStrategy> strategies =
                List.of(new NormalWinningStrategy());

        Game game = new Game(board, turnManager, history, strategies);

        Scanner sc = new Scanner(System.in);

        while (game.gameState == GameState.IN_PROGRESS) {
            System.out.println("Player " +
                    turnManager.currentPlayer().getSymbol() +
                    " enter row and col:");

            game.makeMove();
        }

        System.out.println("Game ended: " + game.gameState);
    }
}
