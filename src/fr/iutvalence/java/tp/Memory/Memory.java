package fr.iutvalence.java.tp.Memory;

// TODO écrire un commentaire plus précis
/**
 * Définition d'une partie de Memory
 * 
 * @author weissene
 * 
 */
public class Memory
{

	/**
	 * Le nombre de cartes du jeu
	 */
	private final static int NOMBRE_TOTAL_DE_CARTES_DU_JEU = 24;

	/**
	 * Terrain de jeu avec les cartes
	 */
	private Plateau plateau;

	/**
	 * Créer une nouvelle partie de Memory jouable : 
	 * -création d'un plateau 
	 * -les cartes sont retournées et placées
	 * 
	 */
	public Memory()
	{
		this.plateau = new Plateau();
	}

	/**
	 * Joue une partie de Memory
	 */
	public void jouer()
	{

	}
	
	// TODO écrire un commentaire
	/**
	 * Affiche le plateau en mode texte sur la console
	 */
    public void afficherPlateau()
    {
    	String plateauCourant="";
    	for (int indiceColonne = 0; indiceColonne < 6; indiceColonne++)
			for (int indiceLigne = 0; indiceLigne < 4; indiceLigne++)
			{			
				plateauCourant = plateauCourant + (this.plateau.cartes[indiceColonne][indiceLigne]).toString() + " ";			
		    }
    	System.out.println(plateauCourant);
    }

    // TODO déplacer cette méthode dans Carte
	// TODO écrire un commentaire 

}
