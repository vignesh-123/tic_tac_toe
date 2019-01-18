import static org.junit.Assert.*;

import org.junit.Test;

public class testEmpty {
	EmptyCellFinder obj=new EmptyCellFinder();
	char arr[]= {'1','2','3','4','5','6','7','8','9'};
	//char arr1[]= {'1','2','3','4','5','6','7','8','9'};
	char res[]= {'x','2','3','4','5','6','7','8','9'};
	@Test
	public void test() {
		assertArrayEquals(res,obj.FindingEmptyCell(arr,'1'));

	}

}
