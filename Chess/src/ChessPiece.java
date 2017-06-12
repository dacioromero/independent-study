public abstract class ChessPiece {
	public static int WHITE = 0;
	public static int BLACK = 1;
	
	private int color;
	
	public ChessPiece(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
	
	public String getSymbol() {
		return "ER";
	}
}