package testsfonctionnels;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import zoo.Ville;

public class GestionAidesSteps {
	
	private Ville ville;
	private int nbVisiteurs;
	private int superficie;
	
	@Given("le calcul des aides en fonction de {int} et de {int}")
	public void le_calcul_des_aides_en_fonction_de_et_de(Integer int1, Integer int2) {
		ville = new Ville();
		nbVisiteurs = int1;
		superficie = int2;
	    
	}

	@When("la ville le demande")
	public void la_ville_le_demande() {
	    ville.calculAides(nbVisiteurs, superficie);
	}

	@Then("le {int} est calcule")
	public void le_est_calcule(Integer int1) {		
	    Assert.assertTrue(this.ville.getMontantAidesZooTotal() == int1);
	}
	
}
