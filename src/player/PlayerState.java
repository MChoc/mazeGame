package player;

import exceptions.InvalidActionException;
import mazeManagement.Maze;

public interface PlayerState {

	public boolean move(Player player, Maze maze, String dir) throws InvalidActionException;

}
