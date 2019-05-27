package liveEntities;

import entities.Entity;

public class LiveEntity extends Entity {
	
	int r;
	int c;

	public LiveEntity(int r, int c, boolean overlappable) {
		super(overlappable);
		this.r = r;
		this.c = c;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
