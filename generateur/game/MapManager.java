package generateur.game;

import java.util.HashMap;

import java.util.NoSuchElementException;

import configuration.GameConfiguration;
import generateur.map.Case;
import generateur.map.Map;
import myExceptions.BlockNotFreeException;
import stucture_base.Element;
import stucture_base.Position;

/**
 * responsable de la disposition des elements sur la map (pas de mouvement)
 * @author dania
 *
 */
public class MapManager {

	private Map map ; 
	private HashMap<String, Element> composants ;
	
	
	public MapManager(Map map ) {
		this.map=map ;
		composants = new HashMap<>();
	}
	
	/**
	 * verifie que toutes les cases qu'on veut affecter au nouvelle objet sont libre puis ajoute l'objet 
	 * @param element l'element à placer
	 * @throws BlockNotFreeException genere une exception si la position n'est pas disponible 
	 */
	public void addElement(Element element ) throws BlockNotFreeException{
		Position position = element.getPosition();
		// condition d'insertion (les cases voulues sont vide )
		Case[][] cases = position.getTabCase();
	
		for(int indexLignePosition = 0 ; indexLignePosition< position.getNbLigne() ; indexLignePosition ++) {
			for(int indexColonnePosition = 0 ; indexColonnePosition < position.getNbColonne() ; indexColonnePosition ++) {
				Case el = cases[indexLignePosition][indexColonnePosition];
				if( ! map.getCase(el.getLigne(), el.getColonne()).isLibre()) {
					throw  new BlockNotFreeException();
				}	
			}
		}
		composants.put(element.getReference(), element );
		reserve(element);
	}
	
	/**
	 * change l'etat libre de la case en false pour la reserver 
	 * @param element
	 */
	public void reserve(Element element ) {
		Case[][] cases = element.getPosition().getTabCase();
		for(int indexLignePosition = 0 ; indexLignePosition< element.getPosition().getNbLigne() ; indexLignePosition ++) {
			for(int indexColonnePosition = 0 ; indexColonnePosition < element.getPosition().getNbColonne() ; indexColonnePosition ++) {
				Case el = cases[indexLignePosition][indexColonnePosition];
				map.getCase(el.getLigne(), el.getColonne()).setLibre(false);				
			}
		}
	}
	
	/**
	 * responsable du mouvement des element mobiles (fermier , animaux ...)
	 * @param element
	 * @param new_case
	 */
	public void moveElement(Element element , Case new_case ) {
		try {
		
			Element el = get(element.getReference());
			el.freePosition();
			
			if(verificationLiberte(element, new_case)) {
				
				el.setPosition(new_case.getLigne(), new_case.getColonne());	
				
			}
			else {
				reserve(element);
			}
		}catch(NoSuchElementException e){
			System.err.println(e.getMessage());	
		}			
	}
	
	
	public boolean verificationLiberte(Element element , Case init) {
		
		int lignes = element.getPosition().getNbLigne();
		int colonnes = element.getPosition().getNbColonne();
		
		for(int indexl = init.getLigne() ; indexl < init.getLigne() + lignes ; indexl ++) {
			for(int indexc = init.getColonne() ; indexc <  init.getColonne() + colonnes ; indexc ++) {
				if(!map.getCase(indexl, indexc).isLibre()) {
					return false ;
				}
			}
		}
		
		return true ;	
	}

	/**
	 * recuperer un element dans la map (il faut verfier que equals est bien redefini dans la classe de l'element )
	 * @param element
	 * @return
	 * @throws NoSuchElementException
	 */
	public Element get(String element) throws NoSuchElementException{
		if(composants.containsKey(element)) {
			return composants.get(element);
		}
		throw new NoSuchElementException("l'element à deplacer n'existe pas");
	}
	
	public Map getMap() {
		return map ;
	}
	
	public HashMap<String, Element> getElements(){
		return composants;
	}

	public Element getElement(Case block) {
		for(Element element : composants.values()) {
			if(element.getPosition().contains(block)) {
				return element ;
			}
		}
		return null ;
	}
	
	public void movingMap(int dx , int dy ) {
		int xmap = map.getX();
		
		if(xmap +dx <= 0) {
			map.setX(xmap + decalage(dx));
		}
		int ymap = map.getY();
		if(ymap +dy <=0) {
			map.setY(ymap + decalage(dy) );			
		}
		
	}
	
	public int decalage(int dx) {
		return dx - dx%GameConfiguration.CASE_DIMENSION;
	}
	
}
