package game.backend;

public class Board {
    Tile[][] tiles;

    public Board() {
        this.resetBoard();

    }

    public Tile getTile(int x, int y){
        return tiles[x][y];
    }

    public void resetBoard(){

    }


}
