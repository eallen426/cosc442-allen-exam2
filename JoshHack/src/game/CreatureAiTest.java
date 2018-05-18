package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CreatureAiTest</code> contains tests for the class <code>{@link CreatureAi}</code>.
 *
 * @generatedBy CodePro at 5/18/18 1:29 AM
 * @author user
 * @version $Revision: 1.0 $
 */
public class CreatureAiTest {
	/**
	 * Run the CreatureAi(Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCreatureAi_1()
		throws Exception {
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		ItemNames result = new CreatureAi(creature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanPickup_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canPickup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@10387696
		assertTrue(result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanPickup_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canPickup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@328c1f50
		assertTrue(result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanPickup_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canPickup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7ff85cd5
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.x = 1;
		other.y = 1;
		other.z = 1;

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@56fed14c
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@56c352e3
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3dee02f2
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.x = 1;
		other.y = 1;
		other.z = 1;

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@250fd4cd
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanSee_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanSee_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanSee_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanSee_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanSee_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanSee_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanSee_7()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanThrowAt_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.x = 1;
		other.y = 1;
		other.z = 1;

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@212badd1
		assertTrue(result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanThrowAt_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.x = 1;
		other.y = 1;
		other.z = 1;

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6015da09
		assertTrue(result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanThrowAt_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.x = 1;
		other.y = 1;
		other.z = 1;

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1a5593e3
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanUseBetterEquipment_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2ff21c96
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanUseBetterEquipment_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@54a629ff
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanUseBetterEquipment_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1715d986
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanUseBetterEquipment_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3bc1b19a
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanUseBetterEquipment_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@330a4f9e
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testCanUseBetterEquipment_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@23c215a0
		assertTrue(result);
	}

	/**
	 * Run the String getName(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		String result = fixture.getName(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String getName(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testGetName_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		String result = fixture.getName(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testGetWeaponToThrow_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4e251beb
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testGetWeaponToThrow_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@53d05c02
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testGetWeaponToThrow_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@724ed6b3
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testGetWeaponToThrow_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@35acdb0f
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testGetWeaponToThrow_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@569c8bf8
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testGetWeaponToThrow_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@570526f7
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testGetWeaponToThrow_7()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5570d1ee
		assertNotNull(result);
	}

	/**
	 * Run the void hunt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testHunt_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature target = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		target.x = 1;
		target.y = 1;

		fixture.hunt(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b539924
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testOnEnter_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testOnEnter_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testOnGainLevel_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.onGainLevel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@35d40d98
	}

	/**
	 * Run the void onNotify(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testOnNotify_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		String message = "";

		fixture.onNotify(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the Tile rememberedTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testRememberedTile_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.rememberedTile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7bb0661b
		assertNotNull(result);
	}

	/**
	 * Run the void setName(Item,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		String name = "";

		fixture.setName(item, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4edd76ae
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7f564a51
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@308f4cdc
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@55fef4d5
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1098c38
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6f74611b
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_7()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@775f3b8
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_8()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@44cf5f3a
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_9()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2f8da1d7
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_10()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6dfc860a
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_11()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1ba68e46
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_12()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2fe04fd7
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_13()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@23c7ab5
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_14()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@c5b0828
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_15()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@55646b3b
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testUseBetterEquipment_16()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@38f660ed
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testWander_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testWander_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@73b3a705
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testWander_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@42a4980a
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	@Test
	public void testWander_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@108c5926
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 1:29 AM
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
	 * @generatedBy CodePro at 5/18/18 1:29 AM
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
	 * @generatedBy CodePro at 5/18/18 1:29 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreatureAiTest.class);
	}
}