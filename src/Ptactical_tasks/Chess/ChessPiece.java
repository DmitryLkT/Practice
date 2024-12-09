package Ptactical_tasks.Chess;

public abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public abstract String getColor();

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public abstract String getSymbol();

    public boolean movementFigure(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int x = Integer.compare(toLine, line);
        int y = Integer.compare(toColumn, column);
        int goLine;

        if(y == 0) {
            goLine = Math.abs(toLine - line);
            for(int i = 1; i < goLine; i++) {
                if(chessBoard.board[line + i * x][column] != null) {
                    return false;
                }
            }
        } else if(x == 0) {
            goLine = Math.abs(toColumn - column);
            for(int i = 1; i < goLine; i++) {
                if(chessBoard.board[line][column + i * y] != null) {
                    return false;
                }
            }
        }

        return true;
    }
}
