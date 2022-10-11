package Game;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.Coordinates;
import board.Square;
import board.squareIndex;

public interface MovePiece {

    public void move();
    
    public List<squareIndex> getCandidateMoves(Square[][] boardArray, Square newSquare, squareIndex index);



    


}
