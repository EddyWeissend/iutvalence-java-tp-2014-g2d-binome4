package fr.iutvalence.java.tp.Memory;

import java.util.Random;

/**
 * Definition de ce qu'est un joueur qui joue au memory
 * 
 * @author Weissend/Lacoste
 *
 */
public class JoueurAleatoire extends JoueurAbstrait
{
	/**
	 * Creation d'un joueur
	 * @param nom 
	 * Le nom du joueur
	 */
	public JoueurAleatoire(String nom)
	{
		super(nom);
	}

	@Override
	public Position [] choisirCartes(int nombreDeLignes, int nombreDeColonnes)
	{ 
		Random generateurDeNombresAleatoires = new Random();
		Position [] cartesChoisies= new Position[2];
		cartesChoisies[0]= new Position(generateurDeNombresAleatoires.nextInt(nombreDeLignes),generateurDeNombresAleatoires.nextInt(nombreDeColonnes));
		cartesChoisies[1]= new Position(generateurDeNombresAleatoires.nextInt(nombreDeLignes),generateurDeNombresAleatoires.nextInt(nombreDeColonnes));
		//System.out.println(".");
		return cartesChoisies; 
		
	}
}
