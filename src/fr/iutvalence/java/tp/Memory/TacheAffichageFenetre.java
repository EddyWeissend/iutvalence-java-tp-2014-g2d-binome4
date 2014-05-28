package fr.iutvalence.java.tp.Memory;

import javax.swing.ImageIcon;
import java.io.*;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JPanel;




/**
 * @author EDDY
 * Tache d'affichage dans une fen�tre
 *
 */
public class TacheAffichageFenetre implements Affichage, Runnable, ActionListener, Joueur
{

	private Memory controleur;
	
	private JFrame fenetre;
	
	private MenuMemory menu;
	
	private JPanel grille;
	
	private Position[] cartesChoisies;
	
	private int nbCartesChoisies;
	
	private BoutonCarte[][] boutons;
	

	public void run()
	{
		this.afficherDebutPartie();
	}

	@Override
	public void afficherDebutPartie()
	{
		this.fenetre= new JFrame();
		this.fenetre.setSize(580, 600);
		this.fenetre.setTitle("Memory");
		this.fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		MenuMemory barreDeMenu = new MenuMemory(this.fenetre);		
		this.fenetre.setJMenuBar(barreDeMenu);		
		JPanel grille = new JPanel();
		GridLayout dispositionGrille = new GridLayout(4,6,10,10);		
		grille.setLayout(dispositionGrille);
		this.boutons=new BoutonCarte[Plateau.NOMBRE_DE_LIGNES][Plateau.NOMBRE_DE_COLONNES];
		for(int i=0; i<4; i++)
			for (int j=0; j<6;j++){
				BoutonCarte boutoncreer=new BoutonCarte(new Position (i,j),new ImageIcon("image/hs.jpg"),this, this.controleur.getPlateau().getIdentifiantCarte(new Position(i,j)));
				grille.add(boutoncreer);
				this.boutons[i][j]=boutoncreer;
		}
	
		this.fenetre.setContentPane(grille);
		this.fenetre.setVisible(true);
		this.grille=grille;
		this.cartesChoisies=new Position[2];
	}

	public void afficherPlateau(Plateau plateau)
	{
				
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{				
		BoutonCarte boutonAppuye= (BoutonCarte) event.getSource();
		if(this.nbCartesChoisies==0){
			this.cartesChoisies[this.nbCartesChoisies]=new Position(boutonAppuye.getPosition().getIndiceLigne(),boutonAppuye.getPosition().getIndiceColonne());
			this.nbCartesChoisies++;
			System.out.println(nbCartesChoisies);
			boutonAppuye.retournerCarte();}
		if (!(boutonAppuye.getPosition().equals(this.cartesChoisies[0])))
		{
			this.cartesChoisies[this.nbCartesChoisies]=new Position(boutonAppuye.getPosition().getIndiceLigne(),boutonAppuye.getPosition().getIndiceColonne());
			this.nbCartesChoisies++;
			boutonAppuye.retournerCarte();}
		}
		


	public Position[] choisirCartes(int nombreDeLignes, int nombreDeColonnes)
	{
		this.nbCartesChoisies = 0;
		
		while (this.nbCartesChoisies != 2);
		try{
			Thread.sleep(1000);
		}
		catch (InterruptedException e1){
	
		}
		this.boutons[this.cartesChoisies[0].getIndiceLigne()][this.cartesChoisies[0].getIndiceColonne()].retournerCarte();
		this.boutons[this.cartesChoisies[1].getIndiceLigne()][this.cartesChoisies[1].getIndiceColonne()].retournerCarte();
		return this.cartesChoisies;
	}


	public void incrementerNombreDePairesTrouvees()
	{
		
	}
	

	public int obtenirNombreDePairesTrouvees()
	{

		return 0;
	}

	public void retournerCarte(Position position)
	{
		
	}

	@Override
	public void desactiverCarte(Position carte1)
	{
		this.boutons[this.cartesChoisies[0].getIndiceLigne()][this.cartesChoisies[0].getIndiceColonne()].desactiver();
		this.boutons[this.cartesChoisies[1].getIndiceLigne()][this.cartesChoisies[1].getIndiceColonne()].desactiver();
	}
	
	public void associerControleur(Memory jeu){
		this.controleur=jeu;
	}
	
	public void afficherFinPartie(){
		JOptionPane.showMessageDialog(this.fenetre, "Vous avez gagné, AAANNDDDUUIINN", "Fin de partie", JOptionPane.INFORMATION_MESSAGE);
	}

}