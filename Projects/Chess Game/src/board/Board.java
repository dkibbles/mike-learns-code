package board;

import java.util.HashMap;
import java.util.Map;

public class Board {

    public Square[][] boardArray = new Square[8][8];
    Map<Coordinates, Square> squareCoordinatesMap = new HashMap<>();

    public Board() {

        for(int i = 0; i < boardArray.length; i++) {

            int fileIndex = 0;
            squareColor color = (i % 1 == 0) ? squareColor.LIGHT : squareColor.DARK;

            for(File file : File.values()) {

                Square newSquare = new Square(false, color, new Coordinates(file, -i + 8), null);
                boardArray[i][fileIndex] = newSquare;
                color = (color == squareColor.DARK) ? squareColor.LIGHT : squareColor.DARK;
                squareCoordinatesMap.put(new Coordinates(file, -i + 8), newSquare);
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
