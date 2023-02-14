package generateur.game;



import acteur.Fermier;
import configuration.GameConfiguration;
import generateur.map.Case;
import myExceptions.AucunElementSelectionne;
import myExceptions.BlockNotFreeException;
import structure.Etable;
import stucture_base.Element;


/**
 * responsable des evenement lié au element mobile le mouvement 
 * @author dania
 *
 */
public class ElementManager {
	private MapManager mapManager ;
	private Fermier fermier ;
	private Etable etable ;
	
	
	public ElementManager(MapManager mapManager) {
		this.mapManager=mapManager;
	}
	
	
	/**
	 * ajouter le fermier à la map 
	 * @param fermier
	 */
	public void add(Fermier fermier) {
		this.fermier=fermier;
		try {
			mapManager.addElement(fermier);
		} catch (BlockNotFreeException e) {
			e.printStackTrace();
		}
	}
	
	
	public void add (Etable etable) {
		this.etable=etable;
		try {
			mapManager.addElement(etable);
		} catch (BlockNotFreeException e) {
			e.printStackTrace();
		}
	}
	
	public void add(Element element ) {
		try {
			mapManager.addElement(element);
		} catch (BlockNotFreeException e) {
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
		}
	
	}
	
	public void moveFarmerRight() {
		Case new_case_Fermier = new Case (false ,fermier.getPosition().getLigne_init() , fermier.getPosition().getColonne_init()+1);		
		if(new_case_Fermier.getColonne()<GameConfiguration.NB_COLONNE-1) {
			mapManager.moveElement(fermier,new_case_Fermier );			
		}
	}
	public void moveFarmerLeft() {
		Case new_case_Fermier = new Case (false ,fermier.getPosition().getLigne_init() , fermier.getPosition().getColonne_init()-1);		
		if(new_case_Fermier.getColonne()>=0) {
			mapManager.moveElement(fermier,new_case_Fermier );			
		}
	}
	public void moveFarmerUp() {
		Case new_case_Fermier = new Case (false ,fermier.getPosition().getLigne_init()-1 , fermier.getPosition().getColonne_init());		
		if(new_case_Fermier.getLigne()>= 0) {	
			mapManager.moveElement(fermier,new_case_Fermier );
		}
	}
	
	public void moveFarmerDown() {
		Case new_case_Fermier = new Case (false ,fermier.getPosition().getLigne_init()+1 , fermier.getPosition().getColonne_init());		
		if(new_case_Fermier.getLigne()<GameConfiguration.NB_LIGNE-1) {
			mapManager.moveElement(fermier,new_case_Fermier );			
		}
	}

	public MapManager getMapManager() {
		return mapManager;
	}
	
	public Fermier getFermier() {
		return fermier;
	}
	
	public Etable getEtable() {
		return etable ;
	}
	
	public Element search(int x , int y ) {
		int ligne = y/GameConfiguration.CASE_DIMENSION ; 
		int colone = x/GameConfiguration.CASE_DIMENSION ;
		
		Case mouse = new Case(true ,ligne , colone );
		Element elementMouse = null ;
		try {
			 elementMouse = mapManager.getElement(mouse);
		} catch (AucunElementSelectionne e) {
			System.err.println(e.getMessage());
		}
		
		return elementMouse ; 
		
		
	}
	
}
