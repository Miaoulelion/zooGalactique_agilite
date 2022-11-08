package zoo;

import org.junit.Assert;

import Zoo_Project.Ville;
import Zoo_Project.Zoo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssociationVilleZooSteps {

	private Ville ville = new Ville();
	private Zoo zoo = new Zoo();
	
	@Given("une ville sans Zoo")
	public void une_ville_sans_Zoo() {
		Assert.assertTrue(this.ville != null);
		Assert.assertTrue(this.zoo != null);
	}

	@When("une ville s associe a un zoo")
	public void une_ville_s_associer_a_un_zoo() {
		ville.setUnZoo(zoo);
		Assert.assertTrue(this.ville != null);
	}

	@Then("le zoo appartient a la ville")
	public void le_zoo_appartient_a_la_ville() {
		Assert.assertEquals(this.ville.getUnZoo(), this.zoo);
		Assert.assertEquals(this.zoo.getVille(), this.ville);
	}
	
}
