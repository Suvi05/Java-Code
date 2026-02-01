package LLDProjects.SnakeAndLadders.MySnakeAndLadders.strategies.diceRollingStrategies;

import java.util.Random;

public class NormalDice implements Dice {

    @Override
    public int diceRolled() {
        Random r = new Random(6);
        return r.nextInt(6);
    }
}
