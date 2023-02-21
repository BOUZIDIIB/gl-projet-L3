package gui.Farm;




import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import data.configuration.GameConfiguration;
import data.gestion.GestionnaireStructures;
import data.map.Case;
import data.structure.Structure;
import data.stucture_base.Element;
import gui.gestionnaire.Gestionnaire;
import process.game.ElementManager;


public class ChoixPanel extends JLayeredPane {
	
	private static final long serialVersionUID = 1L;
	private GestionnaireStructures gestionnaire ;
	private ElementManager manager ;
	private Element selected ;
	public ChoixPanel(GestionnaireStructures gestionnaire , ElementManager manager) {
		super();
		this.gestionnaire = gestionnaire;
		this.manager = manager;
		init();
	}
	
	
	public void init() {
		setOpaque(true);
		setBackground( Gestionnaire.LIGHT_BROWN);
		setBounds(50, GameConfiguration.WINDOW_HEIGHT-150, GameConfiguration.WINDOW_WIDTH-170, 100);
		addMouseListener(new MouseControls());
				
		int x = 100 ; 
		int y = 10;
		
		
		for(Structure structure : gestionnaire.getStructures().values()) {
			JLabel struct = new JLabel();
			struct.setBounds(x , y ,100,100);
			ImageIcon icon = getMiniIcon(structure);
			struct.setIcon(icon);
			add(struct, JLayeredPane.DRAG_LAYER);
			x += 150 ;		
		}	
	}
	
	
	public ImageIcon getMiniIcon(Element element) {
		switch (element.getReference()) {
		case "ma0":
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"minitracteur.png");
		case "et0":
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"minietable.png");
		case "po0" :
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"minicamion.png");
		case "en0" :
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"minimoulin.png");
			
		case "ma1" :
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"minimaison.png");
			
		default :
				return null ;
		}
		
		
	}
	
	private class MouseControls implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			if(x>100 && x<200) {
				selected = gestionnaire.getStructures().get("ma0");
				
			}
			else {
				if(x>250 && x<350) {
					selected = gestionnaire.getStructures().get("et0");	
				}
				else {
					if(x>400 && x<500) {
						selected = gestionnaire.getStructures().get("po0");	
					}
					else {
						if(x>550 && x< 650) {
							selected = gestionnaire.getStructures().get("en0");
						}
						else {
							if(x>700) {
								selected = gestionnaire.getStructures().get("ma1");
								
							}
						}
					}
				}
			}
			randomPosition();
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
				
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public void randomPosition() {
		Case block = new Case(true , 0 , 0);
		Boolean libre = false ;
		while( !libre) {	
			int ligneAleatoire = 9 + (int)(Math.random() * (20));
			int colonneAleatoire = 7 + (int)(Math.random() * (20));
			block = new Case(true, ligneAleatoire, colonneAleatoire);
		   libre = manager.getMapManager().verificationLiberte(selected, block);
		}
		selected.freePosition();
		if(!manager.getMapManager().getElements().containsKey(selected.getReference())) {
			manager.add(selected);
			selected.setPosition(block.getLigne(), block.getColonne());			
		}
	
	}
	
	
	
}
