package fr.iutvalence.java.tp.Memory;

// TODO écrire un commentaire plus précis
/**
 * Définition d'une partie de Memory : -un plateau
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
	 * Créer une nouvelle partie de Memory jouable : -création d'un plateau -les
	 * cartes sont retournées et placées
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
		While (this.plateau.obtenirNombreDeCartesPresentes() !=0)
		{
			if (this.plateau.obtenirNombreDeCartesRetournee() == 2)
				this.finDeTour(carte1, carte2);
		}
	}

	/**
	 * methode finissant le tour et demarre le prochain tour
	 */
	private void finDeTour(Carte carte1, Carte carte2)
	{
		if (carte1.getIdentifiantCarte() == carte2.getIdentifiantCarte())
		{
			this.plateau.enleverCarte(carte1);
			this.plateau.enleverCarte(carte2);
		}
		else
		{
			this.plateau.retournerCarte(carte1);
			this.plateau.retournerCarte(carte2);
		}

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
