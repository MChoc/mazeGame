package player;

import exceptions.InvalidActionException;
import liveEntities.LiveEntity;
import mazeManagement.MazeController;

public class Player extends LiveEntity {

	private PlayerState playerState = new Default();

	public Player(int r, int c) {
		super(r, c, false);
	}

	public void setState(PlayerState newState) {
		playerState = newState;
	}

	public void move(MazeController maze, String dir) throws InvalidActionException {
		playerState.move(this, maze, dir);
	}

	public void sword(MazeController maze, String dir) {

	}

	public void arrow(MazeController maze, String dir) {

	}
	
}
