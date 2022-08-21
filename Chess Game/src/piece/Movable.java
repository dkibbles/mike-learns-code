package piece;

import java.util.List;

import board.Board;
import common.Location;
import squares.Square;

public interface Movable {
	List<Location> getValidMoves(Board board);
	List<Location> getValidMoves(Board board, Square square);
	void makeMove(Square sqaure);
}
