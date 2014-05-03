package fr.iutvalence.java.tp.Memory;

/**
 * Permet de jouer une partie de memory
 * 
 * @author Weissend/Lacoste
 * 
 */
public class LanceurDeMemory
{
	/**
	 * Permet de lancer une partie de Memory et permet de la simuler
	 * @param args 
	 * Arguments permettant au jeu de fonctionner
	 */
	public static void main(String[] args) 
	{
		System.out.println("Creation de la partie");
		Joueur[] joueurs = new Joueur[] {new JoueurAleatoire("Antoine"), new JoueurAleatoire("Eddy")};
		Memory partie = new Memory(joueurs);
		System.out.println("Demarrage de la partie");
		System.out.println(partie.toString());
		partie.jouer();
		System.out.println(partie.toString());
		System.out.println("Fin de la partie");
	}
}