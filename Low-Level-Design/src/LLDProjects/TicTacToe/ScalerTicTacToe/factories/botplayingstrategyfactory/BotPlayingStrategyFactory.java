package LLDProjects.TicTacToe.ScalerTicTacToe.factories.botplayingstrategyfactory;

import LLDProjects.TicTacToe.ScalerTicTacToe.models.BotDifficultyLevel;
import LLDProjects.TicTacToe.ScalerTicTacToe.strategies.botplayingstrategies.BotPlayingStrategy;
import LLDProjects.TicTacToe.ScalerTicTacToe.strategies.botplayingstrategies.RandomBotPlayingStrategy;

import static LLDProjects.TicTacToe.ScalerTicTacToe.models.BotDifficultyLevel.*;

public class BotPlayingStrategyFactory {
    public BotPlayingStrategy createBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel) {

//        BotPlayingStrategy strategy = null;
//
//        switch (difficultyLevel) {
//            case EASY ->
//        }

        return switch (difficultyLevel) {
            case EASY, MEDIUM, HARD -> new RandomBotPlayingStrategy();
        };
    }
}
