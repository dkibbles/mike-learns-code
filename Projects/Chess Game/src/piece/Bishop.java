package piece;

import java.util.List;

import Game.MovePiece;
import board.Coordinates;
import board.Square;

public class Bishop extends Piece implements MovePiece{

    public Bishop(pieceColor color, int material, Square currentSqaure) {
        super(color, material, currentSqaure);
    }

    @Override
    public void move() {
        
        
    }

    @Override
    public List<Square> getCandidateMoves(Square[][] boardArray, Square newSquare) {
        
        return null;
    }

    

    
    
}
