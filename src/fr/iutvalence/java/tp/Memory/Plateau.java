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

	private final static int NOMBRE_DE_CASES_DU_PLATEAU = LONGUEUR*LARGEUR;
	
	/**
	 * Représente le nombre de cartes présentes sur le plateau
	 */
	private int nombreDeCartesPresenteSurLePlateau;

	/**
	 * Création d'un plateau de jeu :
	 * - 
	 */
	public Plateau()
	{
		
	}
	
	/**
	 * @return le nombre de cartes présentes sur le plateau
	 */
	public int getNombreDeCartesPresenteSurLePlateau()
	{
		return this.nombreDeCartesPresenteSurLePlateau;
	}
}