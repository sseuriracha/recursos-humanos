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
	
	public CandidateDTO searchCandidate(String cedula, ArrayList<CandidateDTO> candidatos) {
		CandidateDTO candidatesearched = null;
		if (candidatos.size() != 0) {
			for (int i = 0; i < candidatos.size(); i++) {
				if (cedula.equals(candidatos.get(i).getId())) {
					candidatesearched = candidatos.get(i);
					return candidatesearched;
				}
			}
		}
		return candidatesearched;
	}
	
	public boolean addCandidate(String nombre, String apellido, String cargo, String cedula, int edad,
			ArrayList<CandidateDTO> lst) {

		CandidateDTO agregar = new CandidateDTO(nombre, apellido, cargo, cedula, edad);
		
		if (searchCandidate(cedula, lst) == null) {
			lst.add(agregar);
			archivo.escribir(lst);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "El candidato ya se encuentra registrado");
			return false;
		}
	}
	
	public void deleteCandidate(String cedula, ArrayList<CandidateDTO> lst) {
		if (!cedula.equals("")) {
			if (searchCandidate(cedula, lst) != null) {
				try {
					CandidateDTO eliminar = searchCandidate(cedula, lst);
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
	
	public void updateCandidate (String newname, String newlast, String newid, String newpos, int newage, ArrayList<CandidateDTO> lst) {
		if (!newid.equals("")) {
			if (searchCandidate(newid, lst) != null) {
				try {
					CandidateDTO toupdate = searchCandidate(newid, lst);
					toupdate.setName(newname);
					toupdate.setLastname(newlast);
					toupdate.setPosition(newpos);
					toupdate.setId(newid);
					toupdate.setAge(newage);
					archivo.getArchivo().delete();
					archivo.getArchivo().createNewFile();
					archivo.escribir(lst);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
}
