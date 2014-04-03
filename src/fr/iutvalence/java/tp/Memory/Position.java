package fr.iutvalence.java.tp.Memory;

public class Position
{
	private int indiceColonne;
	
	private int indiceLigne;

	public Position(int indiceColonne, int indiceLigne)
	{
		this.indiceColonne = indiceColonne;
		this.indiceLigne = indiceLigne;
	}

	public int getIndiceColonne()
	{
		return this.indiceColonne;
	}


	public int getIndiceLigne()
	{
		return this.indiceLigne;
	}
}