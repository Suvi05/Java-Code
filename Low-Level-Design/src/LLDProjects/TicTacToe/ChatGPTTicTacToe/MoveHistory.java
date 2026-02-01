package LLDProjects.TicTacToe.ChatGPTTicTacToe;

import java.util.Stack;

public class MoveHistory {
    Stack<Move> history = new Stack<>();

    void record(Move move) {
        history.push(move);
    }

    Move undo() {
        return history.pop();
    }

    boolean isEmpty() {
        return history.isEmpty();
    }
}
