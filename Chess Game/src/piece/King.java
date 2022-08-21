package piece;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import board.Board;
import common.Location;
import squares.Square;

public class King extends AbstractPiece implements Movable {
	
	private Movable bishop;
	private Movable rook;
	
	public King(PieceColor pieceColor) {
		super(pieceColor);
		this.name = "King";
	}
	
	public King(PieceColor pieceColor, Movable bishop, Movable rook) {
		super(pieceColor);
		this.name = "King";
		this.bishop = bishop;
		this.rook = rook;
	}
	
	@Override
	public List<Location> getValidMoves(Board board) {
		List<Location> moveCandidates = Collections.emptyList();
		moveCandidates.addAll(rook.getValidMoves(board, this.getCurrentSquare()));
		moveCandidates.addAll(bishop.getValidMoves(board, this.getCurrentSquare()));
		Location current = this.getCurrentSquare().getLocation();
		return moveCandidates.stream()
				.filter(candidate -> (
						Math.abs(candidate.getFile().ordinal() - current.getFile().ordinal()) == 1 &&
							Math.abs(candidate.getRank() - current.getRank()) == 1))
						.collect(Collectors.toList());

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
