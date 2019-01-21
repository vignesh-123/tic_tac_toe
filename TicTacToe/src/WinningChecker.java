package src;

import java.util.ArrayList;
import java.util.Arrays;

public class WinningChecker {
	ArrayList<String> originalPattern=new ArrayList<String>(Arrays.asList("147","258","369","123","456","789","159","357"));
    ArrayList<String> pattern1ForPlayer1=new ArrayList<String>(Arrays.asList("147","258","369","123","456","789","159","357"));
    ArrayList<String> pattern2ForPlayer2=new ArrayList<String>(Arrays.asList("147","258","369","123","456","789","159","357"));
	String winningChecker(int playerIndex,int player) {
	    String winner = new String();
	    for(int index=0;index<8;index++) {
	        if(player==0)
	        {  
	        if(pattern1ForPlayer1.get(index).contains(playerIndex+"")) {
	            pattern1ForPlayer1.set(index,pattern1ForPlayer1.get(index).replace(playerIndex+"",""));
	            if(pattern1ForPlayer1.get(index).equals(""))
	            {  
	                winner = "Player-1";
	            }
	        }
	        }
	        else {
	            pattern2ForPlayer2.set(index,pattern2ForPlayer2.get(index).replace(playerIndex+"",""));
	            if(pattern2ForPlayer2.get(index).equals(""))
	            {  
	               winner = "Player-2";
	            }
	        }
	    }
	    return winner;
	}
}
