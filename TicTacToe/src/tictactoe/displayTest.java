package tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class displayTest {
	Display obj = new Display();
	char arr[]= {'1','2','3','4','5','6','7','8','9'};
	char actual[]= {'1','|','2','|','3','4','|','5','|','6','7','|','8','|','9'};
	@Test
	public void test() {
		assertArrayEquals(actual,obj.display(arr));
	}

}
