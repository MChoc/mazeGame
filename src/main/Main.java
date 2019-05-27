package main;

import java.util.Scanner;

public class Main {
	
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
