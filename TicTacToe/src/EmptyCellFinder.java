import java.util.*;
public class EmptyCellFinder {
	static int flag=0;
	public void FindingEmptyCell(char TicTacArray[]) {
		char useInputVal;
		char player1='x';
		char player2='o';
		System.out.println("Enter the Values");
		Scanner sr=new Scanner(System.in);
		useInputVal=sr.next().charAt(0);
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
				
		
			}
			
		}
		
	}
}
