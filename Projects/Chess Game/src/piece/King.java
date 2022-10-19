package piece;

import java.util.ArrayList;
import java.util.List;

import Game.MovePiece;
import board.Square;
import board.squareIndex;

public class King extends Piece implements MovePiece{

    private ArrayList<Square> candidateMoves = new ArrayList<>();

    public King(pieceColor color, int material, Square currentSqaure) {
        super(color, material, currentSqaure);
    }

    @Override
    public void move() {
         
    }

    @Override
    public List<Square> getCandidateMoves(Square[][] boardArray, Square newSquare) {
        
        boolean firstMove = true;
        Square square;
        Square testingSquare;
        int testingSquareIndexFile;
        int testingSquareIndexRank;
        squareIndex squareIndex;
        squareIndex testingSquareIndex;
        int squareIndexFile;
        int squareIndexRank;
        boolean occupied;
        pieceColor testSquarePieceColor;
        pieceColor pieceColor;
        
        

            for(int i = 0; i < boardArray.length; i++) {

                square = this.getCurrentSquare();
                squareIndex = square.getIndex();
                squareIndexFile = squareIndex.getFile();
                squareIndexRank = squareIndex.getRank();

                pieceColor = square.getPieceOnSquare().getColor();

                for(int j = 0; j < boardArray[i].length; j++) {

                    testingSquare = boardArray[i][j];
                    testingSquareIndex = testingSquare.getIndex();
                    testingSquareIndexFile = testingSquareIndex.getFile();
                    testingSquareIndexRank = testingSquareIndex.getRank();
                    occupied = testingSquare.isOccupied();

                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(testingSquareIndexFile == squareIndexFile++ && testingSquareIndexRank == squareIndexRank++) {
                        if(occupied = false) {
                            candidateMoves.add(testingSquare);
                        } else {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        }

                    }

                    if(testingSquareIndexFile == squareIndexFile-- && testingSquareIndexRank == squareIndexRank--) {
                        if(occupied = false) {
                            candidateMoves.add(testingSquare);
                        } else {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        }

                    }

                    if(testingSquareIndexFile == squareIndexFile++ && testingSquareIndexRank == squareIndexRank--) {
                        if(occupied = false) {
                            candidateMoves.add(testingSquare);
                        } else {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        }

                    }

                    if(testingSquareIndexFile == squareIndexFile-- && testingSquareIndexRank == squareIndexRank++) {
                        if(occupied = false) {
                            candidateMoves.add(testingSquare);
                        } else {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        }

                    }

                    if(testingSquareIndexFile == squareIndexFile++ && testingSquareIndexRank == squareIndexRank) {
                        if(occupied = false) {
                            candidateMoves.add(testingSquare);
                        } else {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        }

                    }

                    if(testingSquareIndexFile == squareIndexFile-- && testingSquareIndexRank == squareIndexRank) {
                        if(occupied = false) {
                            candidateMoves.add(testingSquare);
                        } else {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        }

                    }

                    if(testingSquareIndexFile == squareIndexFile && testingSquareIndexRank == squareIndexRank++) {
                        if(occupied = false) {
                            candidateMoves.add(testingSquare);
                        } else {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        }

                    }

                    if(testingSquareIndexFile == squareIndexFile && testingSquareIndexRank == squareIndexRank--) {
                        if(occupied = false) {
                            candidateMoves.add(testingSquare);
                        } else {
                            if(testSquarePieceColor != pieceColor) {
                                candidateMoves.add(testingSquare);
                            }
                        }

                    }

                }
    
            }

        return candidateMoves;

    }

}
