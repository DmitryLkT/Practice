package Ptactical_tasks.Chess;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!chessBoard.checkPos(line) || !chessBoard.checkPos(column)
                || !chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn)) {
            return false;
        }

        if(line == toLine && column == toColumn) {
            return false;
        }

        if(!movementFigure(chessBoard, line, column, toLine, toColumn)) {
            return false;
        }

        int kLine = Math.abs(line - toLine);
        int kColumn = Math.abs(column - toColumn);

        if((column - toColumn == 1 || column - toColumn == -1) && (line - toLine == 1 || line - toLine == -1)
                && chessBoard.board[toLine][toColumn] != null) {
            return !chessBoard.board[toLine][toColumn].getColor().equals(color);
        }

        return kLine == 1 && kColumn == 1 || kLine == 0 && kColumn == 1
                || kLine == 1 && kColumn == 0;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        if(board.checkPos(line) && board.checkPos(column)) {
            for(int i = 0; i <= 7; i++) {
                for(int j = 0; i <= 7; j++) {
                    if(board.board[i][j] != null) {
                        if(!board.board[i][j].getColor().equals(color) &&
                                board.board[i][j].canMoveToPosition(board, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
