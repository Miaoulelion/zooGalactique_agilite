package zoo;

public abstract class Animal {
	
	private Zoo zoo;
	private String nom;
	private float poids;
	private int taille;
	
	public Animal(){
		this.zoo=null;
		this.nom="";
		this.poids=0.0f;
		this.taille=0;
	}
	
	public Animal(Zoo zoo, String nom, float poids, int taille){
		this.zoo = zoo;
		this.nom = nom;
		this.poids = poids;
		this.taille = taille;
	}

	public Zoo getZoo(){
		return zoo;
	}
	
	public void setZoo(Zoo zoo){
		if(this.zoo == null){
            this.zoo = zoo;
            zoo.ajouterAnimal(this);
        }
		else {
			this.zoo.getListeAnimauxPresents().remove(this);
			this.zoo=null;
			this.setZoo(zoo);
		}	
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public float getPoids(){
		return poids;
	}
	
	public void setPoids(float poids){
		this.poids = poids;
	}
	
	public int getTaille(){
		return taille;
	}
	
	public void setTaille(int taille){
		this.taille = taille;
	}
	
}
