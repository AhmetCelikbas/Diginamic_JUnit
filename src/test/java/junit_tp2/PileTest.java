package junit_tp2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import exceptions.PeekException;
import exceptions.TailleException;

public class PileTest {
	Pile<String> pile;
	
	@Before
	public void initialition() {
		pile = new Pile<String>(2);
	}
	
	@Test
	public void peekTest() throws Exception {
		pile.push("String1");
		pile.push("String2");
		assertEquals(null, pile.peek(), "String1");
	}
	
	@Test(expected = PeekException.class)
	public void peekEmptyPileTest() throws Exception {
		assertNotNull(pile.peek());
	}
	

	
	@Test
	public void unlimitedPushTest() throws Exception {
		pile.push("String1");
		pile.push("String2");
		assertEquals(pile.getSize(), 2, 0.0);
	}
		
	@Test
	public void popTest() throws Exception {
		pile.push("String1");
		pile.push("String2");
		pile.pop();
		assertEquals(pile.getSize(), 1, 0.0);
	}
	
	
	@Test(expected = TailleException.class)
	public void limitedPushushTest() throws Exception {
		pile.push("String1");
		pile.push("String2");
		pile.push("String3");
	}
	
	@Test
	public void popAllTest() throws Exception {
		pile.push("String1");
		pile.push("String2");
		pile.popAll();
		assertEquals(pile.getSize(), 0, 0.0);
	}
	


}
