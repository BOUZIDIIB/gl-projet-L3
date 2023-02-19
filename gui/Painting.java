package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;

import javax.swing.ImageIcon;

import configuration.GameConfiguration;
import generateur.map.Case;
import generateur.map.Map;
import stucture_base.Element;
import stucture_base.Position;

/**
 * responsable de la gestion du dessin de tous les composants  
 * @author dania
 *
 */
public class Painting {
	
	private Map map ;
	
	public void paint(Map map, Graphics graphics) {
		this.map = map ;
		Case[][] cases = map.getCases();
		for (int lineIndex = 0; lineIndex < map.getNbLignes(); lineIndex++) {
			for (int columnIndex = 0; columnIndex < map.getNbColones(); columnIndex++) {
				 Case block = cases[lineIndex ][columnIndex ];
				 graphics.setColor(new Color(000));
					 ImageIcon herbe = new ImageIcon("src"+File.separator+"sources"+File.separator+"terre.png");
					 int x = block.getColonne()*GameConfiguration.CASE_DIMENSION + map.getX();
					 int y = block.getLigne()*GameConfiguration.CASE_DIMENSION + map.getY();		 
					 graphics.drawImage(herbe.getImage(),x,y,GameConfiguration.CASE_DIMENSION , GameConfiguration.CASE_DIMENSION, null);
					 
			}
		}
	}
	
	
	public void paint( Element element , Graphics graphics) {
		ImageIcon icone = getImage(element.getReference());
		Position position = element.getPosition();
		int x = position.getColonne_init()*GameConfiguration.CASE_DIMENSION +  map.getX();
		int y = position.getLigne_init()*GameConfiguration.CASE_DIMENSION + map.getY();
		graphics.drawImage(icone.getImage(), x, y,GameConfiguration.CASE_DIMENSION*position.getNbColonne() , GameConfiguration.CASE_DIMENSION*position.getNbLigne(), null);	
	}
	
	
	public ImageIcon getImage(String reference) {
		switch(reference) {
		case "fermier":
			return new ImageIcon("src"+File.separator+"sources"+File.separator+"stand.png");
				
		case "grange":
			return new ImageIcon("src"+File.separator+"sources"+File.separator+"grange1.png");
			
		case "etable":
			return new ImageIcon("src"+File.separator+"sources"+File.separator+"maison.png");
			
		case "entrepot":
			return new ImageIcon("src"+File.separator+"sources"+File.separator+"grange.png");
			
		case "poulallier":
			return new ImageIcon("src"+File.separator+"sources"+File.separator+"moulin.png");
				
		default:
			return new ImageIcon("src"+File.separator+"sources"+File.separator+"terre.png");
		}
		
		
		
		
	}
	
}
