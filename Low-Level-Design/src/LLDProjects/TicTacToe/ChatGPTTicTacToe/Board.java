package LLDProjects.TicTacToe.ChatGPTTicTacToe;

public class Board {
    private int size;
    private Cell[][] cells;

    public Board(int size) {
        this.size = size;
        cells = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public int getSize() {           // 🔑 MUST be public
        return size;
    }

    public Character getSymbol(int r, int c) {  // 🔑 MUST be public
        return cells[r][c].getSymbol();
    }

    public void applyMove(Move move) {
        cells[move.getRow()][move.getCol()]
                .setSymbol(move.getPlayer().getSymbol());
    }

    public void undoMove(Move move) {
        cells[move.getRow()][move.getCol()].clear();
    }

    public boolean isFull() {
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                if (cell.isEmpty()) return false;
            }
        }
        return true;
    }
}
