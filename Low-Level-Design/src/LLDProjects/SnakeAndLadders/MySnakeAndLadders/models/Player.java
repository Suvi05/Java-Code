package LLDProjects.SnakeAndLadders.MySnakeAndLadders.models;

import LLDProjects.SnakeAndLadders.MySnakeAndLadders.strategies.diceRollingStrategies.Dice;
import LLDProjects.SnakeAndLadders.MySnakeAndLadders.strategies.diceRollingStrategies.NormalDice;

public class Player {
    String name;
    private int currentPosition = 0;
    Colour colour;

    public int playTurn(Dice dice) {
        int result = dice.diceRolled();
        return result;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int position) {
        this.currentPosition = position;
    }

    public String getName() {
        return name;
    }
}
