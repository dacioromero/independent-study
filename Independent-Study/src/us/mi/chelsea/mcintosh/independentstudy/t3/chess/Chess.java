package us.mi.chelsea.mcintosh.independentstudy.t3.chess;

import java.util.Scanner;

public class Chess {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		ChessBoard board = new ChessBoard();
		board.printBoard();
		
		Coordinate from = takeCoordInput("From");
		Coordinate to = takeCoordInput("To");
		
		while(!board.moveChessPiece(from, to)) {
			System.out.println("Invalid movement");
			board.printBoard();
			
			from = takeCoordInput("From");
			to = takeCoordInput("To");
		}
		
		board.printBoard();
	}
	
	static Coordinate takeCoordInput(String prompt) throws Exception {
		System.out.print(prompt + ": ");
		Coordinate coord = new Coordinate(scanner.nextLine());
		
		return coord;
	}
}
