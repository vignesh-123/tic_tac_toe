package src;
import java.util.*;
public class EmptyCellFinder {
	
	static int invalid=0;
	public char[] FindingEmptyCell(char TicTacArray[],char useInputVal,int flag) {
		char c=1;
		char player1='x';
		char player2='o';
		Scanner sr=new Scanner(System.in);
		for(int input=0;input<TicTacArray.length;input++) {
			if(useInputVal==TicTacArray[input]) {
				if(flag==0) {
					System.out.println("Player-1");
					TicTacArray[input]=player1;
					flag=1;
				}
				else {
					System.out.println("Player-2");
					TicTacArray[input]=player2;
					flag=0;
				}
				c=0;
				invalid=0;
				break;			
			}
			
		}
		if(c!=0) {
			invalid=1;
			System.out.println("Enter the valid option");
		}
			return TicTacArray;
		
	}
}
