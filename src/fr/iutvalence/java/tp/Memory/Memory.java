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
	 * Joueurs de la partie
	 */
	private final Joueur[] joueurs;

	/**
	 * Créer une nouvelle partie de Memory jouable : -création d'un plateau -les
	 * cartes sont retournées et placées
	 * 
	 */
	public Memory(String nom1, String nom2)
	{
		this.plateau = new Plateau();
		this.joueurs = new Joueur[2];
		this.joueurs[0] = new Joueur(nom1);
		this.joueurs[1] = new Joueur(nom2);
	}

	/**
	 * Joue une partie de Memory
	 */
	public void jouer()
	{
		while (this.plateau.obtenirNombreDeCartesPresentes() != 0)
		{
			int indiceJoueurCourant = 0;
			Joueur joueurCourant = this.joueurs[indiceJoueurCourant];
			while (this.plateau.obtenirNombreDeCartesPresentes() != 0)
				{
				jouerTour(joueurCourant);
				joueurCourant=this.joueurs[(indiceJoueurCourant+1)%2];
				}
		}
	}

	/**
	 * Joue un tour d'un joueur avant de passer au tour suivant renvoi true si
	 * le tour est fini
	 */
	private void jouerTour(Joueur joueur)
	{

		jouerTourIntermediaire(joueur);
		while (jouerTourIntermediaire(joueur))
		{
			this.jouerTourIntermediaire(joueur);
		}
	}

	/**
	 * methode finissant le tour et demarre le prochain tour
	 */
	/**
	 * @param joueur
	 * @return
	 */
	private boolean jouerTourIntermediaire(Joueur joueur)
	{
		Position[] cartesChoisiesPendantCeTourIntermediaire=this.choisirCartes(joueur);
		Position carte1=cartesChoisiesPendantCeTourIntermediaire[0];
		Position carte2=cartesChoisiesPendantCeTourIntermediaire[1];
		this.plateau.retournerCarte(carte1);
		this.plateau.retournerCarte(carte2);
		if (this.plateau.getIdentifiantCarte(carte1) == this.plateau.getIdentifiantCarte(carte2))
		{
			this.plateau.enleverCarte(carte1);
			this.plateau.enleverCarte(carte2);
			joueur.incrementerNombreDePairesTrouvees();
			this.plateau.decrementerNombreDeCartesPresentes();
			return true;
		}

		this.plateau.retournerCarte(carte1);
		this.plateau.retournerCarte(carte2);
		return false;
	}

	/**
	 * Affiche le plateau en mode texte sur la console
	 */
	public String toString()
	{
		return this.plateau.toString();
	}

	public Position[] choisirCartes(Joueur joueur){
		 
		Position[] cartesChoisiesPendantCeTourIntermediaire = new Position[2];
		cartesChoisiesPendantCeTourIntermediaire=joueur.choisirCartes(this.plateau.getNombreDeLignes(),
				this.plateau.getNombreDeColonnes());
		System.out.println(""+cartesChoisiesPendantCeTourIntermediaire[0].getIndiceLigne()
				+cartesChoisiesPendantCeTourIntermediaire[0].getIndiceColonne()
				+cartesChoisiesPendantCeTourIntermediaire[1].getIndiceLigne()
				+cartesChoisiesPendantCeTourIntermediaire[1].getIndiceColonne());
		
		while(!(this.plateau.positionsCoherentes(cartesChoisiesPendantCeTourIntermediaire[0], cartesChoisiesPendantCeTourIntermediaire[1])))
			this.choisirCartes(joueur);
		return cartesChoisiesPendantCeTourIntermediaire;
	}
}
