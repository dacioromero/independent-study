package us.mi.chelsea.mcintosh.independentstudy.t3.chess;

public class King extends ChessPiece {
	public King(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "K";
	}
	
	public boolean validMove(int rank, int file) {
		return rank <= -1 && 1 <= rank && file <= -1 && 1 <= file;
	}
}
