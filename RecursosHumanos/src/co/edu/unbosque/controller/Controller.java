package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistencia.CandidateFile;
import co.edu.unbosque.model.persistencia.CandidateDAO;
import co.edu.unbosque.model.CandidateDTO;
import co.edu.unbosque.view.DisplayFrame;
import co.edu.unbosque.view.InputFrame;

/**
 * The Controller class, implementing ActionListener, is where all the methods are triggered according to which part of the GUI the user interacts with. The ActionListener is the interface that allows the software to perform an operation after some input from the user in the input windo.
 */

public class Controller implements ActionListener {
	private InputFrame gui;
	private DisplayFrame display;
	private CandidateFile file;
	private CandidateDAO candidate;
	private ArrayList<CandidateDTO> lst;
	
/**
 * The class' constructor creates all the objects necessary to perform the operations that the user requires.
 */
	
	public Controller() {
		gui = new InputFrame(this);
		display = new DisplayFrame();
		gui.setVisible(true);
		file = new CandidateFile();
		candidate = new CandidateDAO(file);
		lst = file.leerArchivo();
		// TODO Auto-generated constructor stub
	}

	/**
	 * The actionPerformed method is implemented from the ActionListener interface. It allows for methods to run after an interaction with the user(an event) happens. 
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(gui.getiP().CREATE)) {
			try {
				candidate.addCandidate(gui.getiP().getNameinput().getText(), gui.getiP().getLastnameinput().getText(), gui.getiP().getPositioninput().getText(), gui.getiP().getIdinput().getText(), Integer.parseInt(gui.getiP().getAgeinput().getText()), lst);
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Por favor, no ingrese letras para la edad");
			}
		}
		if (e.getActionCommand().equals(gui.getiP().DELETE)) {
			candidate.deleteCandidate(gui.getiP().getIdinput().getText(), lst);
		}
		if (e.getActionCommand().equals(gui.getiP().READ)) {
			display.getdP().getList().setText(lst.toString());
			display.setVisible(true);
		}
		if (e.getActionCommand().equals(gui.getiP().UPDATE)) {
			try {
				candidate.updateCandidate(gui.getiP().getNameinput().getText(), gui.getiP().getLastnameinput().getText(), gui.getiP().getIdinput().getText(), gui.getiP().getPositioninput().getText(), Integer.parseInt(gui.getiP().getAgeinput().getText()), lst);
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Por favor, no ingrese letras para la edad");
			}
		}
	}

}
