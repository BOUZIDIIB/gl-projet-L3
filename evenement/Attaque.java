package evenement;

import java.util.ArrayList;

import acteur.ModeDefense;
import acteur.Predateur;
import stucture_base.Element;

public class Attaque extends Catastrophe{

	public Attaque(int duree, int debut, boolean succes, Predateur predateur, ModeDefense modeDefense,
			ArrayList<Element> cibles) {
		super(duree, debut, succes, predateur, modeDefense, cibles);
	}

}
