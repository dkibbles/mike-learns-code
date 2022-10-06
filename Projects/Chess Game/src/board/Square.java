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

    

    public boolean isOccupied() {
        return occupied;
    }



    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }



    public Coordinates getSquareCoordinate() {
        return squareCoordinate;
    }



    public void setSquareCoordinate(Coordinates squareCoordinate) {
        this.squareCoordinate = squareCoordinate;
    }



    public Piece getPieceOnSquare() {
        return pieceOnSquare;
    }



    public void setPieceOnSquare(Piece pieceOnSquare) {
        this.pieceOnSquare = pieceOnSquare;
    }



    @Override
    public String toString() {
        return "Square [occupied=" + occupied + ", color=" + color + ", coordinate=" + squareCoordinate + "]";
    }

    


    
}
