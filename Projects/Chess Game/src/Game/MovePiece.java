package Game;

import java.util.List;
import board.Square;

public interface MovePiece {

    public void move();
    
    public List<Square> getCandidateMoves(Square[][] boardArray, Square newSquare);



    


}
