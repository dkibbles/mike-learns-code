package board;


import squares.Square;
import squares.SquareColor;
import common.Location;
import piece.AbstractPiece;
import piece.PieceFactory;

import java.util.HashMap;
import java.util.Map;

import common.File;

public class Board {
	private static final Integer BOARD_LENGTH = 8;
	private final Map<Location, Square> locationSquareMap;
	 
	Square[][] boardSquares = new Square[BOARD_LENGTH][BOARD_LENGTH];
	
	
	public Board() {
		locationSquareMap = new HashMap<>();
		Map<Location, AbstractPiece> pieces = PieceFactory.getPieces();
		for(int i = 0; i < boardSquares.length; i++) {
			int column = 0;
			SquareColor currentColor = (i % 2 == 0) ? SquareColor.LIGHT : SquareColor.DARK;
			for(File file : File.values()) {
				Square newSquare = new Square(currentColor, new Location(file, BOARD_LENGTH - i ));
				if (pieces.containsKey(newSquare.getLocation())) {
					AbstractPiece piece = pieces.get(newSquare.getLocation());
					newSquare.setCurrentPiece(piece);
					newSquare.setOccupied(true);
					piece.setCurrentSquare(newSquare);
				}
				boardSquares[i][column] = newSquare;
				locationSquareMap.put(newSquare.getLocation(), newSquare);				
				currentColor = (currentColor == SquareColor.DARK) ? SquareColor.LIGHT : SquareColor.DARK;
				column++;
				
			}
		}
	}
	
	public Map<Location, Square> getLocationSquareMap() {
		return locationSquareMap;
	}
	
	public void printBoard() {
		for(int i = 0; i < boardSquares.length; i++) {
			System.out.print(BOARD_LENGTH - i + " ");
			for(int j = 0; j < boardSquares[i].length; j++) {
				if (boardSquares[i][j].isOccupied()) {
					AbstractPiece piece = boardSquares[i][j].getCurrentPiece();
					System.out.println(piece.getName().charAt(0) + " ");
				} else {
					System.out.print("- ");
			}
		}
		System.out.println();
	}
	System.out.print("  ");
	for(File file : File.values()) {
		System.out.print(file.name() + " ");
	}
	System.out.println();
} 
	

	
}