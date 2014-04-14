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
		cartesChoisies[0]= new Position(generateurDeNombresAleatoires.nextInt(nombreDeLignes),generateurDeNombresAleatoires.nextInt(nombreDeColonnes));
		cartesChoisies[1]= new Position(generateurDeNombresAleatoires.nextInt(nombreDeLignes),generateurDeNombresAleatoires.nextInt(nombreDeColonnes));
		return cartesChoisies;
		
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
