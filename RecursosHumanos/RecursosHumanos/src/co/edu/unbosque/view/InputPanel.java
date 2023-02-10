package co.edu.unbosque.view;

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
	
	public InputPanel() {
		name = new JLabel ("Nombre");
		nameinput = new JTextField();
		lastname = new JLabel ("Apellido");
		lastnameinput = new JTextField();
		position = new JLabel ("Cargo");
		positioninput = new JTextField();
		id = new JLabel ("C.C.");
		idinput = new JTextField();
		age = new JLabel ("Edad");
		ageinput = new JTextField ();
		create = new JButton ();
		read = new JButton();
		update = new JButton();
		delete = new JButton();
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
