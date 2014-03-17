package fr.iutvalence.java.tp.Memory;

// TODO écrire un commentaire plus précis
/**
 * Définition d'une partie de Memory
 * 
 * @author weissene
 * 
 */
public class Memory
{

	/**
	 * Le nombre de cartes du jeu
	 */
	private final static int NOMBRE_TOTAL_DE_CARTES_DU_JEU = 24;

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
    
	/**
	 * Affiche le plateau en mode texte sur la console
	 */
    public String ObtenirRepresentationTextDuPlateau()
    {
    	return this.plateau.toString();
    }


	// TODO écrire un commentaire 

}
