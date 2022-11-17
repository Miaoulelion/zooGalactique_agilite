package planetes;

/**
 * La classe des satellites qui gravitent autour des planètes
 * Un satellite ne tourne qu'autour d'une planète.
 * Lorsqu'il ne gravite plus autour de sa planète, pour divers accidents de la nature (divorce, astéroïde...)
 *  il ne l'oublie pas pour autant ! (Promis toujours pas d'astéroïde)
 * @author (Nicolas, Anis)
 */
public class Satellite {
	private Planete planete;
	private String nom;
	
	public Satellite(String nom) {
		this.nom = nom;
	}
	
	public Satellite(Planete planete, String nom) {
		this.setPlanete(planete);
		this.nom = nom;
	}

	/**
	 * Permet d'indiquer autour de quelle planète le Satellite tourne actuellement
	 * Ou bien la dernière planète autour de laquelle il a tourné !
	 * @param planete
	 */
	
	public void setPlanete(Planete planete) {
		if(planete == null) {
			throw new IllegalArgumentException("Une satelite ne peut avoir une planete == null");
		}
		this.planete = planete;
		//Il se peut que ce satellite appartienne déjà à une planète, il ne faudrait pas qu'il 
		//appartienne deux fois à cette planète.
		if(!planete.getSatellites().contains(this)) {
			planete.ajouterSatellite(this);
		}
	}
	
	/**
	 * 
	 * @return La planète autour de laquelle notre petit satellite gravite.
	 */
	
	public Planete getPlanete() {
		return this.planete;
	}

	/**
	 * Notre satellite a un joli nom qui lui a été donné à sa création.
	 * @return nom du satellite.
	 */
	
	public String getNom() {
		return nom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((planete == null) ? 0 : planete.hashCode());
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
		Satellite other = (Satellite) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (planete == null) {
			if (other.planete != null)
				return false;
		} else if (!planete.equals(other.planete))
			return false;
		return true;
	}
	
	
}
