package LLDProjects.SnakeAndLadders.MySnakeAndLadders.models;

import java.util.List;

public class TurnManager {
    //This will check if a player can take a move or not?

    private List<Player> players;
    private int currentIndex = 0;

    public TurnManager(List<Player> players) {
        this.players = players;
    }

    public Player getCurrentPlayer() {
        return players.get(currentIndex);
    }

    public void moveToNextPlayer(int diceValue) {

        // If dice output is 6, same player gets another turn
        if (diceValue == 6) {
            return;
        }

        // Otherwise move to next player
        currentIndex = (currentIndex + 1) % players.size();
    }
}
