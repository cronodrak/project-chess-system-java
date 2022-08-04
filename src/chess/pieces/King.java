package chess.pieces;

import bordgame.Board;
import bordgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}
	
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBord().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBord().getRows()][getBord().getColumns()];
		
		Position p = new Position(0,0);
		
		p.setValues(position.getRow() - 1, position.getColumn());
		if(getBord().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		p.setValues(position.getRow() + 1, position.getColumn());
		if(getBord().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		p.setValues(position.getRow(), position.getColumn() - 1);
		if(getBord().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		p.setValues(position.getRow(), position.getColumn() + 1);
		if(getBord().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		if(getBord().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if(getBord().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if(getBord().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		if(getBord().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}
	
}
