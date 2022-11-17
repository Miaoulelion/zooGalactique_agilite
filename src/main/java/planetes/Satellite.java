package planetes;

/**
 * La classe des satellites qui gravitent autour des plan�tes
 * Un satellite ne tourne qu'autour d'une plan�te.
 * Lorsqu'il ne gravite plus autour de sa plan�te, pour divers accidents de la nature (divorce, ast�ro�de...)
 *  il ne l'oublie pas pour autant ! (Promis toujours pas d'ast�ro�de)
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
	 * Permet d'indiquer autour de quelle plan�te le Satellite tourne actuellement
	 * Ou bien la derni�re plan�te autour de laquelle il a tourn� !
	 * @param planete
	 */
	
	public void setPlanete(Planete planete) {
		if(planete == null) {
			throw new IllegalArgumentException("Une satelite ne peut avoir une planete == null");
		}
		this.planete = planete;
		//Il se peut que ce satellite appartienne d�j� � une plan�te, il ne faudrait pas qu'il 
		//appartienne deux fois � cette plan�te.
		if(!planete.getSatellites().contains(this)) {
			planete.ajouterSatellite(this);
		}
	}
	
	/**
	 * 
	 * @return La plan�te autour de laquelle notre petit satellite gravite.
	 */
	
	public Planete getPlanete() {
		return this.planete;
	}

	/**
	 * Notre satellite a un joli nom qui lui a �t� donn� � sa cr�ation.
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
