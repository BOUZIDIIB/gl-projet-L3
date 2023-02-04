package travail;

import java.util.HashMap;

public class Planning {
	private HashMap<Heure, Tache> taches ;

	public Planning(HashMap<Heure, Tache> taches) {
		this.taches = taches;
	}
	
	public Planning() {
		taches= new HashMap<>();
	}

	public HashMap<Heure, Tache> getTaches() {
		return taches;
	}

	// rajouter un throws exception en cas de non disponibilité de l'heure voulu 
	public void addTach(Heure heure , Tache tache) {
		if(!taches.containsKey(heure)) {
			taches.put(heure, tache);			
		}

	}
	
	public void removeTache(Heure heure) {
		taches.remove(heure);
	}
	
}
