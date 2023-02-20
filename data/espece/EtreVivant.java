package data.espece;

import data.map.Map;
import data.myExceptions.EstDejaEnBonneSanteException;
import data.myExceptions.MortException;
import data.notion.Mortel;
import data.stucture_base.Element;
import process.transaction.Buyable;
import process.transaction.Saleable;

public abstract class EtreVivant extends Element implements Mortel,Saleable,Buyable{
	private Milieu milieu ;
	private int dureeVie;
	private float prixAchat ,prixVente;
	private float niveauEau;
	private EtatSante etatSante;
	

	public EtreVivant( int nbCase, int ligne_init, int colonne_init, Milieu milieu, int dureeVie,
			float prixAchat, float niveauEau , String reference , Map map) {
		super(reference ,true, nbCase, ligne_init, colonne_init , map );
		this.milieu = milieu;
		this.dureeVie = dureeVie;
		this.prixAchat = prixAchat;
		this.niveauEau = niveauEau;
		this.etatSante = EtatSante.BONNE_SANTE;
	}


	public Milieu getMilieu() {
		return milieu;
	}


	public int getDureeVie() {
		return dureeVie;
	}


	public float getNiveauEau() {
		return niveauEau;
	}


	public void setNiveauEau(float niveauEau) {
		this.niveauEau = niveauEau;
	}


	public EtatSante getEtatSante() {
		return etatSante;
	}
	
	public void empireEtatSante() throws MortException{
		switch(etatSante){
			case BONNE_SANTE:
				etatSante = EtatSante.MALADE;
				break;
			case MALADE:
				etatSante = EtatSante.GRAVEMENT_MALADE;
				break; 
			case GRAVEMENT_MALADE:
				etatSante = EtatSante.MOURANT;
				break;
			default :
				throw new MortException(this);	
		}
	}
    public void amelioreEtatSante() throws EstDejaEnBonneSanteException{
		switch(etatSante){
			case MALADE:
				etatSante = EtatSante.BONNE_SANTE;
				break;
			case GRAVEMENT_MALADE:
				etatSante = EtatSante.MALADE;
				break;
			case MOURANT:
				etatSante = EtatSante.GRAVEMENT_MALADE;
				break;
			default :
				throw new EstDejaEnBonneSanteException(this);
		}
	}
    public void guerir() throws EstDejaEnBonneSanteException{
		switch(etatSante){
			case BONNE_SANTE:
				throw new EstDejaEnBonneSanteException(this);
			default:
				etatSante = EtatSante.BONNE_SANTE;
		}
	}
    
    @Override
	public float getPrixAchat() {
		return prixAchat;
	}
	
	@Override
	public float getPrixVente() {
		return prixVente;
	}

	public void setStatique() {
		super.setStatique(false);
	}

}
