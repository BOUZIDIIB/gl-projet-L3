package gui;

import java.util.HashMap;

import stucture_base.Element;

public class Choix {
	private HashMap<String, Element> composants ;
	
	public Choix() {
		composants = new HashMap<>();
	}
	
	public void addElement(Element element) {
		if(!composants.containsKey(element.getReference())) {
			composants.put(element.getReference(), element);
		}
	}
	
	public HashMap<String, Element> getComposants(){
		return composants ;
	}
	
	public void removeElement(Element element) {
		if(!composants.containsKey(element.getReference())) {
			composants.remove(element.getReference());
		}
	}
}
