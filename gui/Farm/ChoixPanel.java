package gui.Farm;

import java.awt.Color;

import javax.swing.JPanel;

import data.configuration.GameConfiguration;
import process.game.ElementManager;

public class ChoixPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ElementManager manager ;
	
	
	public ChoixPanel(ElementManager manager ) {
		super();
		this.manager = manager ;
		init();
	}
	
	
	public void init() {
		MyButton test = new MyButton("add" , manager);
		
		test.setBounds( 10,10,20,20 );
		
		add(test);
		setLayout(null);
		setBounds(0,GameConfiguration.WINDOW_HEIGHT*3/4 , GameConfiguration.WINDOW_WIDTH , GameConfiguration.WINDOW_HEIGHT);
		setBackground(Color.gray);
		
		
	}

}
