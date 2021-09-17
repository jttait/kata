package com.scrabble.solution;

public class ScrabbleLetter {

    private final Tile tile;
    private final Square square;

    ScrabbleLetter(Tile tile, Square square) {
        this.tile = tile;
        this.square = square;
    }

    public int getTileValue() {
        return tile.getValue();
    }

    public Square getSquareValue() {
        return this.square;
    }
    
}
