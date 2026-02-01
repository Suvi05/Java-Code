package LLDProjects.SnakeAndLadders.MySnakeAndLadders.strategies.diceRollingStrategies;

import java.util.Random;

public class CustomDice implements Dice {

    int diceNumber;

    public CustomDice(int diceNumber) {
        this.diceNumber = diceNumber;
    }

    Random r = new Random();

    @Override
    public int diceRolled() {
        int diceRolledResult = r.nextInt(diceNumber);
        return diceRolledResult;
    }
}
