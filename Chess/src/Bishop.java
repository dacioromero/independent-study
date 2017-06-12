public class Bishop extends ChessPiece {
	public Bishop(int color) {
		super(color);
	}
	
	public String getSymbol() {
		return (getColor() == 0 ? "W" : "B") + "B";
	}
}
