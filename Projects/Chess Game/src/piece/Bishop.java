package piece;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import board.Board;
import common.Location;
import common.LocationFactory;
import squares.Square;

public class Bishop extends AbstractPiece implements Movable{
	public Bishop(PieceColor pieceColor) {
		super(pieceColor);
		this.name = "Bishop";
	}
	
	@Override
	public List<Location> getValidMoves(Board board) {
		List<Location> moveCandidates = new ArrayList<>();
		Map<Location, Square> squareMap = board.getLocationSquareMap();
		Location current = this.getCurrentSquare().getLocation();
		getMoves(moveCandidates, squareMap, current, 1, -1);
		getMoves(moveCandidates, squareMap, current, 1, -1);
		getMoves(moveCandidates, squareMap, current, -1, -1);
		getMoves(moveCandidates, squareMap, current, -1, 1);
		return moveCandidates;
	}
	
	private void getMoves(
			List<Location> candidates,
			Map<Location, Square> squareMap,
			Location current,
			int rankOffset,
			int fileOffset) {
		Location next = LocationFactory.build(current, fileOffset, rankOffset);
		while(squareMap.containsKey(next)) {
			if(squareMap.containsKey(next)) {
				if(squareMap.get(next).getCurrentPiece().pieceColor.equals(this.pieceColor)) break;
				candidates.add(next);
				break;
			}
			candidates.add(next);
			next = LocationFactory.build(next, fileOffset, rankOffset);
		}
	}
	
	@Override
	public List<Location> getValidMoves(Board board, Square square) {
		List<Location> moveCandidates = new ArrayList<>();
		Map<Location, Square> squareMap = board.getLocationSquareMap();
		Location current = square.getLocation();
		getMoves(moveCandidates, squareMap, current, 1, -1);
		getMoves(moveCandidates, squareMap, current, 1, -1);
		getMoves(moveCandidates, squareMap, current, -1, -1);
		getMoves(moveCandidates, squareMap, current, -1, 1);
		return moveCandidates;
	}
	
	@Override
	public void makeMove(Square square) {
		System.out.println(this.getName() + "->makeMove()");
	}
}
