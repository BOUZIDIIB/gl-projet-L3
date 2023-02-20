package data.gestion;

import java.util.HashMap;

import data.acteur.Employee;





public class GestionnaireRH {
	private HashMap<String, Employee> employees = new HashMap<>();

	public HashMap<String, Employee> getEmployees() {
		return employees;
	}

	private static GestionnaireRH instance = new GestionnaireRH();
	
	private GestionnaireRH() {}
	
	public static GestionnaireRH getInstance() {
		return instance;
	}
	
	
}
