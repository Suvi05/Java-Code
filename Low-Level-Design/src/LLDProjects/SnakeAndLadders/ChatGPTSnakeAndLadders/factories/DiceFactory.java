package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.factories;

import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models.CustomDice;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models.Dice;
import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models.NormalDice;

public class DiceFactory {

    public static Dice createDice(int maxValue) {
        if (maxValue == 6) {
            return new NormalDice();
        }
        return new CustomDice(maxValue);
    }
}
