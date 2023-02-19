package process.visitor;

import acteur.Employee;

import espece.faune.Animal;
import flore.Culture;
import materiel.Engin;
import materiel.Outil;
import production.Produit;
import structure.Structure;


public interface GestionVisitor<T> {

		T visit(Animal animal);

		T visit(Culture culture);

		T visit(Structure structure);

		T visit(Employee employee);
		
		T visit(Outil outil);

		T visit(Engin engin);
		
		T visit(Produit product);
		
}