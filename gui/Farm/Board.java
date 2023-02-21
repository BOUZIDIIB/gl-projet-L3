package gui.Farm;


import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import data.configuration.GameConfiguration;
import data.gestion.GestionnaireStructures;
import process.game.ElementManager;

import process.game.MapManager;
import data.stucture_base.Element;
import gui.gestionnaire.Gestionnaire;
import gui.gestionnaire.GestionnairePaintStrategy;

public class Board  extends JLayeredPane {
	private JLayeredPane choix;
	private static final long serialVersionUID = 1L;
	private  ElementManager manager ;
	private FarmPaintStrategy paintStrategy = new FarmPaintStrategy();
	private KeyControls keys ;
	private Element selected ;
	private GestionnaireStructures gestionnaire ;
	// Jlabel   
	private JLabel adding = new JLabel();
	private JLabel home = new JLabel();
	
	
	
	public Board(ElementManager manager , Element selected ,GestionnaireStructures gestionnaire ) {
		this.manager = manager ;
		this.selected=selected;
		this.gestionnaire=gestionnaire;
		keys = new KeyControls(manager , selected); 
		init();
	}
		
	public void init() {
		
		addKeyListener(keys);
		adding.setBounds( GameConfiguration.X_ADD_LABEL, GameConfiguration.y_ADD_LABEL,GameConfiguration.WIDHT_LABEL,GameConfiguration.HEIGHT_LABEL);
		ImageIcon addIcon= new ImageIcon("src"+File.separator+"ressources"+File.separator+"add.png");
		adding.setIcon(addIcon);		
		add(adding, JLayeredPane.DRAG_LAYER);
		
		
		
		home.setBounds( GameConfiguration.X_HOME_LABEL, GameConfiguration.Y_HOME_LABEL,GameConfiguration.WIDHT_LABEL,GameConfiguration.HEIGHT_LABEL);
		ImageIcon homeIcone= new ImageIcon("src"+File.separator+"ressources"+File.separator+"home.png");
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
		
		// les bords de la ferme 
		paintStrategy.paint(mapManager.getMap(),  20 , g);
		
	}

	public Element getSelected() {
		return selected;
	}

	public void setSelected(Element selected) {
		this.selected = selected;
		keys.setSelected(selected);
	}
	
	public void addingChoix() {
		choix = new ChoixPanel(gestionnaire);
		
		add(choix, JLayeredPane.DRAG_LAYER);
		
	}
	
	public void removeChoix() {
		remove(choix);	
	}
	
	public void changeState() {
		if (Arrays.asList(this.getComponents()).contains(choix)) {
			removeChoix();
		} else {
			addingChoix();
		}
	}
	
	// temporaire avant de ajouter un hud 
	public Boolean mouseIsOnAdd(int x , int y ) {
		return (x < (GameConfiguration.X_ADD_LABEL +GameConfiguration.WIDHT_LABEL))&&(x>GameConfiguration.X_ADD_LABEL) &&( y <(GameConfiguration.y_ADD_LABEL+GameConfiguration.HEIGHT_LABEL ))&& (y >GameConfiguration.y_ADD_LABEL);
	}
	
	public Boolean mouseIsOnHome(int x , int y ) {
		return (x<(GameConfiguration.X_HOME_LABEL +GameConfiguration.WIDHT_LABEL))&&( x>GameConfiguration.X_HOME_LABEL )&& (y <(GameConfiguration.Y_HOME_LABEL+GameConfiguration.HEIGHT_LABEL)) &&( y>GameConfiguration.Y_HOME_LABEL);
	}
	
	
	
}
