package view;

import Controller.PrintTID;

public class Principal {

	public static void main(String[] args) {
		
		
		
		for (int IdThread =0; IdThread <5; IdThread++) {
			Thread printTID = new PrintTID(IdThread);
			printTID.start();
		}
	}

}
