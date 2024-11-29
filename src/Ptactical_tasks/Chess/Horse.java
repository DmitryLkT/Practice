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

        int hLine = Math.abs(line - toLine);
        int hColumn = Math.abs(column - toColumn);

        return (hLine == 2 && hColumn == 1 || hLine == 1 && hColumn == 2);
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
