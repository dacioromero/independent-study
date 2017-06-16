package us.mi.chelsea.mcintosh.independentstudy.t3.chess;

public class Tile {
	private ChessPiece chessPiece;
	
	public Tile() {
		this.chessPiece = null;
	}
	
	public boolean hasChessPiece() {
		return chessPiece != null;
	}
	
	public ChessPiece getChessPiece() {
		return chessPiece;
	}
	
	public void setChessPiece(ChessPiece chessPiece) {
		this.chessPiece = chessPiece;
	}
}