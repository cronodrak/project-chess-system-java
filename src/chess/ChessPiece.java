package chess;

import bordgame.Board;
import bordgame.Piece;
import bordgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	protected boolean isThereOpponentpiece(Position position) {
		ChessPiece p = (ChessPiece) getBord().piece(position);
		return p != null && p.getColor() != color;
	}

}
