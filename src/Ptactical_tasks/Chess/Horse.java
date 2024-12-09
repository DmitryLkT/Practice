package Ptactical_tasks.Chess;

public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(!chessBoard.checkPos(line) || !chessBoard.checkPos(column) ||
                !chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn)) {
            return false;
        }

        if(line == toLine && column == toColumn) {
            return false;
        }

        if(!movementFigure(chessBoard, line, column, toLine, toColumn)) {
            return false;
        }

        int hLine = Math.abs(line - toLine);
        int hColumn = Math.abs(column - toColumn);

        if((column - toColumn == 1 || column - toColumn == -1) && (line - toLine == 1 || line - toLine == -1)
                && chessBoard.board[toLine][toColumn] != null) {
            return !chessBoard.board[toLine][toColumn].getColor().equals(color);
        }

        return (hLine == 2 && hColumn == 1 || hLine == 1 && hColumn == 2);
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
