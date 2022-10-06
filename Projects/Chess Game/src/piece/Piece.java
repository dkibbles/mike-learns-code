package piece;

import board.Square;

public abstract class Piece {

    pieceColor color;
    int material;
    Square currentSquare;

    Piece(pieceColor color, int material, Square currentSqaure) {

        this.color = color;
        this.material = material;
        this.currentSquare = currentSqaure;
        
    }

    public pieceColor getColor() {
        return color;
    }

    public void setColor(pieceColor color) {
        this.color = color;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square currentSquare) {
        this.currentSquare = currentSquare;
    }

    @Override
    public String toString() {
        return "Piece [color=" + color + ", material=" + material + ", currentSquare=" + currentSquare + "]";
    }

    
}
