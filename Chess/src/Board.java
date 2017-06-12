public class Board {
	private Tile[][] tiles;
	
	public Board() {
		tiles = new Tile[8][8];
		
		tiles[0][0] = new Tile(new Rook(ChessPiece.WHITE));
	}
}
