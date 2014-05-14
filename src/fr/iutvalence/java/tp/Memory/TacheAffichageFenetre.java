package fr.iutvalence.java.tp.Memory;

import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TacheAffichageFenetre implements Affichage, Runnable
{

	@Override
	public void run()
	{
		JFrame fenetre= new JFrame();
		fenetre.setSize(600, 600);
		fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container grille = fenetre.getContentPane();	
		GridLayout dispositionGrille = new GridLayout(4,6,10,10);		
		grille.setLayout(dispositionGrille);
		for(int i=0; i<24; i++)
			grille.add(new JButton(new ImageIcon("image/hs.jpg")));
		
		fenetre.setVisible(true);
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

}
