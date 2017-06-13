public class King extends ChessPiece {
	public King(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "K";
	}
}
