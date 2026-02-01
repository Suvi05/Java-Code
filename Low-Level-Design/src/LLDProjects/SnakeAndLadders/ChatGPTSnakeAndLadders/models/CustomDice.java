package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models;

import java.util.Random;

public class CustomDice implements Dice {
    private final int max;
    private final Random random = new Random();

    public CustomDice(int max) {
        this.max = max;
    }

    @Override
    public int roll() {
        return random.nextInt(max) + 1;
    }
}
