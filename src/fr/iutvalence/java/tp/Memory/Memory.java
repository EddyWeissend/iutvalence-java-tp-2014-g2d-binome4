package fr.iutvalence.java.tp.Memory;


/**
 * Definition d'une partie de Memory : 
 * -un plateau rempli de carte melanges et placees face retournes
 * -Des joueurs
 * -des tours de jeu
 * 
 * @author Weissend/Lacoste
 * 
 */
public class Memory
{

	/**
	 * Le nombre de cartes du jeu
	 */
	@SuppressWarnings("unused")
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
	 * Methode qui permet de creer une nouvelle partie de Memory jouable : 
	 * -creation d'un plateau 
	 * -les cartes sont retournees et placees
	 * -les joueurs sont initialisés
	 * @param nom1 
	 * Nom du joueur 1
	 * @param nom2 
	 * Nom du joueur 2
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
	 * methode qui permet de jouer une partie entière de Memory
	 */
	public void jouer()
	{
		while (this.plateau.obtenirNombreDeCartesPresentes() != 0)
		{
			int nbCoups=0;
			int indiceJoueurCourant = 0;
			Joueur joueurCourant = this.joueurs[indiceJoueurCourant];
			while (this.plateau.obtenirNombreDeCartesPresentes() != 0)
				{
				jouerTour(joueurCourant);
				joueurCourant=this.joueurs[(indiceJoueurCourant+1)%2];
				nbCoups++;
				System.out.println(this.plateau.toString());
				System.out.println("nombre cartes presente"+this.plateau.obtenirNombreDeCartesPresentes());
				}
			System.out.println("nombre Coups="+nbCoups);
		}
	}

	/**
	 * Methode qui permet de jouer le tour complet d'un joueur avant de passer au joueur suivant 
	 * @param joueur 
	 * Joueur en train de jouer au Memory
	 */
	private void jouerTour(Joueur joueur)
	{
		boolean a=jouerTourIntermediaire(joueur);
		while (a)
		{
			a=this.jouerTourIntermediaire(joueur);
		}
	}

	/**
	 * methode finissant le tour intermediaire et demarre le prochain tour intermediaire
	 */
	/**
	 * @param joueur
	 * Joueur jouant son tour intermediaire
	 * @return boolean
	 */
	private boolean jouerTourIntermediaire(Joueur joueur)
	{
		Position[] cartesChoisiesPendantCeTourIntermediaire=this.choisirCartesCoherentes(joueur);
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
	 * Redefinition de la methode toString qui permet d'affiche le plateau en mode texte sur la console
	 */
	public String toString()
	{
		return this.plateau.toString();
	}
	
	/**
	 * Methode qui permet au joueur passe en parametre de choisir ses cartes
	 * @param joueur
	 * Joueur choisissant ses cartes
	 * @return Position[]
	 * La methode renvoi un tableau de position
	 */
	public Position[] choisirCartes(Joueur joueur){
		Position[] cartesChoisiesPendantCeTourIntermediaire = new Position[2];
		cartesChoisiesPendantCeTourIntermediaire=joueur.choisirCartes(this.plateau.getNombreDeLignes(),
		this.plateau.getNombreDeColonnes());
		return cartesChoisiesPendantCeTourIntermediaire;
	}

	/**
	 * methode qui permet de verifier si les cartes choisies par le joueur sont coherentes
	 * @param joueur
	 * joueur choisissant les cartes
	 * @return Position[]
	 * cette methode renvoi un tableau de position
	 */
	public Position[] choisirCartesCoherentes(Joueur joueur){
		 Position[] cartesChoisiesPendantCeTourIntermediaire=this.choisirCartes(joueur);
		 for (int i=0;!(this.plateau.positionsCoherentes(cartesChoisiesPendantCeTourIntermediaire[0], cartesChoisiesPendantCeTourIntermediaire[1]));i++)
		 {
			 cartesChoisiesPendantCeTourIntermediaire=this.choisirCartes(joueur);
			 if (i == 250) 
				 {
				 System.out.println("."); 
				 }
		 }
			 
		 			 
		 return cartesChoisiesPendantCeTourIntermediaire;
	}
}
