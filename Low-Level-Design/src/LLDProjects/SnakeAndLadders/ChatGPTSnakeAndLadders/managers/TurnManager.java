package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.managers;

import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models.Player;

import java.util.List;

public class TurnManager {
    private final List<Player> players;
    private int currentIndex = 0;

    public TurnManager(List<Player> players) {
        this.players = players;
    }

    public Player getCurrentPlayer() {
        return players.get(currentIndex);
    }

    public void moveToNextPlayer(int diceValue) {
        if (diceValue == 6) return;
        currentIndex = (currentIndex + 1) % players.size();
    }
}
