package application;

import application.boardgame.Board;
import application.chess.ChessMatch;

public class program {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
