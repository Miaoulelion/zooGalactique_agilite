package unittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import planetes.Planete;
import zoo.Ville;
import zoo.Zoo;


public class VilleTest {
	private Planete planeteTerre;
	private Planete planeteMars;
	private Ville paris;
	private Ville marseille;
	private Zoo zooBeauval;
	
	public VilleTest() {
		
	}

	@Before
    public void setUp(){
		planeteTerre = new Planete();
		planeteMars = new Planete();
		paris = new Ville();
		marseille = new Ville();
		zooBeauval = new Zoo();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown(){
        //Lib�rez ici les ressources engag�es par setUp()
    }
    
    @Test
    public void testSetPlanete() {
    	
    	paris.setPlanete(planeteTerre);
    	assertTrue(paris.getPlanete() == planeteTerre);
    	
    	assertFalse(paris.getPlanete() == planeteMars);
    	
    	paris.setPlanete(planeteMars);
    	assertTrue(paris.getPlanete() == planeteMars);
    	assertFalse(paris.getPlanete() == planeteTerre);
    	
    	assertFalse(marseille.getPlanete() == planeteTerre);
    	
    }
    
    @Test
    public void testGetMontantAidesZoo() {
    	zooBeauval.setNombreVisiteurs(20000);
    	zooBeauval.setSuperficie(10000);
    	paris.setUnZoo(zooBeauval);
    	
    	paris.getMontantAidesZoo();
    	
    	assertEquals(paris.getMontantAidesZooTotal(), 200000);
    	
    }
    
}
