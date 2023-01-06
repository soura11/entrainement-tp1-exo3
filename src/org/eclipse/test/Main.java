package org.eclipse.test;

import org.eclipse.model.Adresse;
import org.eclipse.model.ListePersonnes;
import org.eclipse.model.Personne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adresse adresse1 = new Adresse("78 rue sauveur tobelem", "Marseille", "13007");
		Adresse adresse2 = new Adresse("54 rue paradis", "Marseille", "13006");
		System.out.println(adresse1);
		
		Personne personne1 = new Personne("Mansoib", 'F', new Adresse("78 rue sauveur tobelem", "Marseille", "13007"));
		System.out.println(personne1);
		Personne personne2 = new Personne("Fabrice", 'M', adresse1, adresse2);
		System.out.println(personne2);
		Personne personne3 = new Personne("Abdoul", 'F', new Adresse("8 avenue de lion", "Lyon", "0669"));
		Personne personne4 = new Personne("Abdala", 'F', new Adresse("8 avenue de kil", "Lyon", "0668"));
		Personne personne5 = new Personne("momo", 'F', new Adresse("rue paradis", "Marseille", "13010"));
		
		ListePersonnes listePersonnes = new ListePersonnes( personne1, personne2, personne3, personne4,personne5);
		System.out.println(listePersonnes.trouverParNom("Abdoul"));
		System.out.println(listePersonnes.existeCodePostal("13002"));
		System.out.println(listePersonnes.existeCodePostal("13007"));
		System.out.println(listePersonnes.existeCodePostal("13006"));
		
		System.out.println(listePersonnes.compterPersonneVille("marseille"));
		System.out.println(listePersonnes.compterPersonneVille("Lyon"));
		System.out.println(listePersonnes.compterPersonneVille("paris"));
		listePersonnes.editerPersonneNom("Abdoul", "Amanda");
		System.out.println(personne3);
		System.out.println(personne2);
		listePersonnes.editerPersonneCodePostal("13007", "7806");
		System.out.println(personne2);
	

	}

}
