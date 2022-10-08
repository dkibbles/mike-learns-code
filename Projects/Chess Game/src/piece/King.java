package piece;

import java.util.List;

import Game.MovePiece;
import board.Coordinates;
import board.Square;

public class King extends Piece implements MovePiece{

    public King(pieceColor color, int material, Square currentSqaure) {
        super(color, material, currentSqaure);
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Coordinates> getCandidateMoves(Square[][] boardArray, Square newSquare) {
        // TODO Auto-generated method stub
        return null;
    }

    

   

    
}
