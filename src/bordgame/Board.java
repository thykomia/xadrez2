package bordgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	public Board(int row, int column) {
		if(row<1 || column <1) {
			throw new BoardException("Quantidade de coluna ou linha é meno que 1");
		}
		this.rows = row;
		this.columns = column;
		this.pieces = new Piece[row][column];
		}
	
	public  Piece piece (int row, int column) {
		if(!positionExists(row,column)) {
			throw new BoardException("Possitoin nao existe no tabuleiro");
		}
		return pieces[row][column];
	}
	public void placePiece (Piece piece, Position position) {
		if(thereIsApiece(position)) {
			throw new BoardException("Ja Already uma peça na possição" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
		
	}
	public  Piece piece (Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Possition nao existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public boolean positionExists(int row, int column) {
		return row >=0 && row < rows && column >= 0 && column <columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}
	
	public boolean thereIsApiece(Position position){
		if(!positionExists(position)) {
			throw new BoardException("Possitoin nao existe no tabuleiro");
		}
		return piece(position) != null;
		
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	
	
	
	
}
