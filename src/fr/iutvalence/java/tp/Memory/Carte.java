package fr.iutvalence.java.tp.Memory;

/**
 * Représentation d'une carte de jeu Memory
 * 
 * @author weissene
 * 
 */
public class Carte
{
	/**
	 * Face de la carte par défaut
	 */
	private static final boolean FACE_PAR_DEFAUT = false;

	/**
	 * Intermédiaire pour créer un symbole aléatoire
	 */
	public final static int VALEUR_MINIMALE = 1;

	/**
	 * Intermédiaire pour créer un symbole aléatoire
	 */
	public final static int VALEUR_MAXIMALE = 13;

	/**
	 * Indique si la carte est retournée ou non : -false si la carte est face
	 * cachée -true si la carte est face visible
	 */
	private boolean estFaceRetournee;

	/**
	 * Symbole de la carte compris entre 1 et 12 car il y a 24 cartes donc 12
	 * paires
	 */
	private int identifiantCarte;

	// TODO compléter le commentaire
	/**
	 * Créer une carte face cachée avec un symbole aléatoire
	 */
	public Carte(int symbole)
	{
		this.estFaceRetournee = FACE_PAR_DEFAUT;
		this.identifiantCarte = symbole;
	}

	// TODO écrire un commentaire
	/**
	 * Renvoi l'identifiant de la carte courante
	 * @return
	 */
	public int getIdentifiantCarte()
	{
		return identifiantCarte;
	}
	
	/**
	 * Renvoi l'identifiant d'une carte en String
	 */
    private String toStringCarte(Carte carteCourante)
	{
		return Integer.toString(carteCourante.getIdentifiantCarte());
	}
}
