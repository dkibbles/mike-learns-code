package piece;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Game.MovePiece;
import board.Board;
import board.Coordinates;
import board.Square;
import board.squareIndex;

public class Pawn extends Piece implements MovePiece{

    private ArrayList<squareIndex> candidateMoves = new ArrayList<>();

    Pawn(pieceColor color, int material, Square currentSquare) {
        super(color, material, currentSquare);
        
        this.material = 1;
        this.currentSquare = null;
        
    }

    @Override
    public void move() {
           
    }

    @Override
    public ArrayList<squareIndex> getCandidateMoves(Square[][] boardArray, Square newSquare, squareIndex index) {
        
        boolean firstMove = true;
        Square square;
        squareIndex currentSquareIndex;
        int currentFile;
        int currentRank;

            square = this.getCurrentSquare();
            currentSquareIndex = square.getIndex();
            currentFile = currentSquareIndex.getFile();
            currentRank = currentSquareIndex.getRank();

            
            

          
         return candidateMoves;
    }
    


}
