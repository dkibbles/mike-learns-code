package board;

public class Square {

    boolean occupied;
    squareColor color;
    Coordinates squareCoordinate;


    Square(boolean occupied, squareColor color, Coordinates squareCoordinate) {

        this.occupied = occupied;
        this.color = color;
        this.squareCoordinate = squareCoordinate;

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
