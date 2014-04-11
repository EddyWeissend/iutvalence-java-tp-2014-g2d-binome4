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

		Random generateurDeNombresAleatoires = new Random();
		Position [] cartesChoisies= new Position[2];
		cartesChoisies[0].setIndiceLigne(generateurDeNombresAleatoires.nextInt(8));
		cartesChoisies[0].setIndiceColonne(generateurDeNombresAleatoires.nextInt(8));
		cartesChoisies[1].setIndiceLigne(generateurDeNombresAleatoires.nextInt(8));
		cartesChoisies[1].setIndiceColonne(generateurDeNombresAleatoires.nextInt(8));
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
