package org.eclipse.model;

import java.lang.foreign.ValueLayout.OfAddress;
import java.util.Arrays;

public class ListePersonnes {
	private Personne personnes[];

	public ListePersonnes() {
		super();
	}

	public ListePersonnes(Personne ... personnes) {
		super();
		this.personnes = personnes;
	}

	public Personne[] getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personne ... personnes) {
		this.personnes = personnes;
	}
	
	public Personne trouverParNom(String value) {
		
		for (Personne personne: personnes) {
			if (personne.getNom().equalsIgnoreCase(value)){
				return personne;
			}
		} return null;
	}
	
	public boolean existeCodePostal (String value) {
		for (Personne personne : personnes) {
			for(Adresse adresse : personne.getAdresses()) {
				if(adresse.getCodePostal().equals(value)) {
				return true; 
				}
			} 
	}return false;
	}
	
	public int compterPersonneVille(String value) {
		var compt = 0;
		for (Personne personne : personnes) {
			for(Adresse adresse : personne.getAdresses()) {
				if(adresse.getVille().equalsIgnoreCase(value)){
					compt ++;
					break;
				} 
			}
		} return compt;
	}
	
	public void editerPersonneNom(String oldNom, String newNom) {
		for(Personne personne : personnes) {
			if(personne.getNom().equals(oldNom)) {
				personne.setNom(newNom);
			}
		}
	}
	public void editerPersonneCodePostal(String oldCP, String newCP) {
		for(Personne personne : personnes) {
			for(Adresse adresse : personne.getAdresses()) {
			if(adresse.getCodePostal().equals(oldCP)) {
				adresse.setCodePostal(newCP);;
			}
		}
	}
	}
				
			


	@Override
	public String toString() {
		return "ListePersonnes [personnes=" + Arrays.toString(personnes) + "]";
	}
	
	

}
