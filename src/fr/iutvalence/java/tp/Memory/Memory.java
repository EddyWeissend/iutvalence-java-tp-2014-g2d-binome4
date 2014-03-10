package fr.iutvalence.java.tp.Memory;

/**
 * Définition des caractéristiques du Memory
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
	
    public void afficherPlateau()
    {
    	String plateauCourant="";
    	for (int indiceColonne = 0; indiceColonne < 6; indiceColonne++)
			for (int indiceLigne = 0; indiceLigne < 4; indiceLigne++)
			{			
				plateauCourant = plateauCourant + toStringCarte(this.plateau.cartes[indiceColonne][indiceLigne]) + " ";			
		    }
    	System.out.println(plateauCourant);
    }


    private String toStringCarte(Carte carteCourante)
	{
		return Integer.toString(carteCourante.getIdentifiantCarte());
	}
}
