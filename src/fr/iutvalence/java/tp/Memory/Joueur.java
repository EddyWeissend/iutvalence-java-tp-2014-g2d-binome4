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

	public Carte [] choisirCartes()
	{
//		Carte [] cartesChoisies;
//		cartesChoises[0]=
//  	cartesChoises[1]=		
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
