import java.util.*;
public class EmptyCellFinder {
	static int flag=0;
	public char[] FindingEmptyCell(char TicTacArray[],char value) {
		char useInputVal;
		char c=1;
		char player1='x';
		char player2='o';
		
		//System.out.println("Enter the Values");
		Scanner sr=new Scanner(System.in);
		//useInputVal=sr.next().charAt(0);
		useInputVal=value;
		for(int input=0;input<TicTacArray.length;input++) {
			if(useInputVal==TicTacArray[input]) {
				if(flag==0) {
					TicTacArray[input]=player1;
					flag=1;
				}
				else {
					TicTacArray[input]=player2;
					flag=0;
				}
				c=0;
				break;
				
		
			}
			
		}
		if(c!=0) {
			System.out.println("Enter the valid option");
			useInputVal=sr.next().charAt(0);
			return new EmptyCellFinder().FindingEmptyCell(TicTacArray,useInputVal);
		}
		else {
		
		return TicTacArray;
		}
		
	}
}
