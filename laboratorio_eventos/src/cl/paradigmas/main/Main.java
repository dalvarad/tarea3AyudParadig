package cl.paradigmas.main;

import cl.paradigmas.gui.Ventana;


public class Main {
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		
		
		/* 
		 * aqui se agregan los botones y 
		 * se agregan los eventos creados en 
		 * EventBuilder
		 * 
		 * */
		ventana.setVisible(true);
	}

}
