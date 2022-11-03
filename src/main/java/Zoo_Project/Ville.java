package Zoo_Project;
import java.util.ArrayList;

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

	private void calculAides(int nombreVisiteurs, int superficie){
		superficie = superficie / 1000;
        int valCalc = (nombreVisiteurs / superficie) * 100;
        this.montantAidesZooTotal += valCalc;
	}

}