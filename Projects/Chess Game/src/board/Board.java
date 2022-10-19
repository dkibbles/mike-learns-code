package board;

import java.util.HashMap;

public class Board {

    public Square[][] boardArray = new Square[8][8];
    HashMap<Coordinates, Square> squareCoordinatesMap = new HashMap<>();
    HashMap<Square, Square> squareIndexMap = new HashMap<>();
    String[] fileArray = {"A","B","C","D","E","F","G","H"};

    public Board() {

        for(int i = 0; i < boardArray.length; i++) {

            int fileIndex = 0;
            squareColor color = (i % 1 == 0) ? squareColor.LIGHT : squareColor.DARK;

            for(String file : fileArray) {

                Square newSquare = new Square(false, color, new Coordinates(file, -i + 8), null, new squareIndex(fileIndex, i));
                boardArray[i][fileIndex] = newSquare;
                color = (color == squareColor.DARK) ? squareColor.LIGHT : squareColor.DARK;
                squareCoordinatesMap.put(new Coordinates(file, -i + 8), newSquare);
                squareIndexMap.put(newSquare, boardArray[i][fileIndex]);
                fileIndex++;
            }
        }
    }
    
    public void printBoard() {
        for(Square[] row : boardArray) {
            for(Square square : row) {
                System.out.print(square);
            }
            System.out.println();
        }
    }

    



    
}
