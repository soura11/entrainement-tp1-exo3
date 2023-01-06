package org.eclipse.model;

import java.util.Arrays;

public class Personne {
	private String nom;
	private char sexe;
	private Adresse[] adresses ;
	
	public Personne() {
		super();
	}

	public Personne(String nom, char sexe, Adresse ... adresses) {
		super();
		this.nom = nom;
		this.setSexe(sexe);
		this.adresses = adresses;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe == 'M' ||  sexe == 'F' ? sexe : 'M' ;
	}

	public Adresse[] getAdresses() {
		return adresses;
	}

	public void setAdresses(Adresse[] adresses) {
		this.adresses = adresses;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", sexe=" + sexe + ", adresses=" + Arrays.toString(adresses) + "]";
	}

	
	}
	
	
	

	
	
	




