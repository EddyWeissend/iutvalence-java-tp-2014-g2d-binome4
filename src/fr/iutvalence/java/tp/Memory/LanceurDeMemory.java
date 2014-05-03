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
		Joueur[] joueurs = new Joueur[] {new JoueurAleatoire("Antoine"), new JoueurAleatoire("Eddy")};
		Memory partie = new Memory(joueurs, new AffichageConsole());
		partie.jouer();
		
	}
}