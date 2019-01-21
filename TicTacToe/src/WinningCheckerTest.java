package src;

import static org.junit.Assert.*;

import org.junit.Test;

public class WinningCheckerTest {

	@Test
	public void test() {
		WinningChecker win = new WinningChecker();
		win.winningChecker(1,1);
		win.winningChecker(4,1);
		assertEquals("Player-2",win.winningChecker(7,1));
		win.winningChecker(2,0);
		win.winningChecker(3,0);
		assertEquals("",win.winningChecker(6,0));
	}

}
