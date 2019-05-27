package player;

import entities.*;
import exceptions.InvalidActionException;
import mazeManagement.MazeController;

public class Default implements PlayerState {

	@Override
	public boolean move(Player p, MazeController mazeController, String dir) throws InvalidActionException {
		Entity[][] m = mazeController.getMaze();
		int curr_r = p.getR();
		int curr_c = p.getC();
		int next_c = curr_c;
		int next_r = curr_r;
		int next2_c = curr_c;
		int next2_r = curr_r;

		switch (dir) {
		case "up":
			next_r = curr_r - 1;
			next2_r = next_r - 1;
			break;
		case "down":
			next_r = curr_r + 1;
			next2_r = next_r + 1;
			break;
		case "left":
			next_c = curr_c - 1;
			next2_c = next_c - 1;
			break;
		case "right":
			next_c = curr_c + 1;
			next2_c = next_c + 1;
			break;
		}

		// All boulder allowed to push cases
		if (m[next_r][next_c] instanceof Boulder) {
			if (m[next2_r][next2_c] instanceof Background) {
				m[next2_r][next2_c] = m[next_r][next_c];
				m[next_r][next_c] = new Background();
			} else if (m[next2_r][next2_c] instanceof Pit) {
				m[next_r][next_c] = new Background();
			} else if (m[next2_r][next2_c] instanceof FloorSwitch) {
				((FloorSwitch) m[next2_r][next2_c]).takeBoulder((Boulder) m[next_r][next_c]);
				m[next_r][next_c] = new Background();
			}
		} else if (m[next_r][next_c] instanceof Pit) {
			throw new InvalidActionException("Player died - end game");
		} else if (m[next_r][next_c] instanceof Exit) {
			throw new InvalidActionException("Player reached exit - end game");
		} else if (m[next_r][next_c] instanceof Door) {
			if (!m[next_r][next_c].isOverlappable()) {
				throw new InvalidActionException("Door is locked");
			} else {
				
			}
		// All cannot move cases
		} else if (!m[next_r][next_c].isOverlappable()) {
			throw new InvalidActionException("Cannot walk into " + m[next_r][next_c].getName());
		}

		p.setR(next_r);
		p.setC(next_c);
		return true;
	}

}
