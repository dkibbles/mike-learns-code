package piece;

import java.util.ArrayList;
import java.util.HashMap;

import Game.MovePiece;
import board.Board;
import board.Square;
import board.Coordinates;

public class Pawn extends Piece implements MovePiece{

    private ArrayList<Square> candidateMoves = new ArrayList<>();

    Pawn(pieceColor color, int material, Square currentSquare) {
        super(color, material, currentSquare);
        
        this.material = 1;
        this.currentSquare = null;
        
    }

    @Override
    public void move() {
           
    }

    @Override
    public ArrayList<Square> getCandidateMoves() {
        
        boolean firstMove = true;

        if(firstMove = true) {
            


        } else {
            
        }



         return candidateMoves;
    }
    
}
