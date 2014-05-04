/**
 * 
 */
package atm.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import atm.data.NoteContainer;
import atm.data.NoteContainer20;
import atm.data.NoteContainer50;

/**
 * @author lloyd
 *
 */
public class DispenserTest {

	private DefaultDispenser dispenser;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		dispenser = new DefaultDispenser();
		
		List<NoteContainer> containers = new ArrayList<NoteContainer>();
		
		NoteContainer note50 = new NoteContainer50();
		note50.setNoteCount(5);
		note50.setAmount(250);
		containers.add(note50);
		
		NoteContainer note20 = new NoteContainer20();
		note50.setNoteCount(5);
		note50.setAmount(100);
		containers.add(note20);
		
		dispenser.setContainers(containers);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		dispenser = null;
	}

	/**
	 * Test method for {@link atm.service.DefaultDispenser#withdraw(int)}.
	 */
	@Test
	public void testWithdraw() {
		
		boolean result = dispenser.withdraw(70);
		assertTrue("Withdraw $70 failed", result);
		
		result = dispenser.withdraw(25);
		assertFalse("Withdraw $25 failed", result);
		
		result = dispenser.withdraw(40);
		assertTrue("Withdraw $40 failed", result);
		
		result = dispenser.withdraw(60);
		assertFalse("Withdraw $60 failed", result);
		
		result = dispenser.withdraw(100);
		assertTrue("Withdraw $100 failed", result);
		
		result = dispenser.withdraw(120);
		assertFalse("Withdraw $120 failed", result);
		
		result = dispenser.withdraw(55);
		assertFalse("Withdraw $55 failed", result);
		
		result = dispenser.withdraw(70);
		assertTrue("Withdraw $70 failed", result);
		
		result = dispenser.withdraw(20);
		assertTrue("Withdraw $20 failed", result);
		
		result = dispenser.withdraw(50);
		assertFalse("Withdraw $50 failed", result);
		
		result = dispenser.withdraw(20);
		assertFalse("Withdraw $20 failed", result);
		
		result = dispenser.withdraw(5);
		assertFalse("Withdraw $5 failed", result);
		
	}

}
