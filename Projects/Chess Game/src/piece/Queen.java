package piece;

import java.util.ArrayList;
import java.util.List;

import Game.MovePiece;
import board.Square;
import board.squareIndex;

public class Queen extends Piece implements MovePiece {

    
    private ArrayList<Square> candidateMoves = new ArrayList<>();

    public Queen(pieceColor color, int material, Square currentSqaure) {
        super(color, material, currentSqaure);
    }

    @Override
    public void move() {
        
    }

    @Override
    public List<Square> getCandidateMoves(Square[][] boardArray, Square newSquare) {
        
        boolean firstMove = true;
        Square currentSquare;
        Square testingSquare;
        int testingSquareIndexFile;
        int testingSquareIndexRank;
        squareIndex squareIndex;
        squareIndex testingSquareIndex;
        int squareIndexFile;
        int squareIndexRank;
        int file;
        int rank;
        boolean occupied;
        pieceColor testSquarePieceColor;
        pieceColor pieceColor;
        Square compareSquare;

                currentSquare = this.getCurrentSquare();
                squareIndexFile = currentSquare.getIndex().getFile();
                squareIndexRank = currentSquare.getIndex().getRank();
                pieceColor = currentSquare.getPieceOnSquare().getColor();

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile++;
                    rank = squareIndexRank;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        file = file + 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile--;
                    rank = squareIndexRank;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        file = file - 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }    

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile;
                    rank = squareIndexRank++;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        rank = rank - 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }        

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile;
                    rank = squareIndexRank--;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        rank = rank + 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile++;
                    rank = squareIndexRank++;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        file = file + 1;
                        rank = rank + 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile--;
                    rank = squareIndexRank--;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        file = file - 1;
                        rank = rank - 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }    

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile++;
                    rank = squareIndexRank--;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        file = file + 1;
                        rank = rank - 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }        

                for(int i = 0; i < 7; i++) {

                    file = squareIndexFile--;
                    rank = squareIndexRank++;
                    testingSquare = boardArray[rank][file];
                    testingSquareIndexFile = testingSquare.getIndex().getFile();
                    testingSquareIndexRank = testingSquare.getIndex().getRank();
                    occupied = testingSquare.isOccupied();
                    testSquarePieceColor = testingSquare.getPieceOnSquare().getColor();

                    if(occupied = false) {
                        candidateMoves.add(testingSquare);
                        file = file - 1;
                        rank = rank + 1;
                    } else {
                        if(testSquarePieceColor != pieceColor) {
                            candidateMoves.add(testingSquare);
                        break;
                        } else {
                            break;
                        } 
                    }

                }

        return candidateMoves;
        
    }
  
}
