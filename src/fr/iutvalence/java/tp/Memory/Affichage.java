package fr.iutvalence.java.tp.Memory;

/**
 * Interface représentant le comportement attendu de l'affichage
 * @author sebastienjean
 *
 */
public interface Affichage
{

	public void afficherDebutPartie();

	public void afficherPlateau(Plateau plateau);
	
	public void retournerCarte(Position position);

}
