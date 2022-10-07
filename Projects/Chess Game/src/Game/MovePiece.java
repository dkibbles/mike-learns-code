package Game;


import java.util.List;
import board.Coordinates;
import board.Square;

public interface MovePiece {

    public void move();
    
    public List<Coordinates> getCandidateMoves(Square[][] boardArray, Square newSquare);



    


}
