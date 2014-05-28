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
		TacheAffichageFenetre ihm = new TacheAffichageFenetre();
		Joueur[] joueurs = new Joueur[] {ihm, ihm};
		
		Memory partie = new Memory(joueurs, ihm);
		ihm.associerControleur(partie);
		SwingUtilities.invokeLater(ihm);
		partie.jouer();
		
	}
}