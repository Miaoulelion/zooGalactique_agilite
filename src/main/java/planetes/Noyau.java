package planetes;


/**
 * Les plan�tes suffisamment chaudes poss�dent un noyau.
 * Il s'agit d'un br�lant au centre de ces plan�tes.
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
     * Un noyau est li� � une plan�te, mais seulement � une seule plan�te.
     * Ce setter n'est utilis� que lors de la construction de la plan�te.
     * Seuls les Dieux ayant le pouvoir de manipuler les m�thodes priv�es
     * peuvent d�placer un noyau d'une plan�te � une autre !
     * @param planete
     */
    
    private void setPlanete(Planete planete){
        if(planete==null){
            throw new IllegalArgumentException("Il n'y a pas de plan�te, plan�te == null");
        }
        this.planete=planete;
    }
    
    public int getTruc() {
    	return this.planete.getDiametre();
    }

    /**
     * Le noyau n'est pas visible au commun des mortels. 
     * Son diam�tre est approxim� en fonction du diam�tre de la plan�te
     * et de sa tempr�ature. Attention, ces r�sultats peuvent �tre incoh�rents,
     * l'�tat actuel de la science n'est pas forc�ment tr�s avanc�...
     * @return le diam�tre approxim� du noyau.
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
