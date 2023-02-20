package process.visitor;

import data.acteur.Employee;
import data.espece.faune.Animal;
import data.flore.Culture;
import data.gestion.GestionnaireMateriel;
import data.gestion.GestionnaireRH;
import data.gestion.GestionnaireStocks;
import data.gestion.GestionnaireStructures;
import data.materiel.Engin;
import data.materiel.Outil;
import data.production.Produit;
import data.structure.Structure;

public class AddVisitor implements GestionVisitor<Void>{

	@Override
	public Void visit(Animal animal) {
		GestionnaireStocks.getInstance().getGestionnaireAnimaux().put(animal.getReference(),animal);
		return null;
	}

	@Override
	public Void visit(Culture culture) {
		GestionnaireStocks.getInstance().getGestionnaireCulture().put(culture.getReference(),culture);
		return null;
	}

	@Override
	public Void visit(Structure structure) {
		GestionnaireStructures.getInstance().getStructures().put(structure.getReference(),structure);
		return null;
	}

	@Override
	public Void visit(Employee employee) {
		GestionnaireRH.getInstance().getEmployees().put(employee.getReference(),employee);
		return null;
	}

	@Override
	public Void visit(Outil outil) {
		GestionnaireMateriel.getInstance().getGestionnaireOutils().put(outil.getReference(),outil);
		return null;
	}

	@Override
	public Void visit(Engin engin) {
		GestionnaireMateriel.getInstance().getGestionnaireEngins().put(engin.getReference(),engin);
		return null;
	}
	
	@Override
	public Void visit(Produit product) {
		GestionnaireStocks.getInstance().getGestionnaireProduits().put(product.getReference(),product);
		return null;
	}

//	@Override
//	public Void visit(Achat achat) {
//		GestionnaireFinancier.getInstance().getTransactions().put(achat.getReference(),achat);
//		return null;
//	}
//	
//	@Override
//	public Void visit(Vente vente) {
//		GestionnaireFinancier.getInstance().getTransactions().put(vente.getReference(),vente);
//		return null;
//	}
	
}
