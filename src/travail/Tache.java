package travail;

import java.util.ArrayList;

import stucture_base.Element;

public class Tache {
	private Mission mission ;
	private int duree;
	private ArrayList<Element> cibles ;
	
	
	public Tache(Mission mission, int duree, ArrayList<Element> cibles) {
		this.mission = mission;
		this.duree = duree;
		this.cibles = cibles;
	}


	public Mission getMission() {
		return mission;
	}


	public void setMission(Mission mission) {
		this.mission = mission;
	}


	public int getDuree() {
		return duree;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}


	public ArrayList<Element> getCibles() {
		return cibles;
	}

	public void addCible(Element cible) {
		cibles.add(cible);
	}
	
	public void removeCible(Element cible ) {
		cibles.remove(cible);
	}
	
	
	

}
