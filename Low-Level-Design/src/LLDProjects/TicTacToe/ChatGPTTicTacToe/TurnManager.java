package LLDProjects.TicTacToe.ChatGPTTicTacToe;

import java.util.List;

public class TurnManager {
    List<Player> players;
    int index = 0;

    TurnManager(List<Player> players) {
        this.players = players;
    }

    Player currentPlayer() {
        return players.get(index);
    }

    void moveNext() {
        index = (index + 1) % players.size();
    }

    void rollback() {
        index = (index - 1 + players.size()) % players.size();
    }
}
