package LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.models;

import LLDProjects.SnakeAndLadders.ChatGPTSnakeAndLadders.entities.BoardEntity;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private final int size;
    private final Map<Integer, BoardEntity> entities = new HashMap<>();

    public Board(int size) {
        this.size = size;
    }

    public int getWinningPosition() {
        return size * size;
    }

    public void addEntity(BoardEntity entity) {
        entities.put(entity.getStart(), entity);
    }

    public void applyMove(Player player, int diceValue) {

        // Player must start with 1 or 6
        if (!player.hasStarted()) {
            if (diceValue == 1 || diceValue == 6) {
                player.startGame();
            } else {
                return;
            }
        }

        int nextPos = player.getCurrentPosition() + diceValue;

        if (nextPos > getWinningPosition()) {
            return;
        }

        if (entities.containsKey(nextPos)) {
            nextPos = entities.get(nextPos).apply();
        }

        if (nextPos < 0) {
            nextPos = 0;
        }

        player.setCurrentPosition(nextPos);
    }

    public boolean hasPlayerWon(Player player) {
        return player.getCurrentPosition() == getWinningPosition();
    }
}
