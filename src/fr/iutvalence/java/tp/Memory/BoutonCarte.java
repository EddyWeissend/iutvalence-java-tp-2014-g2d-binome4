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
	
	private int symbole;
	
	public BoutonCarte(Position position, ImageIcon image, ActionListener auditeur, int symboleCarte){
		super(image);
		this.position=position;
		this.addActionListener(auditeur);
		this.symbole=symboleCarte;
	}

 
	public void actionPerformed(ActionEvent event)
	{
		this.getPosition();
	}


	public void retournerCarte()
	{
		if (this.getIcon()==null)
			this.setIcon(new ImageIcon("image/hs.jpg"));
		else{
			this.setIcon(null);
			this.setText(""+this.symbole);
		}
	}


	public Position getPosition()
	{
		return this.position;
		
	}


	public void desactiver()
	{
		this.setEnabled(false);
	}

}
