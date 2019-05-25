package entities;

import exceptions.InvalidActionException;

public class FloorSwitch extends Entity {
	
	Boulder boulder;

	public FloorSwitch() {
		super(true);
		this.boulder = null;
	}
	
	public boolean takeBoulder(Boulder boulder) throws InvalidActionException {
		if(boulder != null) {
			throw new InvalidActionException("Boulder in the way");
		}
		this.boulder = boulder;
		return true;
	}

	@Override
	public String getName() {
		return "floor switch";
	}
}
