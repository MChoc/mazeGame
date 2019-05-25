package player;

import exceptions.InvalidActionException;
import liveEntities.LiveEntity;
import mazeManagement.Maze;

public class Player extends LiveEntity {

	private PlayerState playerState = new Default();

	public Player(int r, int c) {
		super(r, c, false);
	}

	public void setState(PlayerState newState) {
		playerState = newState;
	}

	public void move(Maze maze, String dir) throws InvalidActionException {
		playerState.move(this, maze, dir);
	}
}
