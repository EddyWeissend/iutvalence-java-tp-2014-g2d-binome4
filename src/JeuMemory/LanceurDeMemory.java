package JeuMemory;
/**
 * Permet de jouer une partie de memory
 * @author weissene
 *
 */
public class LanceurDeMemory
{
	public static void main(String[] args)
	{
		System.out.println("Creation de la partie");
		Memory partie = new Memory();
		
		System.out.println("Demarrage de la partie");
		partie.jouer();
		
		System.out.println("Fin de la partie");
	}
}