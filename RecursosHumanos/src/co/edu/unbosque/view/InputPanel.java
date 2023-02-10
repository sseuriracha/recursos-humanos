package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.*;

public class InputPanel extends JPanel {
	
	private JLabel name;
	private JTextField nameinput;
	private JLabel lastname;
	private JTextField lastnameinput;
	private JLabel position;
	private JTextField positioninput;
	private JLabel id;
	private JTextField idinput;
	private JLabel age;
	private JTextField ageinput;
	private JButton create;
	private JButton read;
	private JButton update;
	private JButton delete;
	public static final String CREATE = "Crear";
	public static final String READ = "Leer";
	public static final String UPDATE = "Actualizar";
	public static final String DELETE = "Eliminar";
	private static final int ANCHO = 5;
	private static final int ALTO = 10;
	
	public InputPanel() {
		
		setLayout(new GridLayout(7, 2));
		name = new JLabel ("Nombre");
		nameinput = new JTextField();
		lastname = new JLabel ("Apellido");
		lastnameinput = new JTextField();
		lastnameinput.setSize(ANCHO, ALTO);
		position = new JLabel ("Cargo");
		positioninput = new JTextField();
		positioninput.setSize(ANCHO, ALTO);
		id = new JLabel ("C.C.");
		idinput = new JTextField();
		idinput.setSize(ANCHO, ALTO);
		age = new JLabel ("Edad");
		ageinput = new JTextField ();
		ageinput.setSize(ANCHO, ALTO);
		create = new JButton ("Crear");
		read = new JButton("Leer");
		update = new JButton("Actualizar");
		delete = new JButton("Borrar");
		create.setActionCommand(CREATE);
		read.setActionCommand(READ);
		update.setActionCommand(UPDATE);
		delete.setActionCommand(DELETE);
		
		add(name);
		add(nameinput);
		add(lastname);
		add(lastnameinput);
		add(position);
		add(positioninput);
		add(id);
		add(idinput);
		add(age);
		add(ageinput);
		add(create);
		add(read);
		add(update);
		add(delete);
		
	}

	public JTextField getNameinput() {
		return nameinput;
	}

	public JTextField getLastnameinput() {
		return lastnameinput;
	}

	public JTextField getPositioninput() {
		return positioninput;
	}

	public JTextField getIdinput() {
		return idinput;
	}

	public JTextField getAgeinput() {
		return ageinput;
	}

	public JButton getCreate() {
		return create;
	}

	public JButton getRead() {
		return read;
	}

	public JButton getUpdate() {
		return update;
	}

	public JButton getDelete() {
		return delete;
	}

}
