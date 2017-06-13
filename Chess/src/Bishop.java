public class Bishop extends ChessPiece {
	public Bishop(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "B";
	}
}
