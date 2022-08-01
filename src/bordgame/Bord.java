package bordgame;

public class Bord {
	
	private Integer rows;
	private int columns;
	private Piece[][] pieces;
	
	public Bord() {
		
	}

	public Bord(Integer rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
}
