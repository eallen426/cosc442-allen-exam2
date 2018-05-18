package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WorldTest</code> contains tests for the class <code>{@link World}</code>.
 *
 * @generatedBy CodePro at 5/18/18 1:31 AM
 * @author user
 * @version $Revision: 1.0 $
 */
public class WorldTest {
	/**
	 * Run the World(Tile[][][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testWorld_1()
		throws Exception {
		Tile[][][] tiles = new Tile[][][] {};

		World result = new World(tiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void add(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature pet = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.add(pet);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5c4ce8ce
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptyLocation_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		creature.x = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4079cfd7
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptyLocation_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		creature.x = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@429ca050
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptyLocation_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		creature.x = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@29204222
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptyLocation_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@59ba7fb
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptyLocation_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@203861df
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptyLocation_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1ef2f99f
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptySpace_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = null;
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@332e65d1
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptySpace_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@178486dc
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptySpace_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6ac873c1
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptySpace_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b6b0846
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptySpace_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4db5bdd9
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testAddAtEmptySpace_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@553b9751
		assertTrue(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@29ab1622
		assertNotNull(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testColor_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@30d788f2
		assertNotNull(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testColor_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7ec46dd5
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testCreature_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testCreature_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testCreature_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testCreature_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the int depth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testDepth_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		int result = fixture.depth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testDig_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@600b5878
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testDig_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@33302319
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@78d56bca
		assertEquals(' ', result);
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testGlyph_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@50f8807a
		assertEquals(' ', result);
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testGlyph_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2cc849fa
		assertEquals(' ', result);
	}

	/**
	 * Run the int height() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testHeight_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		int result = fixture.height();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Item result = fixture.item(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1a51bb9d
		assertNotNull(result);
	}

	/**
	 * Run the void remove(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.remove(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@52411d47
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5f70538c
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5c24ddc4
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4069c121
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testRemove_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7e90cb10
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testRemove_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7621febe
	}

	/**
	 * Run the void remove(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testRemove_7()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.remove(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@56881f0d
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = -1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testTile_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testTile_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = -1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testTile_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testTile_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = -1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testTile_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testTile_7()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5df44162
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1c08a507
	}

	/**
	 * Run the int width() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 1:31 AM
	 */
	@Test
	public void testWidth_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		int result = fixture.width();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(WorldTest.class);
	}
}