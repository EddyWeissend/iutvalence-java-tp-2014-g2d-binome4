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
	private final static int NOMBRE_DE_CASES = NOMBRE_DE_COLONNES * NOMBRE_DE_LIGNES;

	/**
	 * Représente le nombre de cartes présentes sur le plateau
	 */
	private int nombreDeCartesPresentes;

	/**
	 * Tableau où sont stockées les cartes du jeu
	 */
	public Carte[][] cartes;

	// TODO corriger le commentaire
	/**
	 * Création d'un plateau de jeu : - toutes les cartes du jeu sont retournées
	 * -
	 */
	public Plateau()
	{
		this.nombreDeCartesPresentes = NOMBRE_DE_CASES;
		this.cartes = new Carte[NOMBRE_DE_COLONNES][NOMBRE_DE_LIGNES];
		this.placerCartes();
		//this.melangerCartes();

	}

	private void placerCartes()
	{
		int numeroDeCarte = 1;
		for (int indiceColonne = 0; indiceColonne < NOMBRE_DE_COLONNES; indiceColonne++)
			for (int indiceLigne = 0; indiceLigne < NOMBRE_DE_LIGNES; indiceLigne++)
			{
				this.cartes[indiceColonne][indiceLigne] = new Carte(numeroDeCarte);
				if ((indiceColonne + indiceLigne) % 2 == 0)
					numeroDeCarte++;
			}
	}

	private void melangerCartes()
	{
		Random generateurDeNombresAleatoires = new Random();

		for (int nombreDePermutations = 0; nombreDePermutations < this.nombreDeCartesPresentes; nombreDePermutations++)
		{
			int numeroDeColonneSrc = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_COLONNES);
			int numeroDeLigneSrc = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_LIGNES);
			int numeroDeColonneDest = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_COLONNES);
			int numeroDeLigneDest = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_LIGNES);

			Carte carteEchangee = this.cartes[numeroDeColonneDest][numeroDeLigneDest];
			this.cartes[numeroDeColonneDest][numeroDeLigneDest] = this.cartes[numeroDeColonneSrc][numeroDeLigneSrc];
			this.cartes[numeroDeColonneSrc][numeroDeLigneSrc] = carteEchangee;
		}
	}

	/**
	 * @return le nombre de cartes présentes sur le plateau
	 */
	public int obtenirNombreDeCartesPresentes()
	{
		return this.nombreDeCartesPresentes;

	}
}