public class Rook extends ChessPiece {
	public Rook(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "R";
	}
	
	public boolean moveAllowed(int rank, int file) {
		int absRank = Math.abs(rank);
		int absFile = Math.abs(file);
		return false;
	}
}