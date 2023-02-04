package espece;

import notion.EtatSante;
import stucture_base.Element;

public abstract class EtreVivant extends Element{
	private Milieu milieu ;
	private int dureeVie;
	private float prixAchat ;
	private float niveauEau;
	private EtatSante etatSante;
	

	public EtreVivant( int nbCase, int ligne_init, int colonne_init, Milieu milieu, int dureeVie,
			float prixAchat, float niveauEau, EtatSante etatSante) {
		super(true, nbCase, ligne_init, colonne_init);
		this.milieu = milieu;
		this.dureeVie = dureeVie;
		this.prixAchat = prixAchat;
		this.niveauEau = niveauEau;
		this.etatSante = etatSante;
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


	public void setEtatSante(EtatSante etatSante) {
		this.etatSante = etatSante;
	}
	

}
