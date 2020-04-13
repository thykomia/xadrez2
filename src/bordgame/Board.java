package bordgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	public Board(int row, int column) {
		this.rows = row;
		this.columns = column;
		this.pieces = new Piece[row][column];
		}
	
	public  Piece piece (int row, int column) {
		return pieces[row][column];
	}

	public  Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public int getRows() {
		return rows;
	}
	public void setRows(int row) {
		this.rows = row;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int column) {
		this.columns = column;
	}
	
	
	
	
}
