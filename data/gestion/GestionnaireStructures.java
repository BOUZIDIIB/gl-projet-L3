package data.gestion;

import java.util.HashMap;

import data.map.Map;
import data.structure.Entrepot;
import data.structure.Etable;
import data.structure.Maison;
import data.structure.Poulallier;
import data.structure.Structure;



public class GestionnaireStructures {
	private HashMap<String, Structure> structures = new HashMap<>();
	
	public HashMap<String, Structure> getStructures() {
		return structures;
	}

	private static GestionnaireStructures instance = new GestionnaireStructures();
	
	private GestionnaireStructures(){}
	
	public static GestionnaireStructures getInstance() {
		return instance;
	}
	
	public void initializeGestionnaire(Map map ) {
		Maison maison0 = new Maison(0, 0, "ma0", map);
		Etable etable = new Etable(0, 0, "et0", map);
		Poulallier poulallier = new Poulallier(0, 0, "po0", map);
		Entrepot entrepot = new Entrepot(0, 0, "en0", map);
		Maison maison1 = new Maison(0, 0, "ma1", map);
		
		structures.put(maison1.getReference(), maison1);
		structures.put(maison0.getReference(), maison0);
		structures.put(etable.getReference(), etable);
		structures.put(poulallier.getReference(), poulallier);
		structures.put(entrepot.getReference(), entrepot);
	}
	
	public String toString() {
		StringBuffer gestionnaire = new StringBuffer("\t"+ this.getClass().getSimpleName());
		gestionnaire.append("\n\t\t Structures :");
		for (Structure structure : structures.values()) {
			gestionnaire.append("\n\t\t\t"+ structure.toString());
		}
		return gestionnaire.toString();
	}
	
}
