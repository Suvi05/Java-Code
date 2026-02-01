package LLDProjects.TicTacToe.ChatGPTTicTacToe.WinningStrategy;

import LLDProjects.TicTacToe.ChatGPTTicTacToe.Board;
import LLDProjects.TicTacToe.ChatGPTTicTacToe.Move;

public class NormalWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {

        int r = move.getRow();
        int c = move.getCol();
        char sym = move.getPlayer().getSymbol();
        int n = board.getSize();

        boolean rowWin = true;
        boolean colWin = true;

        for (int i = 0; i < n; i++) {
            if (board.getSymbol(r, i) == null ||
                    board.getSymbol(r, i) != sym)
                rowWin = false;

            if (board.getSymbol(i, c) == null ||
                    board.getSymbol(i, c) != sym)
                colWin = false;
        }

        if (rowWin || colWin) return true;

        if (r == c) {
            boolean diag = true;
            for (int i = 0; i < n; i++) {
                if (board.getSymbol(i, i) == null ||
                        board.getSymbol(i, i) != sym)
                    diag = false;
            }
            if (diag) return true;
        }

        if (r + c == n - 1) {
            boolean anti = true;
            for (int i = 0; i < n; i++) {
                if (board.getSymbol(i, n - 1 - i) == null ||
                        board.getSymbol(i, n - 1 - i) != sym)
                    anti = false;
            }
            return anti;
        }

        return false;
    }
}
