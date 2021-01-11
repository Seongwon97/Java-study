package myPackage;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		char[][] arr= new char[3][3];
		int user=1;
		int row,column;
		board(arr);
		for(int i=0;i<9;i++) {

			
			System.out.println("User" +user+" turn");
			System.out.println("Choose the empty space.");
			System.out.print("Enter the Row: ");
			row=keyboard.nextInt();
			System.out.print("Enter the Column: ");
			column=keyboard.nextInt();
			if(user==1) {
				arr[row-1][column-1]='O';
				board(arr);
				checkGame(arr);
				user=2;
				
			}
			else if(user==2) {
				arr[row-1][column-1]='X';
				board(arr);
				checkGame(arr);
				user=1;
			}

		}
	}
	public static void board(char arr1[][]) {
		System.out.println("0 1 2 3");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(i+1);
			for(int j=0;j<3;j++) {
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void checkGame(char arr1[][]) {
		if(arr1[0][0]=='O') {
			if((arr1[0][1]=='O')&&(arr1[0][2]=='O')) {
				System.out.println("User1 win");
				System.exit(0);
			}
			else if((arr1[1][0]=='O')&&(arr1[2][0]=='O')) {
				System.out.println("User1 win");
				System.exit(0);
			}
			else if((arr1[1][1]=='O')&&(arr1[2][2]=='O')) {
				System.out.println("User1 win");
				System.exit(0);
			}
		}
		else if(arr1[1][0]=='O') {
			if((arr1[1][1]=='O')&&(arr1[1][2]=='O')) {
				System.out.println("User1 win");
				System.exit(0);
			}
		}
		else if(arr1[2][0]=='O') {
			if((arr1[2][1]=='O')&&(arr1[2][2]=='O')) {
				System.out.println("User1 win");
				System.exit(0);
			}
			else if((arr1[1][1]=='O')&&(arr1[0][2]=='O')) {
				System.out.println("User1 win");
				System.exit(0);
			}
		}
		else if(arr1[0][1]=='O') {
			if((arr1[1][1]=='O')&&(arr1[2][1]=='O')) {
				System.out.println("User1 win");
				System.exit(0);
			}
		}
		else if(arr1[0][2]=='O') {
			if((arr1[1][2]=='O')&&(arr1[2][2]=='O')) {
				System.out.println("User1 win");
				System.exit(0);
			}
		}
		
		
		else if(arr1[0][0]=='X') {
			if((arr1[0][1]=='X')&&(arr1[0][2]=='X')) {
				System.out.println("User2 win");
				System.exit(0);
			}
			else if((arr1[1][0]=='X')&&(arr1[2][0]=='X')) {
				System.out.println("User2 win");
				System.exit(0);
			}
			else if((arr1[1][1]=='X')&&(arr1[2][2]=='X')) {
				System.out.println("User2 win");
				System.exit(0);
			}
		}
		else if(arr1[1][0]=='X') {
			if((arr1[1][1]=='X')&&(arr1[1][2]=='X')) {
				System.out.println("User2 win");
				System.exit(0);
			}
		}
		else if(arr1[2][0]=='X') {
			if((arr1[2][1]=='X')&&(arr1[2][2]=='X')) {
				System.out.println("User2 win");
				System.exit(0);
			}
			else if((arr1[1][1]=='X')&&(arr1[0][2]=='X')) {
				System.out.println("User2 win");
				System.exit(0);
			}
		}
		else if(arr1[0][1]=='X') {
			if((arr1[1][1]=='X')&&(arr1[2][1]=='X')) {
				System.out.println("User2 win");
				System.exit(0);
			}
		}
		else if(arr1[0][2]=='X') {
			if((arr1[1][2]=='X')&&(arr1[2][2]=='X')) {
				System.out.println("User2 win");
				System.exit(0);
			}
		}
		
	}
}