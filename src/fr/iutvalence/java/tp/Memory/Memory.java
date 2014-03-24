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
		while (this.plateau.obtenirNombreDeCartesPresentes() != 0)
		{
			this.jouerTour();
		}
	}

	/**
	 * Joue un tour d'un joueur avant de passer au tour suivant
	 * renvoi true si le tour est fini
	 */
	private boolean jouerTour(Joueur joueur)
	{
		while (jouerTourIntermediaire(joueur))
			this.jouerTourIntermediaire(joueur);
		return true;
	}

	/**
	 * methode finissant le tour et demarre le prochain tour
	 */
	private boolean jouerTourIntermediaire(Joueur joueur)
	{
		Carte [] cartesChoisiesPendantCeTourIntermediaire=joueur.choisirCartes();		
		Carte carte1=cartesChoisiesPendantCeTourIntermediaire[0];
		Carte carte2=cartesChoisiesPendantCeTourIntermediaire[1];
		this.plateau.retournerCarte(carte1);
		this.plateau.retournerCarte(carte2);
		if (carte1.getIdentifiantCarte() == carte2.getIdentifiantCarte())	
		{
			this.plateau.enleverCarte(carte1);
			this.plateau.enleverCarte(carte2);
			joueur.incrementerNombreDePairesTrouvees();
			return true;
		}

		this.plateau.retournerCarte(carte1);
		this.plateau.retournerCarte(carte2);
		return false;

	}

	/**
	 * Affiche le plateau en mode texte sur la console
	 */
	public String ObtenirRepresentationTextDuPlateau()
	{
		return this.plateau.toString();
	}

}
