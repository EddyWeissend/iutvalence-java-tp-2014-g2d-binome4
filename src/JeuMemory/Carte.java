package JeuMemory;

/**
 * Définition d'une carte de Memory
 * 
 * @author weissene
 * 
 */
public class Carte
{
	/**
	 * Symbole de la carte
	 */
	private int SYMBOLE;

	/**
	 * Caractérise l'état de la carte, true si la carte est face visible, false
	 * si elle est face cachee
	 */
	private boolean estRetournee = false;

	/**
	 * Retourne une carte
	 */
	public void retourner()
	{
		if (estRetournee)
			estRetournee=false;
		else 	estRetournee=true;
	}
}
