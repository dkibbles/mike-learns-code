package board;

import piece.Piece;

public class Square {

    boolean occupied;
    squareColor color;
    Coordinates squareCoordinate;
    Piece pieceOnSquare;


    Square(boolean occupied, squareColor color, Coordinates squareCoordinate, Piece pieceOnSquare) {

        this.occupied = occupied;
        this.color = color;
        this.squareCoordinate = squareCoordinate;
        this.pieceOnSquare = pieceOnSquare;

    }

    public void setOccupied() {

    }

    public void setUnoccupied() {

    }

    public boolean isSquareOccupied() {

        return false;

    }

    @Override
    public String toString() {
        return "Square [occupied=" + occupied + ", color=" + color + ", coordinate=" + squareCoordinate + "]";
    }

    


    
}
