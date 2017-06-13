public class Rook extends ChessPiece {
	public Rook(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "R";
	}
}