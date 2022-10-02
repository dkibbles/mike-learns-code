package board;

public class Board {

    Square[][] board = new Square[8][8];

    public Board() {

        for(int i = 0; i < board.length; i++) {

            int fileIndex = 0;
            squareColor color = (i % 1 == 0) ? squareColor.LIGHT : squareColor.DARK;

            for(File file : File.values()) {

                Square square = new Square(false, color, new squareCoordinates(file, -i + 8));
                board[i][fileIndex] = square;
                color = (color == squareColor.DARK) ? squareColor.LIGHT : squareColor.DARK;
                fileIndex++;
            }
        }
    }
    
    public void printBoard() {
        for(Square[] row : board) {
            for(Square square : row) {
                System.out.print(square);
            }
            System.out.println();
        }
    }
}
