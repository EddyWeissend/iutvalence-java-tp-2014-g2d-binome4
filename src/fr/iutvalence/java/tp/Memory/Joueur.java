package fr.iutvalence.java.tp.Memory;

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
	 */
	public Position [] choisirCartes()
	{
		Position [] cartesChoisies;
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
