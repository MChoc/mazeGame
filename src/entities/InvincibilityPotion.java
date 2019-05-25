package entities;

public class InvincibilityPotion extends Entity {

	public InvincibilityPotion() {
		super(true);
	}

	@Override
	public String getName() {
		return "invincibility potion";
	}
}
