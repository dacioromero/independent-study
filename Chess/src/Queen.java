public class Queen extends ChessPiece {
	public Queen(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "Q";
	}
}