package chess;

import bordgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		this.board = new Board(8, 8);
		initialSetup();
	} // default

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][ board.getColumns()];
		for (int i=0; i < board.getRows(); i++) {
			for (int j=0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);

			}
		}
		
		return mat;
	}
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column,row).toPosition());
	}
	private void initialSetup() {
		placeNewPiece('a',8,new King(board,Color.BLACK));
		placeNewPiece('b',7,new Rook(board,Color.BLACK));
		placeNewPiece('c',6,new King(board,Color.BLACK));
		
	}

	public Board getBoard() {
		return board;
	}

}
