package player;

import exceptions.InvalidActionException;
import mazeManagement.MazeController;

public interface PlayerState {

	public boolean move(Player player, MazeController mazeController, String dir) throws InvalidActionException;

}
