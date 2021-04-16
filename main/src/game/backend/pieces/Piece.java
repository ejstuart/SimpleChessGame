package game.backend.pieces;
import game.backend.*;


/**
 * Abstract class to represent the pieces that are on the board and their colour, whether the can move and
 * whether or not they have been taken by the opposing player.
 */
public abstract class Piece {

    private boolean taken;
    private boolean white;

    public Piece(boolean white) {
        this.setWhite(white);
    }

    public boolean isWhite() {
        return this.white;
    }

    public boolean isTaken() {
        return this.taken;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    public abstract boolean canMove(Board board, Tile start, Tile end);
}
