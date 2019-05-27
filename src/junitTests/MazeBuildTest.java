package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.*;
import exceptions.InvalidActionException;
import mazeManagement.MazeController;

class MazeBuildTest {

	private MazeController mazeController;
	private Entity[][] maze;

	@BeforeEach
	void setup() {
		mazeController = new MazeController(10, 10);
		maze = mazeController.getMaze();
	}

	@Test
	void testSetupMethod() {
		for (int i = 0; i < maze.length; i++) {
			assertTrue(maze[0][i] instanceof Wall);
		}
	}

	@Test
	void testInsert_onBorder_exceptionThrown() {
		int r = 0;
		int c = 0;

		Exception e = assertThrows(InvalidActionException.class, () -> {
			mazeController.insert(new Wall(), r, c);
		});
		assertEquals("Inserting on border", e.getMessage());
	}
	
	@Test
	void testInsert_pass() throws InvalidActionException {
		int r = 1;
		int c = 1;
		Wall entity = new Wall();
		
		assertTrue(mazeController.insert(entity, r, c));
	}

}
