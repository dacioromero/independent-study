public class Knight extends ChessPiece {
	public Knight(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "N";
	}
	
	public boolean moveAllowed(int file, int rank) {
		int absFile = Math.abs(file);
		int absRank = Math.abs(rank);
		return (absRank == 1 && absFile == 2) || (absRank == 2 && absFile == 1);
	}
}