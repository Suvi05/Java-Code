package LLDProjects.TicTacToe.ScalerTicTacToe.exceptions;

public class MultipleBotsException extends Exception {
    public MultipleBotsException() {
        super("A game cannot have more than one bot players.");
    }
}
