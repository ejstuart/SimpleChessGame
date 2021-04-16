package game.backend;

import game.backend.pieces.*;

public class Tile {

    private Piece piece;
    private int x;
    private int y;

    public Tile(int x, int y, Piece piece) {
        this.setPiece(piece);
        this.setX(x);
        this.setY(y);
    }

    public Piece getPiece() {
        return piece;
    }

    public boolean isEmptyTile() {
        return piece == null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
