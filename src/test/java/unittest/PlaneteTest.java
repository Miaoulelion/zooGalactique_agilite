package unittest;

import static org.junit.Assert.*;
import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import planetes.Noyau;
import planetes.Planete;
import planetes.Satellite;
import zoo.Ville;

public class PlaneteTest {

    private Planete planeteTerre;
    private Planete planeteMars;
	private Noyau noyauDeLaTerre;
    private Satellite lune;
    private Ville ville;

    @Before
    public void setUp() {
        this.planeteTerre = new Planete();
        this.planeteMars = new Planete(5000, 200);
        this.noyauDeLaTerre = new Noyau(planeteTerre);
        this.lune = new Satellite(planeteTerre, "lune");
        this.ville = new Ville();
    }
    
    @Test
    public void testDiametreEtTemperature(){
        assertEquals(100,this.planeteTerre.getDiametre());
        assertEquals(100,this.planeteTerre.getTemperatureMoyenne());
        this.planeteTerre.setDiametre(50);
        this.planeteTerre.setTemperatureMoyenne(25);
        assertEquals(50,this.planeteTerre.getDiametre());
        assertEquals(25,this.planeteTerre.getTemperatureMoyenne());
        assertEquals(5000, this.planeteMars.getDiametre());
        assertEquals(200, this.planeteMars.getTemperatureMoyenne());
    }
    
    @Test
    public void testDiametreApproximatifNoyau(){
    	int diamApproximatif = 0; 
        int diametrePlanete = this.planeteTerre.getDiametreEtTemperatureMoyenne()[0];
        int temperaturePlanete = this.planeteTerre.getDiametreEtTemperatureMoyenne()[1];
        //Nous vérifions que le calcul des scientifiques est bien effectué.
        diamApproximatif = (temperaturePlanete / 2) + (diametrePlanete / 2);
        assertEquals(diamApproximatif, this.planeteTerre.getNoyau().getDiametreApproximatif());
    }
    
    @Test
    public void testListeDesSatellitesEnOrbite() {
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
    
    @Test
    public void testAddVille() {
    	assertTrue(this.planeteTerre.getVilles().size() == 0);
    	
    	this.planeteTerre.addVille(this.ville);
    	
    	assertTrue(this.planeteTerre.getVilles().contains(this.ville));
    }
    
    @Test
    public void testDeleteVille() {
    	this.planeteTerre.addVille(this.ville);
    
    	assertTrue(this.planeteTerre.getVilles().size() == 1);
    	
    	this.planeteTerre.deleteVille(this.ville);
    	
    	assertTrue(!this.planeteTerre.getVilles().contains(this.ville));
    	assertTrue(ville.getPlanete() == null);
    }
    
    @Test
    public void testSetVille() {
    	Ville zorg = new Ville();
    	LinkedList<Ville> lesVilles = new LinkedList<Ville>();
    	lesVilles.add(zorg);
    	lesVilles.add(ville);
    	
    	this.planeteTerre.setVille(lesVilles);
    	
    	assertTrue(this.planeteTerre.getVilles().contains(zorg));
    	assertTrue(this.planeteTerre.getVilles().contains(ville));
    	assertTrue(this.planeteTerre.getVilles().size() == 2);
    }
    
	@SuppressWarnings("unlikely-arg-type")
	@Test
    public void testEquals() {
    	Planete jupiter = new Planete(5000, 200);
    	
    	assertTrue(jupiter.equals(this.planeteMars));
    	assertFalse(jupiter.equals(this.planeteTerre));
    	
    	assertFalse(jupiter.equals(null));
    	assertTrue(jupiter.equals(jupiter));
    	assertFalse(jupiter.equals(this.noyauDeLaTerre));
    	
    }
    
    @Test
    public void testHashCode() {
    	Planete planeteMarsBis = this.planeteMars;
    	
    	assertEquals(planeteMarsBis.hashCode(), this.planeteMars.hashCode());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSetTemperature() {
    	this.planeteTerre.setTemperatureMoyenne(-1);
    }    
    
    @Test (expected = IllegalArgumentException.class)
    public void testSetDiametre() {
    	this.planeteTerre.setDiametre(-1);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSetNoyau() {
    	this.planeteTerre.setNoyau(null);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testAddSatellite() {
    	this.planeteTerre.addSatellite(null);
    }
    
    @After
    public void tearDown()
    {
        //Libérez ici les ressources engagées par setUp()
    }

}
