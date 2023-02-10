package co.edu.unbosque.model.persistencia;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CandidateDTO;

public class CandidateDAO {
	
	private Archivo archivo;
	
	public CandidateDAO(Archivo archivo) {
		this.archivo = archivo;
	}
	
	public CandidateDTO buscarUnCandidato(String cedula, ArrayList<CandidateDTO> candidatos) {
		CandidateDTO encontrado = null;
		if (candidatos.size() != 0) {
			for (int i = 0; i < candidatos.size(); i++) {
				if (cedula.equals(candidatos.get(i).getId())) {
					encontrado = candidatos.get(i);
					return encontrado;
				}
			}
		}
		return encontrado;
	}
	
	public boolean agregar_Candidato(String nombre, String apellido, String cargo, String cedula, int edad,
			ArrayList<CandidateDTO> lst) {

		CandidateDTO agregar = new CandidateDTO(nombre, apellido, cargo, cedula, edad);
		
		if (buscarUnCandidato(cedula, lst) == null) {
			lst.add(agregar);
			archivo.escribir(lst);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "El candidato ya se encuentra registrado");
			return false;
		}
	}
	
	public void eliminarUsuario(String cedula, ArrayList<CandidateDTO> lst) {
		if (!cedula.equals("")) {
			if (buscarUnCandidato(cedula, lst) != null) {
				try {
					CandidateDTO eliminar = buscarUnCandidato(cedula, lst);
					lst.remove(eliminar);
					archivo.getArchivo().delete();
					archivo.getArchivo().createNewFile();
					archivo.escribir(lst);
					JOptionPane.showMessageDialog(null, "El candidato se elimino correctamente");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(null, "El candidato ingresado no se encuentra registrado");
			}
		}
	}
	
}
