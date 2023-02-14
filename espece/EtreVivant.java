package espece;

import myExceptions.EstDejaEnBonneSanteException;
import myExceptions.MortException;
import notion.Mortel;
import stucture_base.Element;

public abstract class EtreVivant extends Element implements Mortel{
	private Milieu milieu ;
	private int dureeVie;
	private float prixAchat ;
	private float niveauEau;
	private EtatSante etatSante;
	

	public EtreVivant( int nbCase, int ligne_init, int colonne_init, Milieu milieu, int dureeVie,
			float prixAchat, float niveauEau , String reference) {
		super(reference ,true, nbCase, ligne_init, colonne_init );
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

	public float getPrixAchat() {
		return prixAchat;
	}


	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
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


}
