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

public class Archivo {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	private File archivo = new File("./candidatos.dat");
	
	public Archivo() {
		if (archivo.exists()) {
		} else {
			try {
				archivo.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void escribir(ArrayList<CandidateDTO> lst) {
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
