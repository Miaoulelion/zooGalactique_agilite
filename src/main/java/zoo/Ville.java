package zoo;

import java.util.ArrayList;

/**
 * Décrivez votre classe Ville ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Ville
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Zoo unZoo;
    private int montantAidesZooTotal;
    
    public Zoo getUnZoo(){
        return this.unZoo;
    }
    
    public void setUnZoo(Zoo unZoo){
        if(unZoo.getVille() == null){
            this.unZoo = unZoo;
            unZoo.setVille(this);
        }
        this.unZoo = unZoo;
    }
    
    /**
     * Constructeur d'objets de classe Ville
     */
    public Ville()
    {
        // initialisation des variables d'instance
    }

    public int getMontantAidesZooTotal(){
        return this.montantAidesZooTotal;
    }

    public int calcAides()
    {
        ArrayList<Integer> lstAttributs = this.unZoo.getAttributs();
        int nbVisiteurs = lstAttributs.get(0);
        int superficie = lstAttributs.get(1);
        
        superficie = superficie / 1000;
        int valCalc = (nbVisiteurs / superficie) * 100;
        this.montantAidesZooTotal += valCalc;
        
        return this.montantAidesZooTotal;
    }
}
