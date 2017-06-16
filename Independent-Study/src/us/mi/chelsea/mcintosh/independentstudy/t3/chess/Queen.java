package us.mi.chelsea.mcintosh.independentstudy.t3.chess;

public class Queen extends ChessPiece {
	public Queen(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "Q";
	}

	public boolean validMove(int rank, int file) {
		int absRank = Math.abs(rank);
		int absFile = Math.abs(file);
		
		return (absRank == absFile && absRank > 0) || (absRank > 0 && absFile == 0) || (absFile > 0 && absRank == 0);
	}
}