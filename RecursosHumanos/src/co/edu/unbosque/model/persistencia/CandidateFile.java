package co.edu.unbosque.model.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.CandidateDTO;

/**
 * The CandidateFile class performs the methods required to write and read the file where candidate information will be stored.
 *
 */

public class CandidateFile {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	private File archivo = new File("./candidatos.dat");
	
	/**
	 *  <p> Constructor for the CandidateFile class. It creates the file where candidate information will be stored.
	 */
	public CandidateFile() {
		if (archivo.exists()) {
		} else {
			try {
				archivo.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * <p> Writes the file with all the candidate information.
	 * @param lst list containing all of the candidates created. 
	 */
	
	public void write(ArrayList<CandidateDTO> lst) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(lst);
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException a) {
			// TODO: handle exception
		}
		
	}
	
	/**
	 * <p> Returns the file containing all the candidate information, in the shape of a list.
	 * @return list with all the candidate objects stored in the file.
	 */
	
	public ArrayList<CandidateDTO> leerArchivo() {
		ArrayList<CandidateDTO> salida = new ArrayList<CandidateDTO>();
		if (archivo.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));
				salida = (ArrayList<CandidateDTO>) entrada.readObject();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return salida;
	}

	public ObjectInputStream getEntrada() {
		return entrada;
	}

	public void setEntrada(ObjectInputStream entrada) {
		this.entrada = entrada;
	}

	public ObjectOutputStream getSalida() {
		return salida;
	}

	public void setSalida(ObjectOutputStream salida) {
		this.salida = salida;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}
	
}
