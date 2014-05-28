package fr.iutvalence.java.tp.Memory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuMemory extends JMenuBar implements ActionListener
{
	private JFrame fenetre;
	
	private JMenuItem menuItemFermer;

	private JMenuItem menuItemAPropos;

	private JMenuItem menuItemRegles;

	public MenuMemory(JFrame fenetre){
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
		this.add(menu);
		this.add(aPropos);
	}
	public void actionPerformed(ActionEvent event){
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
	}}
}
