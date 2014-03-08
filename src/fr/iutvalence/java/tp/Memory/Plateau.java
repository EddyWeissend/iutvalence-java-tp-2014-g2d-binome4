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
	private final static int NOMBRE_DE_CASES = LONGUEUR * LARGEUR;

	/**
	 * Représente le nombre de cartes présentes sur le plateau
	 */
	private int nombreDeCartesPresentes;

	/**
	 * Tableau où sont stockées les cartes du jeu
	 */
	private Carte[][] cartes;

	// TODO corriger le commentaire
	/**
	 * Création d'un plateau de jeu : - un certain de cartes retournées -
	 */
	public Plateau()
	{
		this.nombreDeCartesPresentes = NOMBRE_DE_CASES;
		this.cartes = new Carte[LONGUEUR][LARGEUR];
		for (int indiceColonne = 0; indiceColonne < LONGUEUR; indiceColonne++)
			for (int indiceLigne = 0; indiceLigne < LARGEUR; indiceLigne++)
				this.cartes[indiceColonne][indiceLigne] = new Carte();

	}

	/**
	 * @return le nombre de cartes présentes sur le plateau
	 */
	public int obtenirNombreDeCartesPresentes()
	{
		return this.nombreDeCartesPresentes;
		
	}
}