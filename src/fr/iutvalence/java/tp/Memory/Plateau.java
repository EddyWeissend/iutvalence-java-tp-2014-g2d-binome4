package fr.iutvalence.java.tp.Memory;

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
	private final static int LONGUEUR = 6;

	/**
	 * Largeur du plateau
	 */
	private final static int LARGEUR = 4;

	/**
	 * Nombre de cases du plateau
	 */

	private final static int NOMBRE_DE_CASES_DU_PLATEAU = LONGUEUR * LARGEUR;

	/**
	 * Représente le nombre de cartes présentes sur le plateau
	 */
	private int nombreDeCartesPresenteSurLePlateau;

	/**
	 * Tableau où sont stockés les cartes du jeu
	 */
	private Carte[][] lesCartesDuJeu;

	/**
	 * Création d'un plateau de jeu : - un certain de cartes retournées -
	 */
	public Plateau()
	{
		this.nombreDeCartesPresenteSurLePlateau = NOMBRE_DE_CASES_DU_PLATEAU;
		this.lesCartesDuJeu = new Carte[LONGUEUR][LARGEUR];
		for (int indiceColonne = 0; indiceColonne < LONGUEUR; indiceColonne++)
			for (int indiceLigne = 0; indiceLigne < LARGEUR; indiceLigne++)
				this.lesCartesDuJeu[indiceColonne][indiceLigne] = new Carte();

	}

	/**
	 * @return le nombre de cartes présentes sur le plateau
	 */
	public int getNombreDeCartesPresenteSurLePlateau()
	{
		return this.nombreDeCartesPresenteSurLePlateau;
		
	}
}