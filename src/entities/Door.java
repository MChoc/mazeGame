package entities;

public class Door extends Entity {
	
	public Door() {
		super(false);
	}
	
	public void setOverlappable(boolean overlappable) {
		this.overlappable = overlappable;
	}

}
