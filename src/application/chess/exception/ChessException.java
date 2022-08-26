package application.chess.exception;

import application.boardgame.exception.BoardException;

public class ChessException extends BoardException {

    public ChessException(String message) {
        super(message);
    }
}
