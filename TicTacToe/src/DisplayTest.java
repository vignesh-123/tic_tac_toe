package src;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisplayTest {

	@Test
	public void test() {
		    Display obj = new Display();
		    char arr[]= {'1','2','3','4','5','6','7','8','9'};
		    char actual[]= {'1','|','2','|','3','4','|','5','|','6','7','|','8','|','9'};
		    assertArrayEquals(actual,obj.display(arr));
		}

}
