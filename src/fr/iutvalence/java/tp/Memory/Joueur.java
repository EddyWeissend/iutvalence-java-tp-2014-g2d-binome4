package fr.iutvalence.java.tp.Memory;

import java.util.Random;

public class Joueur
{
	/**
	 * Nom du joueur
	 */
	private String nomDuJoueur;
	
	/**
	 * Nombre de paires trouvees
	 */
	private int nombreDePairesTrouvees;

	/**
	 * Création d'un joueur : un nom
	 */
	public Joueur(String nomDuJoueur)
	{
		this.nomDuJoueur=nomDuJoueur;
		this.nombreDePairesTrouvees=0;
	}

	/**
	 * Retourne les cartes choisies par le joueur
	 * @param nombreDeColonnes 
	 * @param nombreDeLignes 
	 */
	public Position [] choisirCartes(int nombreDeLignes, int nombreDeColonnes)
	{
		Position [] cartesChoisies= new Position[2];
		Position [] nombreChoixPossible = new Position[];
		Random generateurDeNombresAleatoires = new Random();
		for (int indiceLigne = 0; indiceLigne < nombreDeLignes; indiceLigne++)
			for (int indiceColonne = 0; indiceColonne < nombreDeColonnes; indiceColonne++)
			{
				if (plateau.cartes[indiceLigne][indiceColonne].aEteTrouvee)
			}
		cartesChoisies[0]=
    	cartesChoisies[1]=
		return null;
		
	}
	
	/**
	 * Incrémente le nombre de paires trouvées
	 */
	public void incrementerNombreDePairesTrouvees()
	{
		this.nombreDePairesTrouvees ++;
	}
	
	/**
	 * retourne le nombre de paires trouvees
	 */
	public int obtenirNombreDePairesTrouvees()
	{
		return this.nombreDePairesTrouvees;
	}



}
