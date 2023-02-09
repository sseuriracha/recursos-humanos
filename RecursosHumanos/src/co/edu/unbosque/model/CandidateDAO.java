package co.edu.unbosque.model;

import java.util.ArrayList;

public class CandidateDAO {
	
	ArrayList <CandidateDTO> candidates;
	
	public CandidateDAO() {
		candidates = new ArrayList<CandidateDTO>();
	}

	public ArrayList<CandidateDTO> getCandidates() {
		return candidates;
	}
	
	public void addCandidate (String name, String lastname, String id, String position, int age) {
		candidates.add(new CandidateDTO(name, lastname, id, position, age));
	}
	
	public void removeCandidate (CandidateDTO candidatetoremove) {
		candidates.remove(candidatetoremove);
	}
	
	public void updateCandidate (CandidateDTO candidate, String newname, String newlastname, String newid, String newposition, int newage) {
		candidate.setName(newname);
		candidate.setLastname(newlastname);
		candidate.setPosition(newposition);
		candidate.setId(newid);
		candidate.setAge(newage);
	}
	
}
