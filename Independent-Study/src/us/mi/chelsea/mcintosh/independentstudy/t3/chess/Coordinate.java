package us.mi.chelsea.mcintosh.independentstudy.t3.chess;

public class Coordinate {
	int file, rank;
	
	public Coordinate() {
		file = rank = 0;
	}
	
	public Coordinate(int file, int rank) throws Exception {
		setIntFile(file);
		setIntRank(rank);
	}
	
	public Coordinate(String coordinate) throws Exception {
		set(coordinate);
	}
	
	
	public void set(String coordinate) throws Exception {
		if(coordinate.length() != 2) {
			throw new Exception("Coordinate " + coordinate + " is too long.");
		}
		
		setCharFile(coordinate.charAt(0));
		setCharRank(coordinate.charAt(1));
	}
	
	public int getIntFile() {
		return file;
	}
	
	public char getCharFile() {
		return (char)(file + 97);
	}
	
	public void setIntFile(int file) throws Exception {
		if(file < 0 || 7 < file) {
			throw new Exception("File " + rank + " is out of range");
		}
		
		this.file = file;
	}
	
	public void setCharFile(char file) throws Exception {
		file = Character.toLowerCase(file);
		
		if(file < 'a' || 'h' < file) {
			throw new Exception("File " + file + " is out of range.");
		}
		
		this.file = (int)file - 97;
	}
	
	
	public int getIntRank() {
		return rank;
	}
	
	public char getCharRank() {
		return (char)(rank + 49);
	}
	
	public void setIntRank(int rank) throws Exception {
		if(rank < 0 || 7 < rank) {
			throw new Exception("Rank " + rank + " is out of range");
		}
		
		this.rank = rank;
	}
	
	public void setCharRank(char rank) throws Exception {
		if(rank < '1' || '8' < rank) {
			throw new Exception("Rank " + rank + " is out of range.");
		}
		
		this.rank = (int)rank - 49;
	}
	
	public String toString() {
		return new String(new char[] {getCharFile(), getCharRank()});
	}
}