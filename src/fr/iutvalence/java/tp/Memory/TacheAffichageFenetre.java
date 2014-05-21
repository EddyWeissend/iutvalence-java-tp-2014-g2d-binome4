package fr.iutvalence.java.tp.Memory;

import javax.swing.ImageIcon;
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

	
	private JFrame fenetre;
		
	private JMenuItem menuItemFermer;
	
	private JMenuItem menuItemAPropos;
	
	private JMenuItem menuItemRegles;
	
	

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
		JMenuBar barreDeMenu = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenu aPropos = new JMenu("A Propos");		
		this.menuItemAPropos = new JMenuItem("Informations");
		this.menuItemAPropos.addActionListener(this);
		aPropos.add(this.menuItemAPropos);		
		this.menuItemRegles = new JMenuItem("Regles du jeu");
		this.menuItemRegles.addActionListener(this);
		menu.add(this.menuItemRegles);		
		this.menuItemFermer = new JMenuItem("Fermer");
		this.menuItemFermer.addActionListener(this);
		menu.add(this.menuItemFermer);		
		barreDeMenu.add(menu);
		barreDeMenu.add(aPropos);		
		this.fenetre.setJMenuBar(barreDeMenu);		
		JPanel grille = new JPanel();
		GridLayout dispositionGrille = new GridLayout(4,6,10,10);		
		grille.setLayout(dispositionGrille);
		
		for(int i=0; i<4; i++)
			for (int j=0; j<6;j++)
				grille.add(new BoutonCarte(new Position (i,j),new ImageIcon("image/hs.jpg")));

		this.fenetre.setContentPane(grille);
		this.fenetre.setVisible(true);
	}

	@Override
	public void afficherPlateau(Plateau plateau)
	{
				
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		JMenuItem itemSelectionne = (JMenuItem) event.getSource();

		if (itemSelectionne == this.menuItemAPropos)
		{
			JOptionPane.showMessageDialog(this.fenetre, "Jeu de Memory cree par Eddy et Antoine Copyright 2014", "A propos", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		if (itemSelectionne == this.menuItemFermer)
		{
		
			if (JOptionPane.showConfirmDialog(this.fenetre, "Fermer l'application ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
				this.fenetre.dispose();
		}
		
		if (itemSelectionne == this.menuItemRegles)
		{
			JOptionPane.showMessageDialog(this.fenetre, "Choisissez deux cartes parmi celles restantes sur le plateau et forme des paires jusqu'a ne plus avoir de carte sur le plateau.", "R�gles du Memory", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
	}


	public Position[] choisirCartes(int nombreDeLignes, int nombreDeColonnes)
	{

		return null;
	}


	public void incrementerNombreDePairesTrouvees()
	{
		
	}


	public int obtenirNombreDePairesTrouvees()
	{

		return 0;
	}
	
	
	public void retournerCarte(Position position){
		
}
}