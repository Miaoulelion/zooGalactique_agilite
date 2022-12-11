package zoo;
import java.util.ArrayList;

import planetes.Planete;

/**
 * Décrivez votre classe Ville ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Ville
{
    // variables d'instance
    private Zoo unZoo;
    private int montantAidesZooTotal;
    private Planete planete;
    
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
     * On a potentiellement envie de connaitre sur quelle planete la ville se situe
     * @return planete
     */
    public Planete getPlanete() {
    	return this.planete;
    }
    
    /**
     * Méthode permettant d'associer une planete à une ville
     * @param planete
     */
    public void setPlanete(Planete planete) {
    	if(this.planete != null && !this.planete.getVilles().contains(this)) {
    		this.planete.addVille(this);
    	}
    	this.planete = planete;
    }
    
    /**
     * Constructeur d'objets de classe Ville
     */
    public Ville(){
        // initialisation des variables d'instance
    }

    public int getMontantAidesZooTotal(){
        return this.montantAidesZooTotal;
    }

    public int getMontantAidesZoo(){
        ArrayList<Integer> nombreVisiteursEtSuperficieZoo = this.unZoo.getNombreVisiteursEtSuperficie();
        int nombreVisiteurs = nombreVisiteursEtSuperficieZoo.get(0);
        int superficie = nombreVisiteursEtSuperficieZoo.get(1);
        
        calculAides(nombreVisiteurs, superficie);
        
        return this.montantAidesZooTotal;
    }

	public void calculAides(int nombreVisiteurs, int superficie){
		superficie = superficie / 1000;
        int valCalc = (nombreVisiteurs / superficie) * 100;
        this.montantAidesZooTotal += valCalc;
	}

}