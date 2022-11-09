package zoo;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Zoo_Project.Animal;
import Zoo_Project.Ville;
import Zoo_Project.Zoo;

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
    @BeforeEach
    public void setUp(){
        zooBeauval = new Zoo();
        beauval = new Ville();
        zooBeauval.setVille(beauval);
        tigre = new Animal();
    	lion = new Animal();
    	singe = new Animal();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown(){
        //Lib�rez ici les ressources engag�es par setUp()
    }
    
    @Test
    public void testFixture(){
        assertEquals(beauval, zooBeauval.getVille());
    }

    @Test
    public void getNbVisiteursEtSuperficie(){
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
}





