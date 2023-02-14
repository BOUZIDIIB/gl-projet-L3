package gui_test;

import java.awt.Graphics;

import javax.swing.JPanel;

import generateur.game.ElementManager;
import generateur.game.MapManager;
import structure.Etable;
import stucture_base.Element;

public class Board  extends JPanel {

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
		this.setFocusable(true);
		this.addKeyListener(keys);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		MapManager mapManager = manager.getMapManager();
		paintStrategy.paint(mapManager.getMap(), g);
		
		paintStrategy.paint(manager.getFermier(), g);
		
		Element element = manager.getMapManager().get("grange");
		paintStrategy.paint(element, g);
		
		Etable etable = manager.getEtable();
		paintStrategy.paint(etable, g);
		
		
		
		
	}
	

}
