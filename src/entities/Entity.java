package entities;

public class Entity {

	boolean overlappable;
	
	public Entity(boolean overlappable) {
		this.overlappable = overlappable;
	}

	public boolean isOverlappable() {
		return overlappable;
	}
	
	public String getName() {
		return this.getClass().getSimpleName().toLowerCase();
	}

}
