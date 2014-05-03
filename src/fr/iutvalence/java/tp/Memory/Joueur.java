package fr.iutvalence.java.tp.Memory;

/**
 * Interface représentant le comportement attendu d'un joueur
 * @author sebastienjean
 *
 */
public interface Joueur
{

	/**
	 * Methode qui permet aux joueurs de choisir des cartes aléatoires sur le plateau 
	 * et qui renvoi les cartes choisies aléatoirement
	 * @param nombreDeColonnes 
	 * Taille en colonnes du plateau
	 * @param nombreDeLignes 
	 * Taille en lignes du plateau
	 * @return Position[]
	 */
	public  Position[] choisirCartes(int nombreDeLignes,
			int nombreDeColonnes);
	
	/**
	 * methode qui permet d'incrementer le nombre de paires trouvees
	 */
	public void incrementerNombreDePairesTrouvees();

	/**
	 * methode qui permet d'obtenir le nombre de paires trouvees par le joueur
	 * 
	 * @return int
	 */
	public int obtenirNombreDePairesTrouvees();

}