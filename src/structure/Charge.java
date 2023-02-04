package structure;

/**
 * determine les charges d'une structure 
 * @author dania
 *
 */
public class Charge {
	
	private float montant ;
	
	private int delais ;
	
	private String type ;
	
	
	public Charge(float montant, int delais, String type) {
		this.montant = montant;
		this.delais = delais;
		this.type = type;
	}
	
	public float getMontant() {
		return montant;
	}
	
	
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	
	public int getDelais() {
		return delais;
	}
	
	
	public void setDelais(int delais) {
		this.delais = delais;
	}
	
	
	public String getType() {
		return type;
	}
	
	
	public void setType(String type) {
		this.type = type;
	}
	
	
}
