public class King extends ChessPiece {
	public King(int color) {
		super(color);
	}
	
	public String getSymbol() {
		return (getColor() == 0 ? "W" : "B") + "K";
	}
}
