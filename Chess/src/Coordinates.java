public class Coordinates {
	int rank, file;
	
	public Coordinates() {
		rank = file = 0;
	}
	
	public Coordinates(int rank, int file) throws Exception {
		if(rank < 0 || 7 < rank) {
			throw new Exception("Rank " + rank + " is out of range");
		}
		
		if(file < 0 || 7 < file) {
			throw new Exception("File " + rank + " is out of range");
		}
		
		this.rank = rank;
		this.file = file;
	}
	
	public Coordinates(int rank, char file) throws Exception {
		if(rank < 1 || 8 < rank) {
			throw new Exception("Rank " + rank + " is out of range");
		}
		
		if(file < 'a' || 'h' < file) {
			throw new Exception("File " + file + " is out of range.");
		}
		
		this.rank = rank - 1;
		this.file = (int)file - 97;
	}
	
	public void setIntRank(int rank) throws Exception {
		if(rank < 0 || 7 < rank) {
			throw new Exception("Rank " + rank + " is out of range");
		}
		
		this.rank = rank;
	}
	
	public int getIntRank() {
		return rank;
	}
	
	public void setIntFile(int file) throws Exception {
		if(file < 0 || 7 < file) {
			throw new Exception("File " + rank + " is out of range");
		}
		
		this.file = file;
	}
	
	public int getIntFile() {
		return file;
	}
	
	public String toString() {
		return new String(new char[] {(char)(file + 97), (char)rank});
	}
}