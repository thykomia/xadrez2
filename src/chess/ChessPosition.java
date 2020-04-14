package chess;

import bordgame.Position;

public class ChessPosition {
	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Erro ao instaciar o chessPosition: position no already na matriz");
		}
		this.column = column;
		this.row = row;
	}
	protected Position toPosition() {
		return new Position(8-row, column - 'a');
	}
	protected ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a'- position.getColumn()), 8 - position.getRow());
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	@Override
	public String toString() {
		return "" + column +row;
	}
}
