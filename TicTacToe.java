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
			

		

	

                 //Main Method
	             public static void main(String[] args) {
		
		         //Printing message
		         System.out.println("WellCome TO the Game");
		         //Calling Method
		         createboard();
	}

}
