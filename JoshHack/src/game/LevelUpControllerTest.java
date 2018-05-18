package game;

import java.awt.Color;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The class <code>LevelUpControllerTest</code> contains tests for the class <code>{@link LevelUpController}</code>.
 *
 * @author user
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 5/18/18 1:30 AM
 */
public class LevelUpControllerTest {
	
	/**
	 * Run the LevelUpController() constructor test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testLevelUpController_1()
		throws Exception {
		LevelUpController result = new LevelUpController();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void autoLevelUp(Creature) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testAutoLevelUp_1()
		throws Exception {
		LevelUpController fixture = new LevelUpController();
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.autoLevelUp(creature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the LevelUpOption getLevelUpOption(String) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testGetLevelUpOption_1()
		throws Exception {
		LevelUpController fixture = new LevelUpController();
		String name = "";

		LevelUpOption result = fixture.getLevelUpOption(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LevelUpOption getLevelUpOption(String) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testGetLevelUpOption_2()
		throws Exception {
		LevelUpController fixture = new LevelUpController();
		String name = "";

		LevelUpOption result = fixture.getLevelUpOption(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LevelUpOption getLevelUpOption(String) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testGetLevelUpOption_3()
		throws Exception {
		LevelUpController fixture = new LevelUpController();
		String name = "";

		LevelUpOption result = fixture.getLevelUpOption(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<String> getLevelUpOptions() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testGetLevelUpOptions_1()
		throws Exception {
		LevelUpController fixture = new LevelUpController();

		List<String> result = fixture.getLevelUpOptions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.size());
		assertTrue(result.contains("Increased hit points"));
		assertTrue(result.contains("Increased mana"));
		assertTrue(result.contains("Increased attack value"));
		assertTrue(result.contains("Increased defense value"));
		assertTrue(result.contains("Increased vision"));
		assertTrue(result.contains("Increased hp regeneration"));
		assertTrue(result.contains("Increased mana regeneration"));
	}

	/**
	 * Run the List<String> getLevelUpOptions() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/18/18 1:30 AM
	 */
	@Test
	public void testGetLevelUpOptions_2()
		throws Exception {
		LevelUpController fixture = new LevelUpController();

		List<String> result = fixture.getLevelUpOptions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.size());
		assertTrue(result.contains("Increased hit points"));
		assertTrue(result.contains("Increased mana"));
		assertTrue(result.contains("Increased attack value"));
		assertTrue(result.contains("Increased defense value"));
		assertTrue(result.contains("Increased vision"));
		assertTrue(result.contains("Increased hp regeneration"));
		assertTrue(result.contains("Increased mana regeneration"));
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
		new org.junit.runner.JUnitCore().run(LevelUpControllerTest.class);
	}
}