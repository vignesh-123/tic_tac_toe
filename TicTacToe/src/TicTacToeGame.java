package src;
import java.util.Arrays;
import java.util.Scanner;
public class TicTacToeGame {
	static int flag = 0;
	static int restart = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char status;
		do {
		EmptyCellFinder empty = new EmptyCellFinder();
		Display show = new Display();
		WinningChecker win = new WinningChecker();
		char [] mainArray = new char[9];
		int value=1;
		int redix=10;
		int valid = 1;
		String winner=new String();
		for(int index=0;index<mainArray.length;index++)
		{
			char temp = Character.forDigit(value++,redix);
			mainArray[index] = temp;
		}
		while(valid<10)
		{
			if(flag==0)
			{
				System.out.println("Player-1 Enter option:");
				
			}
			else
			{
				System.out.println("Player-2 Enter option:");
		
			}
			valid++;
			char option = scan.next().charAt(0);
			char TicTacToeArray[] = empty.FindingEmptyCell(mainArray, option,flag);
			show.display(TicTacToeArray);
			while(empty.invalid==1)
			{
				option = scan.next().charAt(0);
				TicTacToeArray = empty.FindingEmptyCell(mainArray, option,flag);
				show.display(TicTacToeArray);			
			}
		    winner = win.winningChecker(Integer.parseInt(option+""),flag);
			if(winner == "Player-1" || winner == "Player-2")
			{
				System.out.println(winner+" is the winner");
				break;
			}
			if(flag==0)
			{
				flag=1;
			}
			else
			{
				flag=0;
			}
		}
		if(winner!="Player-1" && winner!="Player-2")
		{
			System.out.println("Draw match");
		}
		flag=0;
		System.out.println("To restart the game Press r");
		status= scan.next().charAt(0);
		}while(status == 'r');
	}
}
