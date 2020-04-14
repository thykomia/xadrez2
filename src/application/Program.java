package application;

import bordgame.Board;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChessMatch chessMatch = new ChessMatch();
	//System.out.println(chessMatch.getBoard().getRows());
	Board board = new Board(8,8);
   UI.printBoard(chessMatch.getPieces());
/*   System.out.println("\n");
   for (int i = 0; i < board.getRows(); i++) {
	   for (int j = 0; j < board.getColumns(); j++) {
		   System.out.print("-");
		
	}
	System.out.println("");
}*/

}
}