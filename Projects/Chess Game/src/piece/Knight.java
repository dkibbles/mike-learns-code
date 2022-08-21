package piece;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import board.Board;
import common.Location;
import common.LocationFactory;
import squares.Square;

public class Knight extends AbstractPiece implements Movable {
	public Knight(PieceColor pieceColor) {
		super(pieceColor);
		this.name = "Knight";
	}
	
	@Override
	public List<Location> getValidMoves(Board board) {
		List<Location> moveCandidates = Collections.emptyList();
		Map<Location, Square> squareMap = board.getLocationSquareMap();
		Location current = this.getCurrentSquare().getLocation();
		getMoves(moveCandidates, squareMap, current, 2, 1);
		getMoves(moveCandidates, squareMap, current, 2, -1);
		getMoves(moveCandidates, squareMap, current, -2, 1);
		getMoves(moveCandidates, squareMap, current, -2, -1);
		return moveCandidates;
	}
	
	private void getMoves(
			List<Location> candidates,
			Map<Location, Square> squareMap,
			Location current,
			int rankOffset,
			int fileOffset) {
		Location next = LocationFactory.build(current, fileOffset, rankOffset);
		if(squareMap.containsKey(next)) {
			if(squareMap.get(next).isOccupied()) {
				if(squareMap.get(next).getCurrentPiece().pieceColor.equals(this.pieceColor)) return;
				return;
			}
			candidates.add(next);
			}
		}
	
	@Override
	public List<Location> getValidMoves(Board board, Square square) {
		return null;
	}
	
	@Override
	public void makeMove(Square square) {
		System.out.println(this.getName() + "-> makeMove()");
	}
}
