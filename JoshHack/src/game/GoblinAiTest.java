package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GoblinAiTest</code> contains tests for the class <code>{@link GoblinAi}</code>.
 *
 * @generatedBy CodePro at 5/18/18 1:30 AM
 * @author user
 * @version $Revision: 1.0 $
 */
public class GoblinAiTest {
	/**
	 * Run the GoblinAi(Creature,Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testGoblinAi_1()
		throws Exception {
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		GoblinAi result = new GoblinAi(creature, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		GoblinAi fixture = new GoblinAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testOnUpdate_2()
		throws Exception {
		GoblinAi fixture = new GoblinAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testOnUpdate_3()
		throws Exception {
		GoblinAi fixture = new GoblinAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testOnUpdate_4()
		throws Exception {
		GoblinAi fixture = new GoblinAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testOnUpdate_5()
		throws Exception {
		GoblinAi fixture = new GoblinAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testOnUpdate_6()
		throws Exception {
		GoblinAi fixture = new GoblinAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * @generatedBy CodePro at 5/18/18 1:30 AM
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
	 * @generatedBy CodePro at 5/18/18 1:30 AM
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
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GoblinAiTest.class);
	}
}