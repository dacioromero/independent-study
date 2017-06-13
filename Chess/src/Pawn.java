public class Pawn extends ChessPiece {
	public Pawn(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "P";
	}
}