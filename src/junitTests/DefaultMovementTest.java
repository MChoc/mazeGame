package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.*;
import exceptions.InvalidActionException;
import mazeManagement.MazeController;
import player.Player;

class DefaultMovementTest {

	MazeController mazeController;
	Entity[][] maze;
	Player player;
	
	@BeforeEach
	void setUp() throws Exception {
		mazeController = new MazeController(10, 10);
		maze = mazeController.getMaze();
		player = new Player(5, 5);
	}
	
	@Test
	void testPushBoulderIntoBackground_up_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 4, 5);
		player.move(mazeController, "up");
		assertTrue(player.getR() == 4 && player.getC() == 5);
		assertTrue(maze[3][5].equals(boulder));
		assertTrue(maze[4][5] instanceof Background);
	}

	@Test
	void testPushBoulderIntoBackground_down_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 6, 5);
		player.move(mazeController, "down");
		assertTrue(player.getR() == 6 && player.getC() == 5);
		assertTrue(maze[7][5].equals(boulder));
		assertTrue(maze[6][5] instanceof Background);
	}
	
	
	@Test
	void testPushBoulderIntoBackground_left_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 5, 4);
		player.move(mazeController, "left");
		assertTrue(player.getR() == 5 && player.getC() == 4);
		assertTrue(maze[5][3].equals(boulder));
		assertTrue(maze[5][4] instanceof Background);
	}
	
	@Test
	void testPushBoulderIntoBackground_right_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 5, 6);
		player.move(mazeController, "right");
		assertTrue(player.getR() == 5 && player.getC() == 6);
		assertTrue(maze[5][7].equals(boulder));
		assertTrue(maze[5][6] instanceof Background);
	}
	
	@Test
	void testMoveIntoBackground_up_pass() throws InvalidActionException {
		player.move(mazeController, "up");
		assertTrue(player.getR() == 4 && player.getC() == 5);
	}
	
	@Test
	void testMoveIntoBackground_down_pass() throws InvalidActionException {
		player.move(mazeController, "down");
		assertTrue(player.getR() == 6 && player.getC() == 5);
	}
	
	@Test
	void testMoveIntoBackground_left_pass() throws InvalidActionException {
		player.move(mazeController, "left");
		assertTrue(player.getR() == 5 && player.getC() == 4);
	}
	
	@Test
	void testMoveIntoBackground_right_pass() throws InvalidActionException {
		player.move(mazeController, "right");
		assertTrue(player.getR() == 5 && player.getC() == 6);
	}
	
	@Test
	void testPushBoulderIntoPit_up_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 4, 5);
		Pit pit = new Pit();
		mazeController.insert(pit, 3, 5);
		player.move(mazeController, "up");
		assertTrue(player.getR() == 4 && player.getC() == 5);
		assertTrue(maze[3][5].equals(pit));
		assertTrue(maze[4][5] instanceof Background);
	}
	
	@Test
	void testPushBoulderIntoPit_down_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 6, 5);
		Pit pit = new Pit();
		mazeController.insert(pit, 7, 5);
		player.move(mazeController, "down");
		assertTrue(player.getR() == 6 && player.getC() == 5);
		assertTrue(maze[7][5].equals(pit));
		assertTrue(maze[6][5] instanceof Background);
	}
	
	@Test
	void testPushBoulderIntoPit_left_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 5, 4);
		Pit pit = new Pit();
		mazeController.insert(pit, 5, 3);
		player.move(mazeController, "left");
		assertTrue(player.getR() == 5 && player.getC() == 4);
		assertTrue(maze[5][3].equals(pit));
		assertTrue(maze[5][4] instanceof Background);
	}
	
	@Test
	void testPushBoulderIntoPit_right_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 4, 5);
		Pit pit = new Pit();
		mazeController.insert(pit, 3, 5);
		player.move(mazeController, "up");
		assertTrue(player.getR() == 4 && player.getC() == 5);
		assertTrue(maze[3][5].equals(pit));
		assertTrue(maze[4][5] instanceof Background);
	}
	
	@Test
	void testPushBoulderIntoFloorSwitch_up_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 4, 5);
		FloorSwitch floorSwitch = new FloorSwitch();
		mazeController.insert(floorSwitch, 3, 5);
		player.move(mazeController, "up");
		assertTrue(player.getR() == 4 && player.getC() == 5);
		assertTrue(maze[3][5].equals(floorSwitch));
		assertTrue(maze[4][5] instanceof Background);
	}
	
	@Test
	void testPushBoulderIntoFloorSwitch_down_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 6, 5);
		FloorSwitch floorSwitch = new FloorSwitch();
		mazeController.insert(floorSwitch, 7, 5);
		player.move(mazeController, "down");
		assertTrue(player.getR() == 6 && player.getC() == 5);
		assertTrue(maze[7][5].equals(floorSwitch));
		assertTrue(maze[6][5] instanceof Background);
	}
	
	@Test
	void testPushBoulderIntoFloorSwitch_left_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 5, 4);
		FloorSwitch floorSwitch = new FloorSwitch();
		mazeController.insert(floorSwitch, 5, 3);
		player.move(mazeController, "left");
		assertTrue(player.getR() == 5 && player.getC() == 4);
		assertTrue(maze[5][3].equals(floorSwitch));
		assertTrue(maze[5][4] instanceof Background);
	}
	
	@Test
	void testPushBoulderIntoFloorSwitch_right_pass() throws InvalidActionException {
		Boulder boulder = new Boulder();
		mazeController.insert(boulder, 5, 6);
		FloorSwitch floorSwitch = new FloorSwitch();
		mazeController.insert(floorSwitch, 5, 7);
		player.move(mazeController, "right");
		assertTrue(player.getR() == 5 && player.getC() == 6);
		assertTrue(maze[5][7].equals(floorSwitch));
		assertTrue(maze[5][6] instanceof Background);
	}
	
	@Test
	void testWalkIntoWall_up_pass() throws InvalidActionException {
		Wall wall = new Wall();
		mazeController.insert(wall, 4, 5);
		Exception e = assertThrows(InvalidActionException.class, () -> {
			player.move(mazeController, "up");;
		});
		assertEquals("Cannot walk into wall", e.getMessage());
	}
	
	@Test
	void testWalkIntoWall_down_pass() throws InvalidActionException {
		Wall wall = new Wall();
		mazeController.insert(wall, 6, 5);
		Exception e = assertThrows(InvalidActionException.class, () -> {
			player.move(mazeController, "down");;
		});
		assertEquals("Cannot walk into wall", e.getMessage());
	}
	
	@Test
	void testWalkIntoWall_left_pass() throws InvalidActionException {
		Wall wall = new Wall();
		mazeController.insert(wall, 5, 4);
		Exception e = assertThrows(InvalidActionException.class, () -> {
			player.move(mazeController, "left");;
		});
		assertEquals("Cannot walk into wall", e.getMessage());
	}
	
	@Test
	void testWalkIntoWall_right_pass() throws InvalidActionException {
		Wall wall = new Wall();
		mazeController.insert(wall, 5, 6);
		Exception e = assertThrows(InvalidActionException.class, () -> {
			player.move(mazeController, "right");
		});
		assertEquals("Cannot walk into wall", e.getMessage());
	}
	
}
