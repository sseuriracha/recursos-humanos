package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.model.persistencia.Archivo;
import co.edu.unbosque.model.persistencia.CandidateDAO;
import co.edu.unbosque.model.CandidateDTO;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	private View gui;
	private Archivo file;
	private CandidateDAO candidate;
	private ArrayList<CandidateDTO> lst;
	
	public Controller() {
		gui = new View(this);
		gui.setVisible(true);
		file = new Archivo();
		candidate = new CandidateDAO(file);
		lst = file.leerArchivo();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(gui.getiP().CREATE)) {
			candidate.buscarUnCandidato(gui.getiP().getIdinput().getText(), lst);
			candidate.agregar_Candidato(gui.getiP().getNameinput().getText(), gui.getiP().getLastnameinput().getText(), gui.getiP().getPositioninput().getText(), gui.getiP().getIdinput().getText(), Integer.parseInt(gui.getiP().getAgeinput().getText()), lst);
		}
		if (e.getActionCommand().equals(gui.getiP().DELETE)) {
			candidate.buscarUnCandidato(gui.getiP().getIdinput().getText(), lst);
			candidate.eliminarUsuario(gui.getiP().getIdinput().getText(), lst);
		}
	}

}
