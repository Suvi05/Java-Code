package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.game;

import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.managers.TurnManager;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models.Board;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models.Dice;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models.Player;

public class Game {
    private final Board board;
    private final Dice dice;
    private final TurnManager turnManager;
    private GameState gameState = GameState.NOT_STARTED;

    public Game(Board board, Dice dice, TurnManager turnManager) {
        this.board = board;
        this.dice = dice;
        this.turnManager = turnManager;
    }

    public void start() {

        gameState = GameState.IN_PROGRESS;

        while (gameState == GameState.IN_PROGRESS) {

            Player currentPlayer = turnManager.getCurrentPlayer();
            int diceValue = dice.roll();

            System.out.println(
                    currentPlayer.getName() + " rolled: " + diceValue
            );

            board.applyMove(currentPlayer, diceValue);

            System.out.println(
                    currentPlayer.getName() +
                            " is at position " +
                            currentPlayer.getCurrentPosition()
            );

            if (board.hasPlayerWon(currentPlayer)) {
                System.out.println(
                        "🏆 Winner is: " + currentPlayer.getName()
                );
                gameState = GameState.ENDED;
                break;
            }

            turnManager.moveToNextPlayer(diceValue);
        }
    }
}
