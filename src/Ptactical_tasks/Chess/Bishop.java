package Ptactical_tasks.Chess;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(!chessBoard.checkPos(line) || !chessBoard.checkPos(toLine)
                || !chessBoard.checkPos(column) || !chessBoard.checkPos(toColumn)) {
            return false;
        }

        if(line == toLine && column == toColumn) {
            return false;
        }

        int dLine = Math.abs(line - toLine);
        int dColumn = Math.abs(column - toColumn);

        return dLine == dColumn;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
