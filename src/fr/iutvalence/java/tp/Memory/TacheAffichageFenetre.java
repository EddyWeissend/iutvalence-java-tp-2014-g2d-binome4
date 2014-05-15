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
 * Tache d'affichage dans une fenêtre
 *
 */
public class TacheAffichageFenetre implements Affichage, Runnable, ActionListener
{

	
	private JFrame fenetre;
		
	private JMenuItem menuItemFermer;
	
	private JMenuItem menuItemAPropos;
	
	private JMenuItem menuItemRegles;
	
	
	@Override
	public void run()
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
		
		this.menuItemRegles = new JMenuItem("Règles du jeu");
		this.menuItemRegles.addActionListener(this);
		menu.add(this.menuItemRegles);
		
		this.menuItemFermer = new JMenuItem("Fermer");
		this.menuItemFermer.addActionListener(this);
		menu.add(this.menuItemFermer);
		
		barreDeMenu.add(menu);
		barreDeMenu.add(aPropos);
		
		this.fenetre.setJMenuBar(barreDeMenu);
		
		Container grille = this.fenetre.getContentPane();	
		GridLayout dispositionGrille = new GridLayout(4,6,10,10);		
		grille.setLayout(dispositionGrille);
		for(int i=0; i<24; i++)
			grille.add(new JButton(new ImageIcon("image/hs.jpg")));
		
		
		this.fenetre.setVisible(true);
	}

	@Override
	public void afficherDebutPartie()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherPlateau(Plateau plateau)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		JMenuItem itemSelectionne = (JMenuItem) event.getSource();

		if (itemSelectionne == this.menuItemAPropos)
		{
			JOptionPane.showMessageDialog(this.fenetre, "Jeu de Memory crée par Eddy et Antoine Copyright 2014", "A propos", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		if (itemSelectionne == this.menuItemFermer)
		{
		
			if (JOptionPane.showConfirmDialog(this.fenetre, "Fermer l'application ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
				this.fenetre.dispose();
		}
		
		if (itemSelectionne == this.menuItemRegles)
		{
		
			JOptionPane.showMessageDialog(this.fenetre, "Choisissez deux cartes parmi celles restantes sur le plateau et formé des paires jusqu'a ne plus avoir de carte sur le plateau.", "Règles du Memory", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
	}

}
