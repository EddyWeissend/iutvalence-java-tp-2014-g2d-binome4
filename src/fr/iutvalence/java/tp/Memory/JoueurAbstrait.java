package fr.iutvalence.java.tp.Memory;

/**
 * Implémentation abstraite de l'interfaec Joueur
 * @author sebastienjean
 *
 */
public abstract class JoueurAbstrait implements Joueur
{

	/**
	 * Nom du joueur
	 */
	protected final String nom;
	/**
	 * Nombre de paires trouvees
	 */
	protected int nombreDePairesTrouvees;

	/**
	 * Création d'un joueur
	 * @param nom le nom du joueur
	 */
	public JoueurAbstrait(String nom)
	{
		this.nom = nom;
	}

	
	public void incrementerNombreDePairesTrouvees()
	{
		this.nombreDePairesTrouvees++;
	}

	
	public int obtenirNombreDePairesTrouvees()
	{
		return this.nombreDePairesTrouvees;
	}

}