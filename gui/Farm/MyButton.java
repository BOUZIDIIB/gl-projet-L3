package gui.Farm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import data.structure.Entrepot;
import process.game.ElementManager;


public class MyButton extends JButton{


	private static final long serialVersionUID = 1L;
	private ElementManager manager ;
	
	public MyButton(String content , ElementManager manager ) {
		super(content);
		this.manager=manager;
		addActionListener(new AddElement());
		
		setOpaque(true);
		setBackground(Color.cyan);
		
	}
	
	private class AddElement implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Entrepot entrepot = new Entrepot( 18, 10,"entrepot" , manager.getMapManager().getMap());
			manager.add(entrepot);
			
			
		}
		
	}
	
	
	
	
	
	
}
