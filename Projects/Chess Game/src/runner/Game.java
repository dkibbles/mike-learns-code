package runner;

import board.Board;
import piece.Movable;

public class Game {
	public static void main(String[] args) {
		Board board = new Board();
		board.printBoard();
		}
	
		public static void printPiece(Movable piece) {
			piece.getValidMoves(null);

		}
}
 