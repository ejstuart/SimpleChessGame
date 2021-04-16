package game.backend.pieces;

import game.backend.*;

public class Knight extends Piece{

    public Knight(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Tile start, Tile end) {

        if (start.getPiece().isWhite() == end.getPiece().isWhite()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        return x*y == 2;
    }
}
