public abstract class ChessPiece {
	public static int WHITE = 0;
	public static int BLACK = 1;
	
	private int team;
	
	public ChessPiece(int team) {
		this.team = team;
	}
	
	public int getTeam() {
		return team;
	}
	
	public String getSymbol() {
		return "N/A";
	}
}