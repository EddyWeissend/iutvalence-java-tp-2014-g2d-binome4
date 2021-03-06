package fr.iutvalence.java.tp.Memory;

/**
 * Definition d'une partie de Memory : -un plateau rempli de carte melanges et
 * placees face retournes -Des joueurs -des tours de jeu
 * 
 * @author Weissend/Lacoste
 * 
 */
public class Memory
{
	/**
	 * Terrain de jeu avec les cartes
	 */
	private Plateau plateau;

	/**
	 * Joueurs de la partie
	 */
	private final Joueur[] joueurs;

	
	/**
	 * L'affichage
	 */
	private final Affichage affichage;
	/**
	 * Methode qui permet de creer une nouvelle partie de Memory jouable :
	 * -creation d'un plateau -les cartes sont retournees et placees -les
	 * joueurs sont initialisés
	 * 
	 * @param joueurs les joueurs
	 * @param affichage l'affichage
	 * 
	 */
	public Memory(Joueur[] joueurs, Affichage affichage)
	{
		this.plateau = new Plateau();
		this.joueurs = joueurs;
		this.affichage = affichage;
	}

	/**
	 * methode qui permet de jouer une partie entière de Memory
	 */
	public void jouer()
	{
		this.affichage.afficherDebutPartie();
		while (this.plateau.obtenirNombreDeCartesPresentes() != 0)
		{
			int indiceJoueurCourant = 0;
			Joueur joueurCourant = this.joueurs[indiceJoueurCourant];
			while (this.plateau.obtenirNombreDeCartesPresentes() != 0)
			{
				this.jouerTour(joueurCourant);
				joueurCourant = this.joueurs[(indiceJoueurCourant + 1) % 2];
				this.affichage.afficherPlateau(this.plateau);		
			}
		}
		this.affichage.afficherFinPartie();
	}

	/**
	 * Methode qui permet de jouer le tour complet d'un joueur avant de passer
	 * au joueur suivant
	 * 
	 * @param joueur
	 *            Joueur en train de jouer au Memory
	 */
	private void jouerTour(Joueur joueur)
	{
		boolean a = jouerTourIntermediaire(joueur);
		while (a)
		{
			a = this.jouerTourIntermediaire(joueur);
		}
	}

	/**
	 * methode finissant le tour intermediaire et demarre le prochain tour
	 * intermediaire
	 */
	/**
	 * @param joueur
	 *            Joueur jouant son tour intermediaire
	 * @return boolean
	 */
	private boolean jouerTourIntermediaire(Joueur joueur)
	{
		Position[] cartesChoisiesPendantCeTourIntermediaire = this
				.choisirCartesCoherentes(joueur);
		Position carte1 = cartesChoisiesPendantCeTourIntermediaire[0];
		Position carte2 = cartesChoisiesPendantCeTourIntermediaire[1];
		this.plateau.retournerCarte(carte1);
		this.plateau.retournerCarte(carte2);
		if (this.plateau.getIdentifiantCarte(carte1) == this.plateau
				.getIdentifiantCarte(carte2))
		{
			this.plateau.enleverCarte(carte1);
			this.affichage.desactiverCarte(carte1);
			this.plateau.enleverCarte(carte2);
			this.affichage.desactiverCarte(carte2);
			joueur.incrementerNombreDePairesTrouvees();
			this.plateau.decrementerNombreDeCartesPresentes();
			return true;
		}

		this.plateau.retournerCarte(carte1);
		this.affichage.retournerCarte(carte1);
		this.plateau.retournerCarte(carte2);
		this.affichage.retournerCarte(carte2);
		return false;
	}

	/**
	 * Redefinition de la methode toString qui permet d'affiche le plateau en
	 * mode texte sur la console
	 */
	public String toString()
	{
		return this.plateau.toString();
	}

	/**
	 * Methode qui permet au joueur passe en parametre de choisir ses cartes
	 * 
	 * @param joueur
	 *            Joueur choisissant ses cartes
	 * @return Position[] La methode renvoi un tableau de position
	 */
	public Position[] choisirCartes(Joueur joueur)
	{
		Position[] cartesChoisiesPendantCeTourIntermediaire = new Position[2];
		cartesChoisiesPendantCeTourIntermediaire = joueur.choisirCartes(
				this.plateau.getNombreDeLignes(),
				this.plateau.getNombreDeColonnes());
		return cartesChoisiesPendantCeTourIntermediaire;
	}

	/**
	 * methode qui permet de verifier si les cartes choisies par le joueur sont
	 * coherentes
	 * 
	 * @param joueur
	 *            joueur choisissant les cartes
	 * @return Position[] cette methode renvoi un tableau de position
	 */
	public Position[] choisirCartesCoherentes(Joueur joueur)
	{
		Position[] cartesChoisiesPendantCeTourIntermediaire = this
				.choisirCartes(joueur);
		for (int i = 0; !(this.plateau.positionsCoherentes(
				cartesChoisiesPendantCeTourIntermediaire[0],
				cartesChoisiesPendantCeTourIntermediaire[1])); i++)
		{
			cartesChoisiesPendantCeTourIntermediaire = this
					.choisirCartes(joueur);
		}

		return cartesChoisiesPendantCeTourIntermediaire;
	}


	public Plateau getPlateau(){
		return this.plateau;
		}
	}
