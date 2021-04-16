package game.backend.pieces;

import game.backend.*;

import game.backend.Tile;

public class Rook extends Piece {
    private boolean castlePossible;

    public Rook(boolean white) {
        super(white);
        castlePossible = true;
    }

    public boolean canCastle() {
        return castlePossible;
    }

    @Override
    public boolean canMove(Board board, Tile start, Tile end) {

        if (start.getPiece().isWhite() == end.getPiece().isWhite()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        if (x < 0) {
            for (int i = start.getX() - 1; i > end.getX(); i--) {
                if (!board.getTile(i,start.getY()).isEmptyTile()){
                    return false;
                }
            }
        } else if (x > 0) {
            for (int i = start.getX() + 1; i < end.getX(); i++) {
                if (!board.getTile(i,start.getY()).isEmptyTile()){
                    return false;
                }
            }
        } else if (y < 0) {
            for (int i = start.getY() - 1; i > end.getY(); i--) {
                if (!board.getTile(i,start.getX()).isEmptyTile()){
                    return false;
                }
            }
        } else if (y > 0) {
            for (int i = start.getY() + 1; i < end.getY(); i++) {
                if (!board.getTile(i,start.getX()).isEmptyTile()){
                    return false;
                }
            }
        }

        return x*y == 0;
    }
}
