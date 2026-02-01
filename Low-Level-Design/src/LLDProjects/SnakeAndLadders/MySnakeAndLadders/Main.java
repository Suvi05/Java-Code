package LLDProjects.SnakeAndLadders.MySnakeAndLadders;

import LLDProjects.SnakeAndLadders.MySnakeAndLadders.controllers.Game;
import LLDProjects.SnakeAndLadders.MySnakeAndLadders.models.Board;
import LLDProjects.SnakeAndLadders.MySnakeAndLadders.models.Colour;
import LLDProjects.SnakeAndLadders.MySnakeAndLadders.models.Level;
import LLDProjects.SnakeAndLadders.MySnakeAndLadders.models.TurnManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size with wich you want to create your Baord, choose between 7 to 20");
        int sizeOfBoard = sc.nextInt();
        Board board = new Board(sizeOfBoard);
        System.out.println("Enter the size of dice you want to play with, it can be at max 10% of the board you choose to play with");
        int sizeOfDice = sc.nextInt();
        System.out.println("Enter the number of Players you want to play");
        int numberOfPlayers = sc.nextInt();
        System.out.println("What level you want to choose to Play? EASY MEDIUM OR HARD?");
        //How to take this Enum input from the user?
        String level = sc.next();
        try {
            Level.valueOf(level.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid color. Choose from RED, BLUE, GREEN, YELLOW");
        }
        Game game = Game.getBuilder()
                .setPlayer(numberOfPlayers)
                .setBoardSize(sizeOfBoard)
                .setDice(sizeOfDice)
                .setLevel(Level.valueOf(level))
                .build();

        game.start();
    }
}
