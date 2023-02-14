package evenement;

import java.util.ArrayList;

import acteur.ModeDefense;
import acteur.Predateur;
import stucture_base.Element;

public class Catastrophe {
	private int duree;
	private int debut;
	private boolean succes;
	private Predateur predateur;
	private ModeDefense modeDefense;
	
	private ArrayList<Element> cibles = new ArrayList<>();


	
	public Catastrophe(int duree, int debut, boolean succes, Predateur predateur, ModeDefense modeDefense,
			ArrayList<Element> cibles) {
		super();
		this.setDuree(duree);
		this.setDebut(debut);
		this.setSucces(succes);
		this.setPredateur(predateur);
		this.setModeDefense(modeDefense);
		this.cibles = cibles;
	}

	public ArrayList<Element> getCibles() {
		return cibles;
	}

	public void addCible(Element cible) {
		cibles.add(cible);
	}
	
	public void removeCible(Element cible) {
		cibles.remove(cible);
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getDebut() {
		return debut;
	}

	public void setDebut(int debut) {
		this.debut = debut;
	}

	public boolean isSucces() {
		return succes;
	}

	public void setSucces(boolean succes) {
		this.succes = succes;
	}

	public Predateur getPredateur() {
		return predateur;
	}

	public void setPredateur(Predateur predateur) {
		this.predateur = predateur;
	}

	public ModeDefense getModeDefense() {
		return modeDefense;
	}

	public void setModeDefense(ModeDefense modeDefense) {
		this.modeDefense = modeDefense;
	}
	
}