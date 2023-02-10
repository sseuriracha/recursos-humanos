package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class InputFrame extends JFrame {
	
	private InputPanel iP;
	
	public InputFrame (Controller cont) {
		setSize(750, 500);
		setResizable(false);
		setTitle("Gestión de Candidatos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		iP = new InputPanel();
		add(iP);
		iP.getCreate().addActionListener(cont);
		iP.getRead().addActionListener(cont);
		iP.getUpdate().addActionListener(cont);
		iP.getDelete().addActionListener(cont);
	}

	public InputPanel getiP() {
		return iP;
	}
	

}
