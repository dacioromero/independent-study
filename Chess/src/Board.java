import java.util.ArrayList;

public class Board {
	private Tile[][] tiles;
	private ArrayList<ChessPiece> benchedChessPieces;
	
	public Board() {
		tiles = new Tile[8][8];
		benchedChessPieces = new ArrayList<ChessPiece>();
		
		for(int i = 0; i < tiles.length; i++) {
			for(int j = 0; j < tiles[i].length; j++) {
				tiles[i][j] = new Tile();
			}
		}
		
		tiles[0][0].setChessPiece(new Rook(ChessPiece.WHITE));
		tiles[0][1].setChessPiece(new Knight(ChessPiece.WHITE));
		tiles[0][2].setChessPiece(new Bishop(ChessPiece.WHITE));
		tiles[0][3].setChessPiece(new Queen(ChessPiece.WHITE));
		tiles[0][4].setChessPiece(new King(ChessPiece.WHITE));
		tiles[0][5].setChessPiece(new Bishop(ChessPiece.WHITE));
		tiles[0][6].setChessPiece(new Knight(ChessPiece.WHITE));
		tiles[0][7].setChessPiece(new Rook(ChessPiece.WHITE));
		
		for(int i = 0; i < tiles[1].length; i++) {
			tiles[1][i].setChessPiece(new Pawn(ChessPiece.WHITE));
		}
		
		for(int i = 0; i < tiles[6].length; i++) {
			tiles[6][i].setChessPiece(new Pawn(ChessPiece.BLACK));
		}
		
		tiles[7][0].setChessPiece(new Rook(ChessPiece.BLACK));
		tiles[7][1].setChessPiece(new Knight(ChessPiece.BLACK));
		tiles[7][2].setChessPiece(new Bishop(ChessPiece.BLACK));
		tiles[7][3].setChessPiece(new Queen(ChessPiece.BLACK));
		tiles[7][4].setChessPiece(new King(ChessPiece.BLACK));
		tiles[7][5].setChessPiece(new Bishop(ChessPiece.BLACK));
		tiles[7][6].setChessPiece(new Knight(ChessPiece.BLACK));
		tiles[7][7].setChessPiece(new Rook(ChessPiece.BLACK));
	}
	
	public boolean moveChessPiece(int rank1, int file1, int rank2, int file2)
	{
		if((0 >= rank1 && rank1 > 7) ||
		   (0 >= file1 && file1 > 7) ||
		   (0 >= rank2 && rank2 > 7) ||
		   (0 >= file2 && file2 > 7)) {
			return false;
		}
		
		else if(!tiles[rank1][file1].hasChessPiece()) {
			return false;
		}
		
		else if(tiles[rank2][file2].hasChessPiece()) {
			if(tiles[rank2][file2].getChessPiece().getTeam() == tiles[rank1][file1].getChessPiece().getTeam()) {
				return false;
			}
			
			else {
				benchedChessPieces.add(tiles[rank2][file2].getChessPiece());
				tiles[rank2][file2].setChessPiece(tiles[rank1][file1].getChessPiece());
				tiles[rank1][file2].setChessPiece(null);
				
				return true;
			}
		}
		
		else {
			tiles[rank2][file2].setChessPiece(tiles[rank1][file1].getChessPiece());
			tiles[rank1][file1].setChessPiece(null);
			
			return true;
		}
	}

	public void printBoard() {
		for(int i = 0; i < tiles[0].length; i++) {
			System.out.print("  " + (char)(97 + i));
		}
		
		System.out.println();
		
		for(int i = tiles.length - 1; i >= 0; i--) {
			System.out.print(i + 1);
			for(int j = 0; j < tiles[i].length; j++) {
				if(tiles[i][j].hasChessPiece()) {
					System.out.print(" " + tiles[i][j].getChessPiece().getSymbol());
				}
				
				else {
					System.out.print(" --");
				}
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < tiles[0].length; i++) {
			System.out.print("  " + (char)(97 + i));
		}
		
		System.out.println();
	}
}
