package board;

public class Board {

    Square[][] board = new Square[8][8];

    public Board() {

        for(int i = 0; i < board.length; i++) {

            squareColor color = (i % 1 == 0) ? squareColor.LIGHT : squareColor.DARK;

            for(File file : File.values()) {

                Square square= new Square(false, color, new squareCoordinates(file, -i + 9));
                color = (color == squareColor.DARK) ? squareColor.LIGHT : squareColor.DARK;
            }
        }
    }
    
    public void printBoard() {
        for(Square[] row : board) {
            for(Square square : row) {
                System.out.println(square);
            }
            System.out.println();
        }
    }
}
