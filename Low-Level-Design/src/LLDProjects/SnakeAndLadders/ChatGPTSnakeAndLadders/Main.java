package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders;

import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.entities.Frog;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.entities.Ladder;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.entities.Snake;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.factories.DiceFactory;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.game.Game;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.managers.TurnManager;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models.Board;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models.Dice;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --- INPUT ---
        System.out.println("Enter board size:");
        int boardSize = sc.nextInt();

        System.out.println("Enter dice max value:");
        int diceMax = sc.nextInt();

        System.out.println("Enter number of players:");
        int n = sc.nextInt();

        List<Player> players = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter player name:");
            players.add(new Player(sc.next()));
        }

        // --- CREATION ---
        Board board = new Board(boardSize);
        Dice dice = DiceFactory.createDice(diceMax);
        TurnManager turnManager = new TurnManager(players);

        // Sample entities (can be factory-driven)
        board.addEntity(new Snake(14, 7));
        board.addEntity(new Ladder(3, 22));
        board.addEntity(new Frog(10));

        // --- GAME ---
        Game game = new Game(board, dice, turnManager);
        game.start();
    }
}
