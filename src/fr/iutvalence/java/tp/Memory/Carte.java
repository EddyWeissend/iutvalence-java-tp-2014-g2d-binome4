package fr.iutvalence.java.tp.Memory;

/**
 * Definition d'une carte de jeu Memory :
 * -La face sur laquelle elle est posée
 * -Son identifiant
 * -Si elle a été trouvee ou non
 * -
 * 
 * @author Weissend/Lacoste
 * 
 */
public class Carte
{
	/**
	 * Face de la carte par defaut
	 */
	private static final boolean FACE_PAR_DEFAUT = false;

	/**
	 * Indique si la carte est retournee ou non : 
	 * -false si la carte est face cachee 
	 * -true si la carte est face visible
	 */
	private boolean estFaceRetournee;
	
	/**
	 * Vrai si la carte a ete trouvee
	 * Faux sinon
	 */
	private boolean aEteTrouvee;

	/**
	 * Symbole de la carte compris entre 1 et 12 
	 * car il y a 12 paires
	 */
	private int identifiantCarte;

	
	/**
	 * Creer une carte face cachee avec un identifiant passe en parametre
	 * @param symbole 
	 * symbole de la carte que l'on veut creer
	 */
	
	public Carte(int symbole)
	{
		this.estFaceRetournee = FACE_PAR_DEFAUT;
		this.identifiantCarte = symbole;
		this.aEteTrouvee = false;
	}

	/**
	 * Redefinition de la methode toString pour renvoyer l'identifiant d'une carte en String dans la console
	 */
	public String toString()
	{
		if (this.aEteTrouvee)
			return "" + " ";
		return ""+this.obtenirIdentifiantCarte();
	}

	/**
	 * methode qui permet de retourner la carte
	 */
	public void retournerCarte()
	{
		if (this.estFaceRetournee)
			this.estFaceRetournee = false;
		else
			this.estFaceRetournee = true;
	}

	/**
	 * Methode qui interroge la carte pour savoir si elle est face retournee ou non
	 * @return boolean
	 */
	public boolean estFaceRetournee()
	{ 
		return this.estFaceRetournee;
	}

	/**
	 * Methode qui permet d'obtenir l'identifiant de la carte
	 * @return int
	 */
	public int obtenirIdentifiantCarte()
	{
		return this.identifiantCarte;
	}

	/**
	 * Methode qui permet d'enlever la carte
	 */
	public void enleverCarte()
	{ 
		this.aEteTrouvee = true;
	}

	/**
	 * Methode qui interroge la carte pour savoir si elle a ete trouvee ou non
	 * @return boolean
	 */
	public boolean isAEteTrouvee()
	{
		return this.aEteTrouvee;
	}
 
}
