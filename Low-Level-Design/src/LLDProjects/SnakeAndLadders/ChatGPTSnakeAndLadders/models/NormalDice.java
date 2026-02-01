package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models;

import java.util.Random;

public class NormalDice implements Dice {
    private final Random random = new Random();

    @Override
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
