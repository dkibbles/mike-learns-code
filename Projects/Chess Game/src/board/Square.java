package board;

import piece.Piece;

public class Square {

    boolean occupied;
    squareColor color;
    Coordinates squareCoordinate;
    Piece pieceOnSquare;
    squareIndex index;


    Square(boolean occupied, squareColor color, Coordinates squareCoordinate, Piece pieceOnSquare, squareIndex index) {

        this.occupied = occupied;
        this.color = color;
        this.squareCoordinate = squareCoordinate;
        this.pieceOnSquare = pieceOnSquare;
        this.index = index;

    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public squareColor getColor() {
        return color;
    }

    public void setColor(squareColor color) {
        this.color = color;
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

    public squareIndex getIndex() {
        return index;
    }

    public void setIndex(squareIndex index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Square [occupied=" + occupied + ", color=" + color + ", coordinate=" + squareCoordinate + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (occupied ? 1231 : 1237);
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((squareCoordinate == null) ? 0 : squareCoordinate.hashCode());
        result = prime * result + ((pieceOnSquare == null) ? 0 : pieceOnSquare.hashCode());
        result = prime * result + ((index == null) ? 0 : index.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Square other = (Square) obj;
        if (occupied != other.occupied)
            return false;
        if (color != other.color)
            return false;
        if (squareCoordinate == null) {
            if (other.squareCoordinate != null)
                return false;
        } else if (!squareCoordinate.equals(other.squareCoordinate))
            return false;
        if (pieceOnSquare == null) {
            if (other.pieceOnSquare != null)
                return false;
        } else if (!pieceOnSquare.equals(other.pieceOnSquare))
            return false;
        if (index == null) {
            if (other.index != null)
                return false;
        } else if (!index.equals(other.index))
            return false;
        return true;
    }
    
}
