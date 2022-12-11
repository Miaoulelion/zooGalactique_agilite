package planetes;

import java.util.LinkedList;

import zoo.Ville;

/**
 * La classe planète décrit une planète et ses comportements
 * Une planète peut avoir un noyau et un ou plusieurs satellites
 * (Promis pas d'astéroïde)
 * @author (Nicolas, Anis)
 */
public class Planete {
    // Variables d'instance représentant les principales caractéristiques 
    // d'une planète
    private int diametre;
    private int temperatureMoyenne;
    private Noyau noyau;
    private LinkedList<Satellite> satellites;
    private LinkedList<Ville> villes;

    /**
     * Constructeur d'objets de classe Planete
     */
    
    public Planete(int diametre, int temp){
    	this.setTemperatureMoyenne(temp);
    	this.setDiametre(diametre);
        this.satellites = new LinkedList<Satellite>();
        this.villes = new LinkedList<Ville>();
    }
    
    /**
     * Par défaut les planètes sont très petites et il y fait
     * plutôt chaud...
     */
    
    public Planete(){
    	this.setDiametre(100);
    	this.setTemperatureMoyenne(100);
        this.satellites = new LinkedList<Satellite>();
        this.villes = new LinkedList<Ville>();
    }
    
    /**
     * Une planète suffisamment jeune et dynamique peut posséder un noyau.
     * Cette méthode permet d'ajouter un noyau à une planète.
     * @param noyau
     */
    
    public void setNoyau(Noyau noyau){
        if(noyau==null){
            throw new IllegalArgumentException("Il n'y a pas de noyau, noyau == null");
        }
        this.noyau=noyau;
    }

    /**
     * Donne à l'utilisateur le diamètre de l'instance de planète
     * @return     le diametre de la planète
     */
    public int getDiametre(){
        return this.diametre;
    }
    
    /**
     * Donne à l'utilisateur la température moyenne de l'instance
     * de planète
     * @return  la température moyenne de la planète
     */
    public int getTemperatureMoyenne(){
        return this.temperatureMoyenne;
    }
    
    /**
     * Parfois la température peut monter...
     * Méthode permettant de modifier la température de la planète
     */
    public void setTemperatureMoyenne(int temperature){
    	if(temperature < 0) {
    		throw new IllegalArgumentException("La temperature est en kelvin et ne peut être inférieure à 0");
    	}
        this.temperatureMoyenne=temperature;
    }
    
    /**
     * Certaines planètes font un régime...
     * Méthode permettant de modifier le diamètre de la planète
     */
    public void setDiametre(int diam){
    	if(diam < 0) {
    		throw new IllegalArgumentException("Un diametre ne peut être inférieur à 0");
    	}
        this.diametre=diam;
    }
    
    /**
     * Getter du noyau de la planète.
     */
    public Noyau getNoyau(){
        return this.noyau;
    }
    
    /**
     * Les scientifique avaient besoin d'une méthode de calcul simple et efficace pour connaître
     * le diamètre et la température moyenne d'une planète d'un seul coup !
     * @return Un tableau de deux éléments, le premier étant le diamètre de la planète et le second la température moyenne.
     */
    
    public int[] getDiametreEtTemperatureMoyenne(){
        return new int[]{this.diametre,this.temperatureMoyenne};
    }

    /**
     * Ajoute un satellite autour d'une planète.
     * @param une Planete
     */
    
    public void addSatellite(Satellite satellite) {
    	if(satellite == null) {
    		throw new IllegalArgumentException("Ajout de planète == null non valide");
    	}
    	this.satellites.add(satellite);
    	satellite.setPlanete(this);
    }
    
    /**
     * On a parfois besoin de savoir qui accompagne une planète !
     * @return une copie de la liste de satellites (avec les vraies satellites dedans !)
     */
    
	public LinkedList<Satellite> getSatellites() {
		return new LinkedList<Satellite>(this.satellites);
	}
	
	/**
	 * Une planète peut décider de continuer son chemin seule.
	 * Un satellite peut se perdre dans le reste de l'univers...
	 * Attention car un satellite quant à lui n'oublie jamais sa planète, jusqu'à ce qu'elle soit remplacée.
	 * @param satellite
	 */
	
	public void deleteSatellite(Satellite satellite) {
		if(this.satellites.contains(satellite)) {
			this.satellites.remove(satellite);
		}
	}
	
	public LinkedList<Ville> getVilles() {
		return this.villes;
	}
	
	public void setVille(LinkedList<Ville> villes) {
        this.villes = villes;
        for(Ville uneVille : villes) {
        	uneVille.setPlanete(this);
        }
	}
	
	public void addVille(Ville ville) {
		if(!this.villes.contains(ville)) {
			this.villes.add(ville);
			ville.setPlanete(this);
		}
	}
	
	public void deleteVille(Ville ville) {
		if(this.villes.contains(ville)) {
			ville.setPlanete(null);
			this.villes.remove(ville);
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diametre;
		result = prime * result + ((noyau == null) ? 0 : noyau.hashCode());
		result = prime * result + ((satellites == null) ? 0 : satellites.hashCode());
		result = prime * result + temperatureMoyenne;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planete other = (Planete) obj;
		if (diametre != other.diametre)
			return false;
		if (noyau == null) {
			if (other.noyau != null)
				return false;
		} else if (!noyau.equals(other.noyau))
			return false;
		if (satellites == null) {
			if (other.satellites != null)
				return false;
		} else if (!satellites.equals(other.satellites))
			return false;
		if (temperatureMoyenne != other.temperatureMoyenne)
			return false;
		return true;
	}


}
