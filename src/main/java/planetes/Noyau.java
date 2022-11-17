package planetes;


/**
 * Les planètes suffisamment chaudes possèdent un noyau.
 * Il s'agit d'un brûlant au centre de ces planètes.
 * @author (Nicolas, Anis)
 */
public class Noyau
{
    private Planete planete;
    
    /**
     * Constructeur d'objets de classe Noyau
     */
    
    public Noyau(Planete planete)
    {
    	this.setPlanete(planete);
        planete.setNoyau(this);
    }
    
    /**
     * Un noyau est lié à une planète, mais seulement à une seule planète.
     * Ce setter n'est utilisé que lors de la construction de la planète.
     * Seuls les Dieux ayant le pouvoir de manipuler les méthodes privées
     * peuvent déplacer un noyau d'une planète à une autre !
     * @param planete
     */
    
    private void setPlanete(Planete planete){
        if(planete==null){
            throw new IllegalArgumentException("Il n'y a pas de planète, planète == null");
        }
        this.planete=planete;
    }
    
    public int getTruc() {
    	return this.planete.getDiametre();
    }

    /**
     * Le noyau n'est pas visible au commun des mortels. 
     * Son diamètre est approximé en fonction du diamètre de la planète
     * et de sa tempréature. Attention, ces résultats peuvent être incohérents,
     * l'état actuel de la science n'est pas forcément très avancé...
     * @return le diamètre approximé du noyau.
     */
    
    public int getDiametreApproximatif()
    {
    	int diametrePlanete = this.planete.getDiametreEtTemperatureMoyenne()[0];
    	int temperaturePlanete = this.planete.getDiametreEtTemperatureMoyenne()[1];
        return (temperaturePlanete / 2) + (diametrePlanete / 2);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Noyau other = (Noyau) obj;
		if (planete == null) {
			if (other.planete != null)
				return false;
		} else if (!planete.equals(other.planete))
			return false;
		return true;
	}
}
