package planetes;

import java.util.LinkedList;

import zoo.Ville;

/**
 * La classe plan�te d�crit une plan�te et ses comportements
 * Une plan�te peut avoir un noyau et un ou plusieurs satellites
 * (Promis pas d'ast�ro�de)
 * @author (Nicolas, Anis)
 */
public class Planete {
    // Variables d'instance repr�sentant les principales caract�ristiques 
    // d'une plan�te
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
     * Par d�faut les plan�tes sont tr�s petites et il y fait
     * plut�t chaud...
     */
    
    public Planete(){
    	this.setDiametre(100);
    	this.setTemperatureMoyenne(100);
        this.satellites = new LinkedList<Satellite>();
        this.villes = new LinkedList<Ville>();
    }
    
    /**
     * Une plan�te suffisamment jeune et dynamique peut poss�der un noyau.
     * Cette m�thode permet d'ajouter un noyau � une plan�te.
     * @param noyau
     */
    
    public void setNoyau(Noyau noyau){
        if(noyau==null){
            throw new IllegalArgumentException("Il n'y a pas de noyau, noyau == null");
        }
        this.noyau=noyau;
    }

    /**
     * Donne � l'utilisateur le diam�tre de l'instance de plan�te
     * @return     le diametre de la plan�te
     */
    public int getDiametre(){
        return this.diametre;
    }
    
    /**
     * Donne � l'utilisateur la temp�rature moyenne de l'instance
     * de plan�te
     * @return  la temp�rature moyenne de la plan�te
     */
    public int getTemperatureMoyenne(){
        return this.temperatureMoyenne;
    }
    
    /**
     * Parfois la temp�rature peut monter...
     * M�thode permettant de modifier la temp�rature de la plan�te
     */
    public void setTemperatureMoyenne(int temperature){
    	if(temperature < 0) {
    		throw new IllegalArgumentException("La temperature est en kelvin et ne peut �tre inf�rieure � 0");
    	}
        this.temperatureMoyenne=temperature;
    }
    
    /**
     * Certaines plan�tes font un r�gime...
     * M�thode permettant de modifier le diam�tre de la plan�te
     */
    public void setDiametre(int diam){
    	if(diam < 0) {
    		throw new IllegalArgumentException("Un diametre ne peut �tre inf�rieur � 0");
    	}
        this.diametre=diam;
    }
    
    /**
     * Getter du noyau de la plan�te.
     */
    public Noyau getNoyau(){
        return this.noyau;
    }
    
    /**
     * Les scientifique avaient besoin d'une m�thode de calcul simple et efficace pour conna�tre
     * le diam�tre et la temp�rature moyenne d'une plan�te d'un seul coup !
     * @return Un tableau de deux �l�ments, le premier �tant le diam�tre de la plan�te et le second la temp�rature moyenne.
     */
    
    public int[] getDiametreEtTemperatureMoyenne(){
        return new int[]{this.diametre,this.temperatureMoyenne};
    }

    /**
     * Ajoute un satellite autour d'une plan�te.
     * @param une Planete
     */
    
    public void addSatellite(Satellite satellite) {
    	if(satellite == null) {
    		throw new IllegalArgumentException("Ajout de plan�te == null non valide");
    	}
    	this.satellites.add(satellite);
    	satellite.setPlanete(this);
    }
    
    /**
     * On a parfois besoin de savoir qui accompagne une plan�te !
     * @return une copie de la liste de satellites (avec les vraies satellites dedans !)
     */
    
	public LinkedList<Satellite> getSatellites() {
		return new LinkedList<Satellite>(this.satellites);
	}
	
	/**
	 * Une plan�te peut d�cider de continuer son chemin seule.
	 * Un satellite peut se perdre dans le reste de l'univers...
	 * Attention car un satellite quant � lui n'oublie jamais sa plan�te, jusqu'� ce qu'elle soit remplac�e.
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
