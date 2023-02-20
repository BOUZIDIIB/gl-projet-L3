package process.visitor;

import data.acteur.Employee;
import data.espece.faune.Animal;
import data.flore.Culture;
import data.materiel.Engin;
import data.materiel.Outil;
import data.production.Produit;
import data.structure.Structure;


public interface GestionVisitor<T> {

		T visit(Animal animal);

		T visit(Culture culture);

		T visit(Structure structure);

		T visit(Employee employee);
		
		T visit(Outil outil);

		T visit(Engin engin);
		
		T visit(Produit product);
		
}