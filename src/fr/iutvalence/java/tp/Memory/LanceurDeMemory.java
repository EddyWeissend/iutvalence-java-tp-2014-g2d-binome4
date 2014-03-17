package fr.iutvalence.java.tp.Memory;

/**
 * Permet de jouer une partie de memory
 * 
 * @author weissene
 * 
 */
public class LanceurDeMemory
{
	/**
	 * Permet de lancer une partie de Memory
	 * et permet de la simuler
	 */
	public static void main(String[] args)
	{
		System.out.println("Creation de la partie");
		Memory partie = new Memory();

		System.out.println("Demarrage de la partie");
		partie.jouer();
		
		System.out.println(partie.ObtenirRepresentationTextDuPlateau());
		System.out.println("Fin de la partie");
	}
}