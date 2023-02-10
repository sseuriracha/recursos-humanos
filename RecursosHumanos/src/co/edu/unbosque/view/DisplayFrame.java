package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class DisplayFrame extends JFrame {
	
	private DisplayPanel dP;
	
	public DisplayFrame(Controller cont) {
		setSize(750, 500);
		setResizable(false);
		setTitle("Listado de Candidatos");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		dP = new DisplayPanel();
		add(dP);
		// TODO Auto-generated constructor stub
	}

	public DisplayPanel getdP() {
		return dP;
	}
	
	
	
	

}
