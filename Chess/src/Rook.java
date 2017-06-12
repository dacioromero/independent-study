public class Rook extends ChessPiece {
	public Rook(int color) {
		super(color);
	}
	
	public String getSymbol() {
		return (getColor() == 0 ? "W" : "B") + "R";
	}
}