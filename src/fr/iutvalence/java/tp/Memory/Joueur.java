package fr.iutvalence.java.tp.Memory;

import java.util.Random;

/**
 * Definition de ce qu'est un joueur qui joue au memory
 * 
 * @author Weissend/Lacoste
 *
 */
public class Joueur
{
	/**
	 * Nom du joueur
	 */
	@SuppressWarnings("unused")
	private String nomDuJoueur;
	
	/**
	 * Nombre de paires trouvees
	 */
	private int nombreDePairesTrouvees;

	/**
	 * Creation d'un joueur
	 * @param nomDuJoueur 
	 * Le nom du joueur
	 */
	public Joueur(String nomDuJoueur)
	{
		this.nomDuJoueur=nomDuJoueur;
		this.nombreDePairesTrouvees=0;
	}

	/**
	 * Methode qui permet aux joueurs de choisir des cartes aléatoires sur le plateau 
	 * et qui renvoi les cartes choisies aléatoirement
	 * @param nombreDeColonnes 
	 * Taille en colonnes du plateau
	 * @param nombreDeLignes 
	 * Taille en lignes du plateau
	 * @return Position[]
	 */
	public Position [] choisirCartes(int nombreDeLignes, int nombreDeColonnes)
	{ 
		Random generateurDeNombresAleatoires = new Random();
		Position [] cartesChoisies= new Position[2];
		cartesChoisies[0]= new Position(generateurDeNombresAleatoires.nextInt(nombreDeLignes),generateurDeNombresAleatoires.nextInt(nombreDeColonnes));
		cartesChoisies[1]= new Position(generateurDeNombresAleatoires.nextInt(nombreDeLignes),generateurDeNombresAleatoires.nextInt(nombreDeColonnes));
		//System.out.println(".");
		return cartesChoisies;
		
	}
	
	/**
	 * methode qui permet d'incrementer le nombre de paires trouvees
	 */
	public void incrementerNombreDePairesTrouvees()
	{
		this.nombreDePairesTrouvees ++;
	}
	
	/**
	 * methode qui permet d'obtenir le nombre de paires trouvees par le joueur
	 * @return int
	 */
	public int obtenirNombreDePairesTrouvees()
	{
		return this.nombreDePairesTrouvees;
	}



}
