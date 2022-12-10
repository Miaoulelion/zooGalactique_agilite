package unittest;

import static org.junit.Assert.*;
import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import planetes.Noyau;
import planetes.Planete;
import planetes.Satellite;

public class PlaneteTest {

    private Planete planeteTerre;
    @SuppressWarnings("unused")
	private Noyau noyauDeLaTerre;
    private Satellite lune;

    @Before
    public void setUp() {
        this.planeteTerre = new Planete();
        this.noyauDeLaTerre = new Noyau(planeteTerre);
        this.lune = new Satellite(planeteTerre, "lune");
    }
    
    @Test
    public void diametreEtTemperatureTest(){
        assertEquals(100,this.planeteTerre.getDiametre());
        assertEquals(100,this.planeteTerre.getTemperatureMoyenne());
        this.planeteTerre.setDiametre(50);
        this.planeteTerre.setTemperatureMoyenne(25);
        assertEquals(50,this.planeteTerre.getDiametre());
        assertEquals(25,this.planeteTerre.getTemperatureMoyenne());
    }
    
    @Test
    public void diametreApproximatifNoyauTest(){
    	int diamApproximatif = 0; 
        int diametrePlanete = this.planeteTerre.getDiametreEtTemperatureMoyenne()[0];
        int temperaturePlanete = this.planeteTerre.getDiametreEtTemperatureMoyenne()[1];
        //Nous vérifions que le calcul des scientifiques est bien effectué.
        diamApproximatif = (temperaturePlanete / 2) + (diametrePlanete / 2);
        assertEquals(diamApproximatif, this.planeteTerre.getNoyau().getDiametreApproximatif());
    }
    
    @Test
    public void listeDesSatellitesEnOrbiteTest() {
    	//On retourne les satellites de la terre
    	LinkedList<Satellite> listeDesSatellites = this.planeteTerre.getSatellites();
    	listeDesSatellites.remove();
    	assertTrue(listeDesSatellites.size() == 0);
    	
    	//On vérifie que la suppression d'un satellite de la LinkedList ne supprime pas
    	//réellement le satellite, des satellites de la terre. Il ne faut pas donner de si
    	//grands pouvoirs entre toutes les mains !
    	LinkedList<Satellite> listeDesSatellitesNonModifiees = this.planeteTerre.getSatellites();
    	assertTrue(listeDesSatellitesNonModifiees.size() == 1);
    	Satellite uniqueSatelliteDeLaTerre = listeDesSatellitesNonModifiees.get(0);
    	assertEquals(this.lune, uniqueSatelliteDeLaTerre);
    	//On en profite pour voir si notre satellite a le bon nom...
    	assertEquals(uniqueSatelliteDeLaTerre.getNom(), "lune");
    	
    	//Pour supprimer un satellite, il faut passer par la méthode supprimerSatellite()
    	//On vérifie que tout est bien encapsulé comme on l'a souhaité.
    	this.planeteTerre.deleteSatellite(uniqueSatelliteDeLaTerre);
    	assertTrue(this.planeteTerre.getSatellites().size() == 0);
    }
    
    @After
    public void tearDown()
    {
        //Libérez ici les ressources engagées par setUp()
    }

}
