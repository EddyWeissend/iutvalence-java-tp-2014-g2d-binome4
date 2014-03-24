package fr.iutvalence.java.tp.Memory;

import java.util.Random;

/**
 * Définition d'un plateau de jeu
 * 
 * @author weissene
 * 
 */
public class Plateau
{

	/**
	 * Longueur du plateau
	 */
	private final static int NOMBRE_DE_COLONNES = 6;

	/**
	 * Largeur du plateau
	 */
	private final static int NOMBRE_DE_LIGNES = 4;

	/**
	 * Nombre de cases du plateau
	 */

	// private final static int NOMBRE_DE_CASES = NOMBRE_DE_COLONNES *
	// NOMBRE_DE_LIGNES;

	/**
	 * Représente le nombre de cartes présentes sur le plateau
	 */
	private int nombreDeCartesPresentes;

	/**
	 * Represente le nombre de carte face visible sur le plateau
	 */
	private int nombreDeCarteRetournee;

	/**
	 * Tableau où sont stockées les cartes du jeu
	 */
	private Carte[][] cartes;

	/**
	 * Création d'un plateau de jeu : - toutes les cartes du jeu sont retournées
	 * -
	 */
	public Plateau()
	{
		this.nombreDeCartesPresentes = 0;
		this.cartes = new Carte[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
		this.placerCartes();
		this.melangerCartes();

	}

	/**
	 * Initialise/reinitialise le tableau des cartes en les plaçant/remplaçant
	 */
	private void placerCartes()
	{
		int numeroDeCarte = 0;
		for (int indiceLigne = 0; indiceLigne < NOMBRE_DE_LIGNES; indiceLigne++)
			for (int indiceColonne = 0; indiceColonne < NOMBRE_DE_COLONNES; indiceColonne++)
			{
				this.cartes[indiceLigne][indiceColonne] = new Carte(numeroDeCarte);
				this.nombreDeCartesPresentes++;
				if ((this.nombreDeCartesPresentes % 2) == 0)
					numeroDeCarte++;
			}
	}

	/**
	 * Melange les cartes du plateau
	 */
	private void melangerCartes()
	{
		Random generateurDeNombresAleatoires = new Random();

		for (int nombreDePermutations = 0; nombreDePermutations < this.nombreDeCartesPresentes; nombreDePermutations++)
		{
			int numeroDeColonneSrc = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_COLONNES);
			int numeroDeLigneSrc = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_LIGNES);
			int numeroDeColonneDest = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_COLONNES);
			int numeroDeLigneDest = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_LIGNES);

			Carte carteEchangee = this.cartes[numeroDeLigneDest][numeroDeColonneDest];
			this.cartes[numeroDeLigneDest][numeroDeColonneDest] = this.cartes[numeroDeLigneSrc][numeroDeColonneSrc];
			this.cartes[numeroDeLigneSrc][numeroDeColonneSrc] = carteEchangee;
		}
	}

	// TODO écrire un commentaire
	/**
	 * Renvoi le nombre de cartes presentes sur le plateau
	 */
	public int obtenirNombreDeCartesPresentes()
	{
		return this.nombreDeCartesPresentes;

	}

	/**
	 * redefinition de la methode toString qui affiche en texte le plateau
	 */
	public String toString()
	{
		String representationTexteDuPlateau = "";
		for (int indiceLigne = 0; indiceLigne < NOMBRE_DE_LIGNES; indiceLigne++)
		{
			for (int indiceColonne = 0; indiceColonne < NOMBRE_DE_COLONNES; indiceColonne++)
				representationTexteDuPlateau = representationTexteDuPlateau
						+ (this.cartes[indiceLigne][indiceColonne]).toString() + "\t";
			representationTexteDuPlateau = representationTexteDuPlateau + "\n";
		}
		return representationTexteDuPlateau;
	}

	/**
	 * renvoi la valeur de NombreDeCartesRetournee
	 */
	public int obtenirNombreDeCartesRetournee()
	{
		return this.nombreDeCarteRetournee;
	}

	/**
	 * permet de modifier la valeur de NombreDeCartesRetournee
	 */
	public void setNombreDeCartesRetournee(int nombreDeCartesRetourneePendantLeTour)
	{
		this.nombreDeCarteRetournee = nombreDeCartesRetourneePendantLeTour;
	}
	
	

	public void enleverCarte(Carte carte)
	{
		
	}

	public void retournerCarte(Carte carte)
	{
		
	}

}