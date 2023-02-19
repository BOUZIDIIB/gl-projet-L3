package process.visitor;

import acteur.Employee;
import espece.faune.Animal;
import flore.Culture;
import gestion.GestionnaireMateriel;
import gestion.GestionnaireRH;
import gestion.GestionnaireStocks;
import gestion.GestionnaireStructures;
import materiel.Engin;
import materiel.Outil;
import production.Produit;
import structure.Structure;

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
