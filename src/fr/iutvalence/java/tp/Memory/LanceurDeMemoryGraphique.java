 package fr.iutvalence.java.tp.Memory;
 
 import javax.swing.SwingUtilities;

/**
 * Permet de jouer une partie de memory
 * 
 * @author Weissend/Lacoste
 * 
 */
public class LanceurDeMemoryGraphique
{
	/**
	 * Permet de lancer une partie de Memory et permet de la simuler
	 * @param args 
	 * Arguments permettant au jeu de fonctionner
	 */
	public static void main(String[] args) 
	{	
		Joueur[] joueurs = new Joueur[] {new JoueurAleatoire("Antoine"), new JoueurAleatoire("Eddy")};
		TacheAffichageFenetre ihm = new TacheAffichageFenetre();
		Memory partie = new Memory(joueurs, ihm);
		
		SwingUtilities.invokeLater(ihm);
		partie.jouer();
		
	}
}