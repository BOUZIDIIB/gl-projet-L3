package gui;

import java.awt.Graphics;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import configuration.GameConfiguration;
import generateur.game.ElementManager;
import generateur.game.MapManager;
import stucture_base.Element;

public class Board  extends JLayeredPane {

	private static final long serialVersionUID = 1L;
	private  ElementManager manager ;
	private Painting paintStrategy = new Painting();
	private KeyControls keys ;
	private Element selected ;
	
	public Board(ElementManager manager , Element selected ) {
		this.manager = manager ;
		this.selected=selected;
		keys = new KeyControls(manager , selected); 
		init();
	}
		
	public void init() {
		
		addKeyListener(keys);
		JLabel adding = new JLabel();
		adding.setBounds( GameConfiguration.X_ADD_LABEL, GameConfiguration.y_ADD_LABEL,GameConfiguration.WIDHT_LABEL,GameConfiguration.HEIGHT_LABEL);
		ImageIcon addIcon= new ImageIcon("src"+File.separator+"sources"+File.separator+"add.png");
		adding.setIcon(addIcon);		
		add(adding, JLayeredPane.DRAG_LAYER);
		
		
		JLabel home = new JLabel();
		home.setBounds( GameConfiguration.X_HOME_LABEL, GameConfiguration.Y_HOME_LABEL,GameConfiguration.WIDHT_LABEL,GameConfiguration.HEIGHT_LABEL);
		ImageIcon homeIcone= new ImageIcon("src"+File.separator+"sources"+File.separator+"home.png");
		home.setIcon(homeIcone);		
		add(home, JLayeredPane.DRAG_LAYER);
		
		
		setBounds(0, 0, GameConfiguration.WINDOW_WIDTH, GameConfiguration.WINDOW_HEIGHT);
		setLayout(null);
		setFocusable(true);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		MapManager mapManager = manager.getMapManager();
		paintStrategy.paint(mapManager.getMap(), g);
		
		for(Element element : mapManager.getElements().values()) {
			paintStrategy.paint(element, g);
		}	
	}

	public Element getSelected() {
		return selected;
	}

	public void setSelected(Element selected) {
		this.selected = selected;
		keys.setSelected(selected);
	}
	
	
}
