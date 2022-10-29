package zoo;

import java.util.ArrayList;

/**
 * Décrivez votre classe Zoo ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Zoo
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int nbVisiteurs;
    private int superficie;
    private Ville ville;
    
    public int getNbVisiteurs(){
        return this.nbVisiteurs;
    }
    
    public int getSuperficie(){
        return this.superficie;
    }
    
    public Ville getVille(){
        return this.ville;
    }
    
    public void setNbVisiteurs(int nbVisiteurs){
        this.nbVisiteurs = nbVisiteurs;
    }
    
    public void setSuperficie(int superficie){
        this.superficie = superficie;
    }
    
    public void setVille(Ville ville){
        if(ville.getUnZoo() == null){
            this.ville = ville;
            ville.setUnZoo(this);
        }
        this.ville = ville;
    }

    /**
     * Constructeur d'objets de classe Zoo
     */
    public Zoo()
    {
        // initialisation des variables d'instance
        this.nbVisiteurs = 300000;
        this.superficie = 500000;
    }

    public ArrayList<Integer> getAttributs()
    {
        ArrayList<Integer> lstAttributs = new ArrayList<Integer>();
        
        lstAttributs.add(this.nbVisiteurs);
        lstAttributs.add(this.superficie);

        return lstAttributs;
    }
}

