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
			

			 public static void chooselatter(String user) {
				 char symbol = ' ';
		       if (user.equals("player")) {
		    	   symbol = 'X';
		       }
		       else if (user.equals("cpu")) {
		    	   symbol = 'O';
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
		         //Calling Method
		         createboard();
		         chooselatter("player");
		         printGameBoard(gameBoard1);
	}

}
