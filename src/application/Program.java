package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChessMatch chessMatch = new ChessMatch();
	//System.out.println(chessMatch.getBoard().getRows());
	
   UI.printBoard(chessMatch.getPieces());

}
}