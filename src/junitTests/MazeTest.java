package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Wall;
import exceptions.InvalidActionException;
import mazeManagement.Maze;

class MazeTest {

	private Maze maze;

	@BeforeEach
	void setup() {
		maze = new Maze(10, 10);
	}

	@Test
	void testSetup() {
		for (int i = 0; i < maze.getMaze().length; i++) {
			assertTrue(maze.getMaze()[0][i] instanceof Wall);
		}
	}

	@Test
	void testInsertOnBorder() {
		int r = 0;
		int c = 0;

		Exception e = assertThrows(InvalidActionException.class, () -> {
			maze.insert(new Wall(), r, c);
		});
		assertEquals("Inserting on border", e.getMessage());
	}
	
	@Test
	void testInsertSuccess() throws InvalidActionException {
		int r = 1;
		int c = 1;
		Wall entity = new Wall();
		
		assertTrue(maze.insert(entity, r, c));
	}

}
