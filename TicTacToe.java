import java.util.*;
//Class Declaration
public class TicTacToe {
	
	
			//Creation Board
			public static char [] createboard() 
			{
				
				//Array Creation
				char[] board = new char [10];
				for (int i=1;i<board.length; i++) {
					board[i]=' ';
				
			}
			
				return board;
		}
			

			 public static void chooselatter(char[][]gameboard,int pos,String user) {
				 char symbol = ' ';
		       if (user.equals("player")) {
		    	   symbol = 'X';
		       }
		       else if (user.equals("cpu")) {
		    	   symbol = 'O';
		       }
		       
		       
			 
			switch(pos) {               //Using switch case for the position section of user
		       case 1:
		    	   gameboard[0][0]= symbol;//row,column
		       	  break;
		       case 2:
		    	   gameboard[0][2]= symbol;
		       	  break;
		       case 3:
		    	   gameboard[0][4]= symbol;
		       	   break;
		       case 4:
		    	   gameboard[2][0]= symbol;
		       	   break;
		       case 5:
		    	   gameboard[2][4]= symbol;
		       	   break;
		       case 6:
		    	   gameboard[2][4]= symbol;
		       	   break;
		       case 7:
		    	   gameboard[4][0]= symbol;
		       	   break;
		       case 8:
		    	   gameboard[4][2]= symbol;
		       	   break;
		       case 9:
		    	   gameboard[4][4]= symbol;
		       	   break;
		       	default:
		       		break;
			}
			
	 }
			 //created new class of char type
			 public static void printGameBoard(char[][] gameBoard) {
				 //Here Array is called row inside the gameBoard
				 for(char[] row : gameBoard) {
					 for(char c : row) {
						 System.out.print(c);
					 }
					 System.out.println();//printing line
				 }
			 }

	

                 //Main Method
	             public static void main(String[] args) {
		
		         //Printing message
		         System.out.println("WellCome TO the Game");
		         char[][] gameBoard1 = {{' ','|',' ','|',' '},
			               {'-','+','-','+','-'},
			               {' ','|',' ','|',' '},
			               {'-','+','-','+','-'},
			               {' ','|',' ','|',' '}};

				 Scanner scan =new Scanner(System.in);       // Scanner is used to take the input from the user
				 System.out.println("Enter Your number (1-9)");
				 int pos = scan.nextInt();
				 System.out.println(pos);
		         //Calling Method
				 chooselatter(gameBoard1, pos, "player");
		         createboard();
		         printGameBoard(gameBoard1);
		         
	}

}
