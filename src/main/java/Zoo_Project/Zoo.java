package Zoo_Project;
import java.util.ArrayList;

/**
 * Décrivez votre classe Zoo ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Zoo
{
    // variables d'instance
    private int nombreVisiteurs;
    private int superficie;
    private Ville ville;
    private ArrayList<Animal> listeAnimauxPresents;
    

	public int getNombreVisiteurs(){
        return this.nombreVisiteurs;
    }
    
    public int getSuperficie(){
        return this.superficie;
    }
    
    public Ville getVille(){
        return this.ville;
    }
    
    public void setNombreVisiteurs(int nombreVisiteurs){
        this.nombreVisiteurs = nombreVisiteurs;
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
    
    public ArrayList<Animal> getListeAnimauxPresents(){
		return listeAnimauxPresents;
	}

	public void setListeAnimauxPresents(ArrayList<Animal> animaux){
		this.listeAnimauxPresents = animaux;
		for (Animal animal : this.listeAnimauxPresents){
			animal.setZoo(this);
		}
	}

    /**
     * Constructeur d'objets de classe Zoo
     */
    public Zoo(){
        // initialisation des variables d'instance
        this.nombreVisiteurs = 300000;
        this.superficie = 500000;
        this.listeAnimauxPresents = new ArrayList<Animal>();
    }

    public ArrayList<Integer> getNombreVisiteursEtSuperficie(){
        ArrayList<Integer> nombreVisiteursEtSuperficieZoo = new ArrayList<Integer>();
        
        nombreVisiteursEtSuperficieZoo.add(this.nombreVisiteurs);
        nombreVisiteursEtSuperficieZoo.add(this.superficie);

        return nombreVisiteursEtSuperficieZoo;
    }
    
    public void ajouterAnimal(Animal animal){
    	if(!this.listeAnimauxPresents.contains(animal)){
    		this.listeAnimauxPresents.add(animal);
        	animal.setZoo(this);
    	}
    }
    
    public int getNombreAnimaux() {
    	return this.listeAnimauxPresents.size();
    }

}

