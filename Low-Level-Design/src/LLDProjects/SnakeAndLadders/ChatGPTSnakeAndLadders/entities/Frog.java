package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.entities;

import java.util.Random;

public class Frog extends BoardEntity {
    private final Random random = new Random();

    public Frog(int position) {
        super(position, position);
    }

    @Override
    public int apply() {
        int jump = random.nextInt(6) + 1;
        return random.nextBoolean() ? start + jump : start - jump;
    }
}
