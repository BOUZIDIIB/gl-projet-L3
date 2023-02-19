package gestion;

import java.util.HashMap;

import structure.Structure;

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
	
	public String toString() {
		StringBuffer gestionnaire = new StringBuffer("\t"+ this.getClass().getSimpleName());
		gestionnaire.append("\n\t\t Structures :");
		for (Structure structure : structures.values()) {
			gestionnaire.append("\n\t\t\t"+ structure.toString());
		}
		return gestionnaire.toString();
	}
	
}
