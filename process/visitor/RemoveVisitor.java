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

public class RemoveVisitor implements GestionVisitor<Void>{

	@Override
	public Void visit(Animal animal) {
		GestionnaireStocks.getInstance().getGestionnaireAnimaux().remove(animal.getReference(),animal);
		return null;
	}

	@Override
	public Void visit(Culture culture) {
		GestionnaireStocks.getInstance().getGestionnaireCulture().remove(culture.getReference(),culture);
		return null;
	}

	@Override
	public Void visit(Structure structure) {
		GestionnaireStructures.getInstance().getStructures().remove(structure.getReference(),structure);
		return null;
	}

	@Override
	public Void visit(Employee employee) {
		GestionnaireRH.getInstance().getEmployees().remove(employee.getReference(),employee);
		return null;
	}

	@Override
	public Void visit(Outil outil) {
		GestionnaireMateriel.getInstance().getGestionnaireOutils().remove(outil.getReference(),outil);
		return null;
	}

	@Override
	public Void visit(Engin engin) {
		GestionnaireMateriel.getInstance().getGestionnaireEngins().remove(engin.getReference(),engin);
		return null;
	}
	
	@Override
	public Void visit(Produit product) {
		GestionnaireStocks.getInstance().getGestionnaireProduits().remove(product.getReference(),product);
		return null;
	}
	
}
