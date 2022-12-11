package testsfonctionnels;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import zoo.Ville;
import zoo.Zoo;

public class AssociationVilleZooSteps {

	private Ville ville;
	private Zoo zoo;
	
	@Given("une ville sans Zoo")
	public void une_ville_sans_Zoo() {
		ville = new Ville();
		zoo = new Zoo();
	}

	@When("une ville s associe a un zoo")
	public void une_ville_s_associer_a_un_zoo() {
		ville.setUnZoo(zoo);
	}

	@Then("le zoo appartient a la ville")
	public void le_zoo_appartient_a_la_ville() {
		Assert.assertEquals(this.ville.getUnZoo(), this.zoo);
		Assert.assertEquals(this.zoo.getVille(), this.ville);
	}
}