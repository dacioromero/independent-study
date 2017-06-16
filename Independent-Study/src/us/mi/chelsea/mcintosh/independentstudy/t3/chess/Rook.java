package us.mi.chelsea.mcintosh.independentstudy.t3.chess;

public class Rook extends ChessPiece {
	public Rook(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "R";
	}
	
	public boolean validMove(int rank, int file) {
		int absRank = Math.abs(rank);
		int absFile = Math.abs(file);
		
		return (absRank > 0 && absFile == 0) || (absFile > 0 && absRank == 0);
	}
}