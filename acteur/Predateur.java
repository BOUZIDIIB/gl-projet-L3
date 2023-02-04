package acteur;

import java.util.ArrayList;

import espece.EtreVivant;
import stucture_base.Element;

public class Predateur extends Element{
	
	private ArrayList<EtreVivant> proies ;
	private ModeDefense modeDefense ;

	public Predateur(  int ligne_init, int colonne_init , ModeDefense mode , ArrayList<EtreVivant> proies) {
		super(false, 1, ligne_init, colonne_init);
		this.proies = proies;
		modeDefense=mode;	
		
	}

	public ArrayList<EtreVivant> getProies() {
		return proies;
	}

	public void setProies(ArrayList<EtreVivant> proies) {
		this.proies = proies;
	}

	public ModeDefense getModeDefense() {
		return modeDefense;
	}

	public void setModeDefense(ModeDefense modeDefense) {
		this.modeDefense = modeDefense;
	}
	
	public void addProie(EtreVivant proie) {
		proies.add(proie);
	}
	
	public void removeProie(EtreVivant proie) {
		proies.remove(proie);
	}

}
