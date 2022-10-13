package piece;

import java.util.List;

import Game.MovePiece;
import board.Square;

public class Knight extends Piece implements MovePiece {

    public Knight(pieceColor color, int material, Square currentSqaure) {
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
