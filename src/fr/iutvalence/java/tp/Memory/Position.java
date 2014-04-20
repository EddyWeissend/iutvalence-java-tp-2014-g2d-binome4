package fr.iutvalence.java.tp.Memory;

/**
 * Definition d'une position sur le plateau
 * 
 * @author Weissend/Lacoste
 */
public class Position
{
	/**
	 * Indice de la colonne pour une position
	 */
	private int indiceColonne;
	
	/**
	 * Indice de la ligne pour une position
	 */
	private int indiceLigne;

	/** 
	 * Constructeur de Position
	 * @param indiceLigne 
	 * Indice de la ligne
	 * @param indiceColonne 
	 * Indice de la colonne
	 */
	public Position(int indiceLigne, int indiceColonne)
	{
		this.indiceColonne = indiceColonne;
		this.indiceLigne = indiceLigne;
	}

	/** 
	 * Methode qui permet d'obtenir l'indice colonne
	 * @return int
	 * Renvoi de l'indice colonne
	 */
	public int obtenirIndiceColonne()
	{
		return this.indiceColonne;
	}

 
	/**
	 *Methode qui permet d'obtenir l'indice ligne
	 * @return int
	 * Renvoi de l'indice colonne
	 */
	public int obtenirIndiceLigne()
	{
		return this.indiceLigne;
	}

	/** 
	 * Redefinition de la méthode toString pour pouvoir afficher une position
	 */
	public String toString()
	{
		return "Position [indiceColonne=" + this.indiceColonne + ", indiceLigne=" + this.indiceLigne + "]";
	}
	
	/**
	 * Redefinition de la methode equals pour comparer 2 position 
	 * @param carte
	 * Carte a la position donnee que l'on veut comparer
	 * @return boolean
	 */
	public boolean equals(Position carte){
		if ((this.indiceColonne==carte.indiceColonne) && (this.indiceLigne== carte.indiceLigne))
			return true;
		return false;
		
	}
}
