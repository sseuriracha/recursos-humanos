package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DisplayPanel extends JPanel {
	
	private JTextArea list;
	
	public DisplayPanel() {
		list = new JTextArea();
		list.setSize(700, 450);
		list.setEditable(false);
		add(list);
		// TODO Auto-generated constructor stub
	}

	public JTextArea getList() {
		return list;
	}

	
	
	
}
