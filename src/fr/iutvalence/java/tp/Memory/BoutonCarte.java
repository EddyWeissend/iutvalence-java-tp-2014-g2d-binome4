package fr.iutvalence.java.tp.Memory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BoutonCarte extends JButton implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Position position;
	
	public BoutonCarte(Position position, ImageIcon image){
		super(image);
		this.position=position;
		this.addActionListener(this);
	}

 
	public void actionPerformed(ActionEvent event)
	{
		this.retournerCarte();
		this.getPosition();
	}


	private void retournerCarte()
	{
		this.;		
	}


	private Position getPosition()
	{
		return this.position;
		
	}

}
