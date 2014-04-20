package fr.iutvalence.java.tp.Memory;

import java.util.Random;

/**
 * Definition d'un plateau de jeu
 * 
 * @author Weissend/Lacoste
 * 
 */
public class Plateau
{

	/**
	 * Longueur du plateau
	 */
	private final static int NOMBRE_DE_COLONNES = 6;

	/**
	 * Largeur du plateau
	 */
	private final static int NOMBRE_DE_LIGNES = 4;

	/**
	 * Nombre de cases du plateau
	 */

	/**
	 * Represente le nombre de cartes presentes sur le plateau
	 */
	private int nombreDeCartesPresentes;

	/**
	 * Tableau ou sont stockees les cartes du jeu
	 */
	private Carte[][] cartes;

	/**
	 * Creation d'un plateau de jeu : -on initialise le plateau vide
	 * -on lui ajoute des cartes face retournees
	 * -on melange les cartes
	 * 
	 */
	public Plateau()
	{
		this.nombreDeCartesPresentes = 0;
		this.cartes = new Carte[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
		this.placerCartes();
		this.melangerCartes();

	}

	/**
	 * Methode qui Initialise/reinitialise le tableau des cartes en les placant/remplacant
	 */
	private void placerCartes()
	{
		int numeroDeCarte = 0;
		for (int indiceLigne = 0; indiceLigne < NOMBRE_DE_LIGNES; indiceLigne++)
			for (int indiceColonne = 0; indiceColonne < NOMBRE_DE_COLONNES; indiceColonne++)
			{
				this.cartes[indiceLigne][indiceColonne] = new Carte(numeroDeCarte);
				this.nombreDeCartesPresentes++;
				if ((this.nombreDeCartesPresentes % 2) == 0)
					numeroDeCarte++;
			}
	}

	/**
	 * Methode qui melange les cartes du plateau
	 */
	private void melangerCartes()
	{
		Random generateurDeNombresAleatoires = new Random();

		for (int nombreDePermutations = 0; nombreDePermutations < this.nombreDeCartesPresentes; nombreDePermutations++)
		{
			int numeroDeColonneSrc = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_COLONNES);
			int numeroDeLigneSrc = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_LIGNES);
			int numeroDeColonneDest = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_COLONNES);
			int numeroDeLigneDest = generateurDeNombresAleatoires.nextInt(NOMBRE_DE_LIGNES);

			Carte carteEchangee = this.cartes[numeroDeLigneDest][numeroDeColonneDest];
			this.cartes[numeroDeLigneDest][numeroDeColonneDest] = this.cartes[numeroDeLigneSrc][numeroDeColonneSrc];
			this.cartes[numeroDeLigneSrc][numeroDeColonneSrc] = carteEchangee;
		}
	}

	/**
	 * Renvoi le nombre de cartes presentes sur le plateau
	 * @return int
	 */
	public int obtenirNombreDeCartesPresentes()
	{
		return this.nombreDeCartesPresentes;

	}

	/**
	 * redefinition de la methode toString qui affiche en texte le plateau
	 */
	public String toString()
	{
		String representationTexteDuPlateau = "";
		for (int indiceLigne = 0; indiceLigne < NOMBRE_DE_LIGNES; indiceLigne++)
		{
			for (int indiceColonne = 0; indiceColonne < NOMBRE_DE_COLONNES; indiceColonne++)
				representationTexteDuPlateau = representationTexteDuPlateau
						+ (this.cartes[indiceLigne][indiceColonne]).toString() + "\t";
			representationTexteDuPlateau = representationTexteDuPlateau + "\n";
		}
		return representationTexteDuPlateau;
	}

	/**
	 * Methode qui enleve la carte du jeu a la position passee en parametre
	 * @param carte 
	 * Carte a la position choisie
	 */
	public void enleverCarte(Position carte)
	{
		this.cartes[carte.obtenirIndiceLigne()][carte.obtenirIndiceColonne()].enleverCarte();
	}

	/**
	 * Methode qui retourne la carte du jeu a la position passee en parametre
	 * @param carte
	 * Carte a la position choisie 
	 */
	public void retournerCarte(Position carte)
	{
		this.cartes[carte.obtenirIndiceLigne()][carte.obtenirIndiceColonne()].retournerCarte();
	}
	
	/**
	 * Renvoi l'identifiant de la carte a la position passee en parametre
	 * @param carte 
	 * Carte la position choisi
	 * @return int
	 * Identifiant de la carte
	 */
	public int getIdentifiantCarte(Position carte)
	{
		return this.cartes[carte.obtenirIndiceLigne()][carte.obtenirIndiceColonne()].obtenirIdentifiantCarte();
	}

	/**
	 * methode qui reduit le nombre de cartes presentes sur le plateau a chaque fois qu'une paire est trouvee
	 */
	public void decrementerNombreDeCartesPresentes()
	{
		this.nombreDeCartesPresentes -= 2;
	}

	/**
	 * Methode qui verifie si les cartes choisies sont differentes ou si elles ont deja ete trouvees
	 *
	 * @param carte1
	 * Première carte choisie a la position passee en parametre
	 * @param carte2
	 * Deuxième carte choisie a la position passee en parametre
	 * @return boolean
	 */
	public boolean positionsCoherentes(Position carte1, Position carte2)
	{ 
		
		if(carte1.equals(carte2))
			return false;
		if (this.cartes[carte1.obtenirIndiceLigne()][carte1.obtenirIndiceColonne()].isAEteTrouvee())
			return false;
		if (this.cartes[carte2.obtenirIndiceLigne()][carte2.obtenirIndiceColonne()].isAEteTrouvee())
			return false;
		return true;
	}

	/**
	 * Methode qui permet d'obtenir le nombre de colonne du plateau
	 * @return int
	 */
	public int getNombreDeColonnes()
	{
		return NOMBRE_DE_COLONNES;
	} 

	/**
	 * Methode qui permet d'obtenir le nombre de ligne du plateau
	 * @return int
	 */
	public int getNombreDeLignes()
	{
		return NOMBRE_DE_LIGNES;
	}
}