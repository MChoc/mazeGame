package mazeManagement;

import java.util.ArrayList;

import entities.*;
import exceptions.InvalidActionException;
import liveEntities.*;

public class MazeController {

	Entity[][] maze;
	ArrayList<LiveEntity> liveEntities;
	boolean hoverPotionCheck = false;
	boolean invincibilityPotionCheck = false;

	public MazeController(int xDim, int yDim) {
		this.maze = new Entity[xDim][yDim];
		mazeSetup();
	}

	private void mazeSetup() {
		for (int i=0; i <maze.length; i++) {
			for (int j=0; j<maze[i].length; j++) {
				if (i == 0 || i == maze.length-1 || j == 0 || j == maze[i].length-1) {
					maze[i][j] = new Wall();
				} else {
					maze[i][j] = new Background();
				}
			}
		}
	}

	public boolean mazeBuildCheck() {
		if (!hoverPotionCheck || !invincibilityPotionCheck) {
			return false;
		}
		return true;
	}

	public Entity[][] getMaze() {
		return this.maze;
	}

	public boolean insert(Entity entity, int r, int c) throws InvalidActionException {
		if (r == 0 || r == maze.length-1 || c == 0 || c == maze[0].length-1) {
			throw new InvalidActionException("Inserting on border");
		}
		maze[r][c] = entity;
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		MazeController maze = new MazeController(10, 10);
		for (int i=0; i<maze.getMaze().length; i++) {
			System.out.println();
			for(int j=0; j<maze.getMaze()[i].length; j++) {
				if (maze.getMaze()[i][j] instanceof Background) {
					System.out.print("0");
				} else if (maze.getMaze()[i][j] instanceof Wall) {
					System.out.print("1");
				}
			}
		}
	}

}
