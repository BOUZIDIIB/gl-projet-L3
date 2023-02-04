package notion;

import espece.EstDejaEnBonneSanteException;
import espece.MortException;

public interface Mortel {
    public enum EtatSante {
        BONNE_SANTE, 
        MALADE, 
        GRAVEMENT_MALADE,
        MOURANT;
    }

    void vieillir() throws MortException;
    void empireEtatSante() throws MortException;
    void amelioreEtatSante() throws EstDejaEnBonneSanteException;
    void guerir() throws EstDejaEnBonneSanteException;




}
