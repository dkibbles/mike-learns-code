package piece;

public abstract class Piece {

    pieceColor color;
    int material;
    
    Piece(pieceColor color, int material) {

        this.color = color;
        this.material = material;
        
    }
}
