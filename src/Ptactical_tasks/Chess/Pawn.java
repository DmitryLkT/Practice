package Ptactical_tasks.Chess;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(!chessBoard.checkPos(line) || !chessBoard.checkPos(toLine)
                || !chessBoard.checkPos(toColumn) || !chessBoard.checkPos(column)) {
            return false;
        }

        if(!movementFigure(chessBoard, line, column, toLine, toColumn)) {
            return false;
        }

        if(line == toLine && column == toColumn) {
            return false;
        }

        int directionOfMovement = color.equals("White") ? 1 : -1;
        int startLine = color.equals("White") ? 1 : 6;

        if((column - toColumn == 1 || column - toColumn == -1) && (line - toLine == 1 || line - toLine == -1)
                && chessBoard.board[toLine][toColumn] != null) {
            return !chessBoard.board[toLine][toColumn].getColor().equals(color);
        }

        if(column == toColumn) {
            if(line == startLine && toLine - line == 2 * directionOfMovement) {
                return true;
            }
            if(toLine - line == directionOfMovement) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
