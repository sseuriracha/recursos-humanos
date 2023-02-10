package co.edu.unbosque.controller;

import java.awt.event.ActionListener;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

import co.edu.unbosque.model.persistencia.Archivo;

public class controller implements ActionListener, MouseWheelListener {
	private View vi;
	private Archivo rawr;
	private ArrayList<CandidatoDTO>	lst;
	private int op;
	private long eliminar; 
	
	/**
	 * Aca se inicializaran los objetos dxe la vista y el modelo
	 */
public controller () {
	vi = new View(this);
	vi.getPrincipal().setVisible(true);
	rawr = new Archivo();
	canDao =new CandidatoDAO(rawr);
	lst = rawr.leerArchivo();
	op = 0;
	eliminar = 0 ; 
}
}
