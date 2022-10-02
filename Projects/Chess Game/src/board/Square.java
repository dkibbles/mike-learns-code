package board;

public class Square {

    boolean occupied;
    squareColor color;
    squareCoordinates coordinate;


    Square(boolean occupied, squareColor color, squareCoordinates coordinate) {

        this.occupied = occupied;
        this.color = color;
        this.coordinate = coordinate;

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
        return "Square [occupied=" + occupied + ", color=" + color + ", coordinate=" + coordinate + "]";
    }

    


    
}
