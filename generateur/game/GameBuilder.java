package generateur.game;

import java.util.Date;

import acteur.Fermier;
import configuration.GameConfiguration;
import generateur.map.Map;
import structure.Etable;
import structure.Maison;
import travail.Planning;


public class GameBuilder {
	
	
	/**
	 * initialiser la map et son manager 
	 * @return
	 */
	public static MapManager MapBuilder() {
		Map map = new Map(GameConfiguration.NB_LIGNE , GameConfiguration.NB_COLONNE);
		MapManager manager = new MapManager(map);
		return manager ;
	}
	
	public static ElementManager buildinElement() {
		ElementManager elementManager = new ElementManager(MapBuilder());
		
		// initialiser le jeu ici 
		initialize(elementManager);

		return elementManager ;
	}
	

	/**
	 * positionner des elements dans des endroits fixe pour le test 
	 * @param manager
	 */
	private static void initialize(ElementManager manager ) {
		Planning planning = new Planning();
		
		Fermier fermier = new Fermier ("albert", planning, 10, 10, new Date(20), "fermier");
		manager.add(fermier);
		
		Etable etable = new Etable(5, 5,"etable");
		manager.add(etable);
		
		Maison grange = new Maison(1, 1,"grange");
		manager.add(grange);
		
		
		
	}
	
	

}
