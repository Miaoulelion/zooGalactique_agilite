package zoo;

import org.junit.Assert;

import Zoo_Project.Ville;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GestionAidesSteps {
	
	private Ville ville = new Ville();
	
	@Given("le calcul des aides en fonction de {int} et de {int}")
	public void le_calcul_des_aides_en_fonction_de_et_de(Integer int1, Integer int2) {
		ville.calculAides(int1, int2);
	    Assert.assertTrue(this.ville != null);
	}

	@When("la ville le demande")
	public void la_ville_le_demande() {
	    Assert.assertTrue(this.ville != null);
	}

	@Then("le {int} est calcule")
	public void le_est_calcule(Integer int1) {		
	    Assert.assertTrue(this.ville.getMontantAidesZooTotal() == int1);
	}
	
}
