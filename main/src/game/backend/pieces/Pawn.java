package game.backend.pieces;
import game.backend.*;

public class Pawn extends Piece {

    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Square start, Square end) {
        //If they are the same colour then they cannot move
        if (start.getPiece().isWhite() == end.getPiece().isWhite()) {
            return false;
        }

        //Move check for double move when on starting rank and for single move anywhere
        if ((start.getY() == 1) && ((end.getY() == 2) || (end.getY()==3)) && (start.getX() == end.getX())
                && (end.getPiece() == null)) {
            return true;
        } else if (start.getY() + 1 == end.getY() && (end.getPiece() == null) && (start.getX() == end.getX())) {
            return true;
        }
        //Check for attacking diagonally
        if ((start.getY() + 1 == end.getY() && ((start.getX() == end.getX() + 1) || (start.getX() == end.getX() - 1))
                && (end.getPiece() != null))) {
            return true;
        }

        return false;
    }

}
