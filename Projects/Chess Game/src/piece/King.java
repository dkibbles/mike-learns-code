package piece;

import java.util.List;

import Game.MovePiece;
import board.Square;

public class King extends Piece implements MovePiece{

    public King(pieceColor color, int material, Square currentSqaure) {
        super(color, material, currentSqaure);
    }

    @Override
    public void move() {
        
        
    }

    @Override
    public List<Square> getCandidateMoves() {
        
        return null;
    }

    
}
