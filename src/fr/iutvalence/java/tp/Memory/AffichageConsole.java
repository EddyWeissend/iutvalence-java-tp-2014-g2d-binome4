package fr.iutvalence.java.tp.Memory;

public class AffichageConsole implements Affichage
{

	@Override
	public void afficherDebutPartie()
	{
		System.out.println("Début de la partie");

	}

	@Override
	public void afficherPlateau(Plateau plateau)
	{

		String representationTexteDuPlateau = "";
		for (int indiceLigne = 0; indiceLigne < Plateau.NOMBRE_DE_LIGNES; indiceLigne++)
		{
			for (int indiceColonne = 0; indiceColonne < Plateau.NOMBRE_DE_COLONNES; indiceColonne++)
				representationTexteDuPlateau = representationTexteDuPlateau
						+ plateau.obtenirCarte(new Position(indiceLigne,indiceColonne))
						+ "\t";
			representationTexteDuPlateau = representationTexteDuPlateau + "\n";
		}
		System.out.println(representationTexteDuPlateau);

	}

}
