package gui.Farm;

import java.awt.Color;

import java.awt.Graphics;
import java.io.File;

import javax.swing.ImageIcon;

import data.configuration.GameConfiguration;
import data.map.Case;
import data.map.Map;
import data.stucture_base.Element;
import data.stucture_base.Position;




/**
 * responsable de la gestion du dessin de tous les composants  
 * @author dania
 *
 */
public class FarmPaintStrategy {
	
	private Map map ;
	
	public void paint(Map map, Graphics graphics) {
		this.map = map ;
		Case[][] cases = map.getCases();
		for (int lineIndex = 0; lineIndex < map.getNbLignes(); lineIndex++) {
			for (int columnIndex = 0; columnIndex < map.getNbColones(); columnIndex++) {
				 Case block = cases[lineIndex ][columnIndex ];
				 graphics.setColor(new Color(000));
					 ImageIcon herbe = new ImageIcon("src"+File.separator+"ressources"+File.separator+"terre.png");
					 int x = block.getColonne()*GameConfiguration.CASE_DIMENSION + map.getX();
					 int y = block.getLigne()*GameConfiguration.CASE_DIMENSION + map.getY();		 
					 graphics.drawImage(herbe.getImage(),x,y,GameConfiguration.CASE_DIMENSION , GameConfiguration.CASE_DIMENSION, null);
					 
					 /*graphics.setColor(Color.black);
					 graphics.drawLine(x, y, x, y+ GameConfiguration.CASE_DIMENSION);
					 graphics.drawLine(x, y, x+ GameConfiguration.CASE_DIMENSION, y);
					 graphics.drawLine(x, y, x+ GameConfiguration.CASE_DIMENSION, y);
					 graphics.drawLine(x+ GameConfiguration.CASE_DIMENSION, y, x+ GameConfiguration.CASE_DIMENSION, y+ GameConfiguration.CASE_DIMENSION);
					 graphics.drawLine(x, y+GameConfiguration.CASE_DIMENSION, x +GameConfiguration.CASE_DIMENSION, y+GameConfiguration.CASE_DIMENSION);*/
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
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"stand.png");
				
		case "grange":
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"grange1.png");
			
		case "etable":
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"maison.png");
			
		case "entrepot":
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"grange.png");
			
		case "poulallier":
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"moulin.png");
				
		default:
			return new ImageIcon("src"+File.separator+"ressources"+File.separator+"terre.png");
		}
				
	}
	
	/**
	 * dessin des limites de la fermes qui sera un des attribut  de la classe ferme 
	 * 
	 *                                 juste temporaire 
	 * @param map
	 * @param Dimension dimension par rapport à la map 
	 * @param graphics
	 */
	public void paint(Map map ,int dimension ,Graphics graphics ) {
		graphics.setColor(Color.red);
		ImageIcon buisson = new ImageIcon("src"+File.separator+"ressources"+File.separator+"buisson.png");
		for(int i = 7 ; i< dimension +8 ; i ++) {
			graphics.drawImage(buisson.getImage(), map.getX() + i*GameConfiguration.CASE_DIMENSION , map.getY() + 9*GameConfiguration.CASE_DIMENSION ,GameConfiguration.CASE_DIMENSION ,GameConfiguration.CASE_DIMENSION, null);
		}
		for(int i = 9 ; i< dimension + 10 ; i ++) {
			graphics.drawImage(buisson.getImage(), map.getX() + 7*GameConfiguration.CASE_DIMENSION , map.getY() + i*GameConfiguration.CASE_DIMENSION ,GameConfiguration.CASE_DIMENSION ,GameConfiguration.CASE_DIMENSION, null);
		}
		
	  for(int i = 7 ; i< dimension + 8 ; i ++) {
		  graphics.drawImage(buisson.getImage(), map.getX() +i*GameConfiguration.CASE_DIMENSION , map.getY() + 30*GameConfiguration.CASE_DIMENSION ,GameConfiguration.CASE_DIMENSION ,GameConfiguration.CASE_DIMENSION, null); }
	  
	  for(int i = 9 ; i< dimension +11 ; i ++) { 
		  graphics.drawImage(buisson.getImage(), map.getX() + 28*GameConfiguration.CASE_DIMENSION , map.getY() +i*GameConfiguration.CASE_DIMENSION ,GameConfiguration.CASE_DIMENSION ,GameConfiguration.CASE_DIMENSION, null); }
		 
	}
	
	
	public int getFarmeX(Map map ) {
		return map.getX() + 8*GameConfiguration.CASE_DIMENSION;
	}
	
	public int getFarmeY(Map map) {
		return map.getY() + 10*GameConfiguration.CASE_DIMENSION;
	}
	
	
	
}
