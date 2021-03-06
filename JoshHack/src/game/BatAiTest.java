package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The class <code>BatAiTest</code> contains tests for the class <code>{@link BatAi}</code>.
 *
 * @author user
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 5/18/18 1:33 AM
 */
public class BatAiTest {
	
	/**
	 * Run the BatAi(Creature) constructor test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/18/18 1:33 AM
	 */
	@Test
	public void testBatAi_1()
		throws Exception {
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		BatAi result = new BatAi(creature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/18/18 1:33 AM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		BatAi fixture = new BatAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 1:33 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 1:33 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/18/18 1:33 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BatAiTest.class);
	}
}