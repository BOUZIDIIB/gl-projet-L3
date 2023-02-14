package gui_test;

import java.awt.Graphics;
import java.io.File;

import javax.swing.ImageIcon;

import acteur.Fermier;
import configuration.GameConfiguration;
import generateur.map.Case;
import generateur.map.Map;
import structure.Etable;
import stucture_base.Element;
import stucture_base.Position;

/**
 * responsable de la gestion du dessin de tous les composants  
 * @author dania
 *
 */
public class Painting {
	
	public void paint(Map map, Graphics graphics) {
		Case[][] cases = map.getCases();
		for (int lineIndex = 0; lineIndex < map.getNbLignes(); lineIndex++) {
			for (int columnIndex = 0; columnIndex < map.getNbColones(); columnIndex++) {
				 Case block = cases[lineIndex][columnIndex];
					 ImageIcon herbe = new ImageIcon("src"+File.separator+"sources"+File.separator+"terre.png");
					 int x = block.getColonne()*GameConfiguration.CASE_DIMENSION;
					 int y = block.getLigne()*GameConfiguration.CASE_DIMENSION;		 
					 graphics.drawImage(herbe.getImage(),x,y,GameConfiguration.CASE_DIMENSION , GameConfiguration.CASE_DIMENSION, null);
				 
			}
		}
	}
	
	
	  public void paint(Fermier farmer , Graphics graphics) { ImageIcon standUp =
	  new ImageIcon("C:/Users/dania/Desktop/presonnage/stand.png");
	  farmer.setFarmerImage(standUp.getImage()); int x =
	  farmer.getPosition().getColonne_init()*GameConfiguration.CASE_DIMENSION; int
	  y = farmer.getPosition().getLigne_init()*GameConfiguration.CASE_DIMENSION;
	  graphics.drawImage(farmer.getFarmerImage(), x,
	  y,GameConfiguration.CASE_DIMENSION , GameConfiguration.CASE_DIMENSION, null);
	  
	  }
	 
	
	public void paint( Element element , Graphics graphics) {
		ImageIcon icone = new ImageIcon("C:/Users/dania/Desktop/presonnage/grange1.png");
		Position position = element.getPosition();
		int x = position.getColonne_init()*GameConfiguration.CASE_DIMENSION;
		int y = position.getLigne_init()*GameConfiguration.CASE_DIMENSION;
		graphics.drawImage(icone.getImage(), x, y,GameConfiguration.CASE_DIMENSION*position.getNbColonne() , GameConfiguration.CASE_DIMENSION*position.getNbLigne(), null);	
	}
	

	public void paint(Etable etable , Graphics graphics) {
		ImageIcon icone = new ImageIcon("C:/Users/dania/Desktop/presonnage/maison.png");
		Position position = etable.getPosition();
		int x = position.getColonne_init()*GameConfiguration.CASE_DIMENSION;
		int y = position.getLigne_init()*GameConfiguration.CASE_DIMENSION;
		graphics.drawImage(icone.getImage(), x, y,GameConfiguration.CASE_DIMENSION*position.getNbColonne() , GameConfiguration.CASE_DIMENSION*position.getNbLigne(), null);	
	}
	
	
}
