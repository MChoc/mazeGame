package player;

import java.util.ArrayList;

import entities.Arrow;
import entities.Bomb;
import entities.HoverPotion;
import entities.InvincibilityPotion;
import entities.Key;
import entities.Sword;
import entities.Treasure;

public class Inventory {

	private ArrayList<Treasure> treasure = new ArrayList<Treasure>();
	private ArrayList<Key> key = new ArrayList<Key>();
	private ArrayList<Bomb> bomb = new ArrayList<Bomb>();
	private Sword sword;
	private ArrayList<Arrow> arrow = new ArrayList<Arrow>();
	private InvincibilityPotion invincibilityPotion;
	private HoverPotion hoverPotion;

	public Inventory() {

	}

}
