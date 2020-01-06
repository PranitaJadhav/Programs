package com.bridgelabz.program;


public class TicTacToe {
	public static final int X=1,O=-1;
	int player=X;
	public static final int empty=0;
	private int board[][]=new int[3][3];
	public boolean isEmpty=false;
	
	public boolean isWin(int player) 
	{
		return((board[0][0]+board[0][1]+board[0][2]==player*3) ||
				(board[1][0]+board[1][1]+board[1][2]==player*3)||
				(board[2][0]+board[2][1]+board[2][2]==player*3)||
				(board[0][0]+board[1][0]+board[2][0]==player*3)||
				(board[0][1]+board[1][1]+board[2][1]==player*3)||
				(board[0][2]+board[1][2]+board[2][2]==player*3)||
				(board[0][0]+board[1][1]+board[2][2]==player*3)||
				(board[0][2]+board[1][1]+board[2][0]==player*3));	
		
	}
	public void position(int n)
	{
		if(n!=empty )
		{
			System.out.println("already enter");
			
		}
		if(n<1 || n>9)
		{
			System.out.println("enter proper number");
		}
		if(n>0 || n<10 || n==empty)
		{
			switch(n)
			{
			case 1:
				board[0][0]=player;
				break;
			case 2:
				board[0][1]=player;
				break;
			case 3:
				board[0][2]=player;
				break;
			case 4:
				board[1][0]=player;
				break;
			case 5:
				board[1][1]=player;
				break;
				
			case 6:
				board[1][2]=player;
				break;
			case 7:
				board[2][0]=player;
				break;
			case 8:
				board[2][1]=player;
				break;
			case 9:
				board[2][2]=player;
				break;
			}
			player=-player;
			
		}
	}
	
	public void displayWinner()
	{
		if(isWin(X))
		{
			System.out.println(" X wins....");
			isEmpty = false;
		}
		else if(isWin(O))
			
		{
			System.out.println(" O wins....");
			isEmpty=false;
		}
		else if(!isEmpty)
		{
			System.out.println("It's a tie.........");
		}
		
	}
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		isEmpty=false;
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				switch(board[i][j])
				{
					case X:
						sb.append(" x ");
						break;
					case O:
						sb.append(" O ");
						break;
					case empty:
						sb.append(" ");
						isEmpty=true;
						break;
				}
				if(j<2)
				{
					sb.append(" | ");
				}
			}
			
				if(i<2)
				{
					sb.append("\n----------------\n");
				}
			}
		return sb.toString();
		}
		
		
	

}