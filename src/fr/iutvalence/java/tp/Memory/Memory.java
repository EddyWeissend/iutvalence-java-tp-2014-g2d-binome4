package fr.iutvalence.java.tp.Memory;

/**
 * Définition des caractéristiques du Memory
 * 
 * @author weissene
 * 
 */
public class Memory
{

	/**
	 * Le nombre de cartes du jeu
	 */
	private final static int NOMBRE_DE_CARTES_DU_JEU_TOTAL = 24;

	/**
	 * Terrain de jeu avec les cartes
	 */
	private Plateau plateau;

	/**
	 * Créer une nouvelle partie de Memory jouable : 
	 * -création d'un plateau 
	 * -les cartes sont retournées et placées
	 * 
	 */
	public Memory()
	{
		this.plateau = new Plateau();
	}

	/**
	 * Joue une partie de Memory
	 */
	public void jouer()
	{

	}
}
