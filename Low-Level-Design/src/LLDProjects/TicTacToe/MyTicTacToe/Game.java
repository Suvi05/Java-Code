package LLDProjects.TicTacToe.MyTicTacToe;

import LLDProjects.TicTacToe.MyTicTacToe.WinningStrategies.WinningStrategies;
import lombok.Data;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<WinningStrategies> winningStrategies;
    private int lastPlayerMovedIndex;
    private GameState gameState;

    private void start(){
        System.out.println("Let's the game begin : Player 1 will take the move first");
        //Here player one will be turn%n =1;
        //So the last turn will come to the BOT
    }
    private Cell makeMove(Cell cell){
        //
        return null;
    }

    private boolean checkWinner(Cell cell){
        //This will search the right strategy on the basis of cell filled.
        //If any corer is filled then we will go for CornerWinning stragery also, else we will stick to normal winning strategy
        return true;
    }
    private Player getNextPlayer(int turn){
        //if turn%n == 0 to n
        // then the person whose number will come after taking mod will take the chance to take move
        //if(turn%n==0 then BOT will take a move, else the rest of the players)
        return null;
    }
    private Cell undo(){
        //Code for Undo
        return null;
    }
    public static Builder getbuilder(){
        //Here we will call the build method
        return new Builder();
    }

    public static class Builder{
        private Board board;
        private List<Player> players;
        private List<WinningStrategies> winningStrategies;
        private int lastPlayerMovedIndex;
        private GameState gameState;

        //Getter and Setters with Return type as Game will be done
        public Game build(){
         //VALIDATIONS
            //Here we will do the validations here for Same Symbol for 2 players, invalid board size and all and will then create a GameBuilder's object.
            //Here we will copy the values of variables from Builder class to Game Class object
            return new Game();
        }
    }
}
