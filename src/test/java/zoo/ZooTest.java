package zoo;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import java.util.ArrayList;

/**
 * Classe-test ZooTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 */
public class ZooTest
{
    private Zoo zooBeauval;
    private Ville beauval;    
    
    /**
     * Constructeur de la classe-test ZooTest
     */
    public ZooTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        zooBeauval = new Zoo();
        beauval = new Ville();
        zooBeauval.setVille(beauval);
    }
    
    @org.junit.Test
    public void testFixture()
    {
        assertEquals(beauval, zooBeauval.getVille());
    }
    
    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }


    @org.junit.Test
    public void testGetAttributs()
    {
        Zoo beauval = new Zoo();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(beauval.getNbVisiteurs());
        lst.add(beauval.getSuperficie());
        assertEquals(lst, beauval.getAttributs());
    }

    
}




