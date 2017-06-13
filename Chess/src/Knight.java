public class Knight extends ChessPiece {
	public Knight(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "N";
	}
}