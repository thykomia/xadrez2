package bordgame;

public class Piece {
	protected Position position;
	protected Board board;
	
	public Piece(Board board) {
		position = null;
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	}
