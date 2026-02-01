package LLDProjects.SnakeAndLadders.MySnakeAndLadders.controllers;

import LLDProjects.SnakeAndLadders.MySnakeAndLadders.models.*;
import LLDProjects.SnakeAndLadders.MySnakeAndLadders.strategies.diceRollingStrategies.Dice;
import lombok.Data;

public class Game {
    //This is the orchestrator and Builder class + Validations will also be done in build().
    private Player player;
    private Board board;
    private Dice dice;
    private Level level;
    private GameState gameState;

    private Game() {
    }

    public static GameBuilder getBuilder() {
        return new GameBuilder();
    }

    public void start() {
        gameState = GameState.IN_PROGRESS;
        while (gameState == GameState.IN_PROGRESS) {

            // 3️⃣ Decide whose turn
            TurnManager turnManager = null;
            Player currentPlayer = turnManager.getCurrentPlayer();

            // 4️⃣ Player plays turn (internally rolls dice)
            int diceValue = currentPlayer.playTurn(dice);

            // 5️⃣ Apply move on board
            board.applyMove(currentPlayer, diceValue);

            // 6️⃣ Check win condition
            if (board.hasPlayerWon(currentPlayer)) {
                gameState = GameState.ENDED;
                System.out.println(
                        "Game Over"
                );
                break;
            }

            // 7️⃣ Move to next player
            turnManager.moveToNextPlayer(diceValue);
        }
    }
    //This class will call the other functions

    public static class GameBuilder {
        private Player player;
        private Board board;
        private Dice dice;

        public Player getPlayer() {
            return player;
        }

        public GameBuilder setPlayer(int player) {
            return this;
        }

        public Board getBoard() {
            return board;
        }

        public GameBuilder setBoardSize(int boardSize) {
            return this;
        }

        public Dice getDice() {
            return dice;
        }

        public GameBuilder setDice(int sizeOfDice) {
            return this;
        }

        public Level getLevel() {
            return level;
        }

        public GameBuilder setLevel(Level level) {
            this.level = level;
            return this;
        }

        private Level level;


        public Game build() {
            //Here game validations will be done
            Game game = new Game();
            game.board = this.board;
            //will copy other values similarly.
            return game;
        }
    }
}
