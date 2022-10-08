package piece;

import java.util.ArrayList;
import java.util.HashMap;

import Game.MovePiece;
import board.Board;
import board.Square;
import board.Coordinates;

public class Pawn extends Piece implements MovePiece{

    private ArrayList<Coordinates> candidateMoves = new ArrayList<>();

    Pawn(pieceColor color, int material, Square currentSquare) {
        super(color, material, currentSquare);
        
        this.material = 1;
        this.currentSquare = null;
        
    }

    @Override
    public void move() {
           
    }

    @Override
    public ArrayList<Coordinates> getCandidateMoves(Square[][] boardArray, Square newSquare) {
        
        boolean firstMove = true;
        Square square;
        Coordinates currentSquareCoordinate;
        String file;
        int rank;

            if(firstMove = true) {

                for(int i = 0; i < boardArray.length; i++) {

                    square = this.getCurrentSquare();

                    for(int j = 0; j < boardArray[i].length; j++) {

                        currentSquareCoordinate = square.getSquareCoordinate();

                        file = currentSquareCoordinate.getFile();
                        
                        rank = currentSquareCoordinate.getRank();

                    }

                }

            } else {

                for(int i = 0; i < boardArray.length; i++) {
                    for(int j = 0; j < boardArray[i].length; j++) {

                    }

                }

            }

            


          
         return candidateMoves;
    }
    


}
