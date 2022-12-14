package unittest;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import zoo.Animal;
import zoo.AnimalFactory;
import zoo.Ville;
import zoo.Zoo;

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
    private Animal tigre;
    private Animal lion;
    private Animal singe;
    
    /**
     * Constructeur de la classe-test ZooTest
     */
    public ZooTest(){
    	
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp(){
        zooBeauval = new Zoo();
        beauval = new Ville();
        zooBeauval.setVille(beauval);
        AnimalFactory animalFactory = new AnimalFactory();
        tigre = animalFactory.build(AnimalFactory.AnimalChoix.TIGRE);
    	lion = animalFactory.build(AnimalFactory.AnimalChoix.LION);
    	singe = animalFactory.build(AnimalFactory.AnimalChoix.SINGE);
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
    public void testFixture(){
        assertEquals(beauval, zooBeauval.getVille());
    }

    @Test
    public void testGetNbVisiteursEtSuperficie(){
        ArrayList<Integer> nombreVisiteursEtSuperficieZoo = new ArrayList<Integer>();
        nombreVisiteursEtSuperficieZoo.add(zooBeauval.getNombreVisiteurs());
        nombreVisiteursEtSuperficieZoo.add(zooBeauval.getSuperficie());
        assertEquals(nombreVisiteursEtSuperficieZoo, zooBeauval.getNombreVisiteursEtSuperficie());
    }
    
    @Test
    public void testAjouterAnimal(){
    	zooBeauval.ajouterAnimal(tigre);
    	assertEquals(tigre, zooBeauval.getListeAnimauxPresents().get(0));
    }
    
    @Test
    public void testAjouterAnimaux(){
       	tigre.setNom("Tigrou");
    	lion.setNom("Simba");
    	singe.setNom("Rafiki");
    	zooBeauval.ajouterAnimal(tigre);
    	zooBeauval.ajouterAnimal(lion);
    	zooBeauval.ajouterAnimal(singe);
    	assertEquals(true, zooBeauval.getListeAnimauxPresents().contains(tigre));
    	assertEquals(true, zooBeauval.getListeAnimauxPresents().contains(lion));
    	assertEquals(true, zooBeauval.getListeAnimauxPresents().contains(singe));
    	
    }   
    
    @Test
    public void testSetAnimaux(){
    	ArrayList<Animal> animauxDansZoo = new ArrayList<Animal>();
    	tigre.setNom("Tigrou");
    	lion.setNom("Simba");
    	singe.setNom("Rafiki");
    	animauxDansZoo.add(tigre);
    	animauxDansZoo.add(lion);
    	animauxDansZoo.add(singe);
    	zooBeauval.setListeAnimauxPresents(animauxDansZoo);
    	assertEquals(animauxDansZoo, zooBeauval.getListeAnimauxPresents());
    }  
    
    @Test
    public void testGetNombreAnimaux() {
    	ArrayList<Animal> animauxDansZoo = new ArrayList<Animal>();
    	tigre.setNom("Tigrou");
    	lion.setNom("Simba");
    	singe.setNom("Rafiki");
    	animauxDansZoo.add(tigre);
    	animauxDansZoo.add(lion);
    	animauxDansZoo.add(singe);
    	zooBeauval.setListeAnimauxPresents(animauxDansZoo);
    	assertEquals(animauxDansZoo.size(), zooBeauval.getNombreAnimaux());
    }
    
    @Test
    public void testSetNombreVisiteurs() {
    	zooBeauval.setNombreVisiteurs(5000);
    	assertEquals(zooBeauval.getNombreVisiteurs(), 5000);
    }
    
    @Test
    public void testSetSuperficie() {
    	zooBeauval.setSuperficie(5000);
    	assertEquals(zooBeauval.getSuperficie(), 5000);
    }
}





