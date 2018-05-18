package game;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PlayerAiTest</code> contains tests for the class <code>{@link PlayerAi}</code>.
 *
 * @generatedBy CodePro at 5/18/18 1:31 AM
 * @author user
 * @version $Revision: 1.0 $
 */
public class PlayerAiTest {
	/**
	 * Run the PlayerAi(Creature,List<String>,FieldOfView) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testPlayerAi_1()
		throws Exception {
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		List<String> messages = new LinkedList();
		FieldOfView fov = new FieldOfView(new World(new Tile[][][] {}));

		PlayerAi result = new PlayerAi(creature, messages, fov);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testCanSee_1()
		throws Exception {
		PlayerAi fixture = new PlayerAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new LinkedList(), new FieldOfView(new World(new Tile[][][] {})));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testCanSee_2()
		throws Exception {
		PlayerAi fixture = new PlayerAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new LinkedList(), new FieldOfView(new World(new Tile[][][] {})));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testOnEnter_1()
		throws Exception {
		PlayerAi fixture = new PlayerAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new LinkedList(), new FieldOfView(new World(new Tile[][][] {})));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;
		Tile tile = Tile.BOUNDS;

		fixture.onEnter(x, y, z, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testOnEnter_2()
		throws Exception {
		PlayerAi fixture = new PlayerAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new LinkedList(), new FieldOfView(new World(new Tile[][][] {})));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;
		Tile tile = Tile.BOUNDS;

		fixture.onEnter(x, y, z, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testOnEnter_3()
		throws Exception {
		PlayerAi fixture = new PlayerAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new LinkedList(), new FieldOfView(new World(new Tile[][][] {})));
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.x = 1;
		creature.y = 1;
		creature.z = 1;
		fixture.creature = creature;
		int x = 1;
		int y = 1;
		int z = 1;
		Tile tile = Tile.BOUNDS;

		fixture.onEnter(x, y, z, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testOnEnter_4()
		throws Exception {
		PlayerAi fixture = new PlayerAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new LinkedList(), new FieldOfView(new World(new Tile[][][] {})));
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.x = 1;
		creature.y = 1;
		creature.z = 1;
		fixture.creature = creature;
		int x = 1;
		int y = 1;
		int z = 1;
		Tile tile = Tile.BOUNDS;

		fixture.onEnter(x, y, z, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onGainLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testOnGainLevel_1()
		throws Exception {
		PlayerAi fixture = new PlayerAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new LinkedList(), new FieldOfView(new World(new Tile[][][] {})));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.onGainLevel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onNotify(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testOnNotify_1()
		throws Exception {
		PlayerAi fixture = new PlayerAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new LinkedList(), new FieldOfView(new World(new Tile[][][] {})));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		String message = "";

		fixture.onNotify(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the Tile rememberedTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testRememberedTile_1()
		throws Exception {
		PlayerAi fixture = new PlayerAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new LinkedList(), new FieldOfView(new World(new Tile[][][] {})));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.rememberedTile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
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
	 * @generatedBy CodePro at 5/18/18 1:31 AM
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
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PlayerAiTest.class);
	}
}