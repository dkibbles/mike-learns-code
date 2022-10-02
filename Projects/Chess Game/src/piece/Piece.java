package piece;

import board.squareCoordinates;

public abstract class Piece {

    pieceColor color;
    squareCoordinates startPosition;
    int material;
    
    Piece(pieceColor color, squareCoordinates startPosition, int material) {

        this.color = color;
        this.startPosition = startPosition;
        this.material = material;
        
    }
}
