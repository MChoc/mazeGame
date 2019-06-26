package main;

import java.util.Scanner;

import mazeManagement.MazeController;
import player.Player;

public class Main {
	
	MazeController mazeController;
	Player player;
	
	public Main() {
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Start ");
		
		while(true) {
			if (s.nextLine().equals("end")) {
				break;
			}

		}
		
		s.close();
	}

}
