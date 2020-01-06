package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class TictackToe {
	
	public static int row,col;
	public static char[][] board 	=	new char[3][3];
	static Scanner sc	=	new Scanner(System.in);
	public static char turn	=	'x';

	public static void main(String[] args) {
		
		for(int i = 0 ;i<3;i++) {
			for(int j= 0;j<3;j++) {
				board[i][j]	=	'_';
			}
		}
		//printboard();
		play();
	}
	
	
	public static void play() {
		boolean playing	=	true;
		printboard();
			while(playing) {
				System.out.println("Please enter row and column");
				row				=	sc.nextInt();
				col				=	sc.nextInt();
				board[row][col]	=	turn;
				
					if(gameOver(row,col)) {
						
						playing	=	false;
						System.out.println("Game over"+turn+"    wins");
					}
			
		
		printboard();
		if(turn  == 'x')
			turn = '0';
		
		else
			turn	=	'x';
	}
	}	
	
	/**
	 * This method is to print the board
	 */
	public static void printboard() {

		for(int i = 0; i < 3; i++) {
			
			System.out.println();
			
			for(int j= 0; j < 3; j++) {
				if(j == 0) {
					System.out.print(" | ");
				}
				System.out.print(board[i][i]+" | ");
			}
		}
		
		System.out.println();
		
		
	}
	
	public static boolean gameOver(int rMove , int cMove) {
		
		if(board[0][cMove] == board[1][cMove]  &&  
				       board[0][cMove] == board[2][cMove])
			
			return true;

			
		if(board[rMove][0] == board[rMove][1]  &&  
						board[rMove][0] == board[rMove][2])
	
			
			return true;
		
		if(board[0][0] == board[1][1]  &&  
						board[0][0] == board[2][2] && board[1][1]!='_')
	
			return true;
			
			if(board[0][2] == board[1][1]  &&  
							board[0][2] == board[2][0] && board[1][1]!='_')
		
				return true;
		
		
		
		return false;
		
		
		
	}

}
