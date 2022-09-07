package boardgame;

public class Piece {

	protected Position position;

	protected Board board;

	/**
	 * @param position
	 * @param board
	 */
	public Piece(Board board) {
		this.position = null;
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

}
