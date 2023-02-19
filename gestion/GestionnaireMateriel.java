package gestion;

import java.util.HashMap;

import materiel.Engin;
import materiel.Outil;


public class GestionnaireMateriel {

	private HashMap<String, Outil> gestionnaireOutils = new HashMap<>();
	private HashMap<String, Engin> gestionnaireEngins = new HashMap<>();
	
	public HashMap<String, Outil> getGestionnaireOutils() {
		return gestionnaireOutils;
	}
	
	public HashMap<String, Engin> getGestionnaireEngins() {
		return gestionnaireEngins;
	}
	
	private static GestionnaireMateriel instance = new GestionnaireMateriel();
	
	private GestionnaireMateriel(){}
	
	public static GestionnaireMateriel getInstance() {
		return instance;
	}
	
	public String toString() {
		StringBuffer gestionnaire = new StringBuffer("\t"+ this.getClass().getSimpleName());
		gestionnaire.append("\n\t\t Outils :");
		for (Outil etre : gestionnaireOutils.values()) {
			gestionnaire.append("\n\t\t\t"+ etre.toString());
		}
		gestionnaire.append("\n\t\t Engins :");
		for (Engin etre : gestionnaireEngins.values()) {
			gestionnaire.append("\n\t\t\t"+ etre.toString());
		}
		return gestionnaire.toString();
	}
}
