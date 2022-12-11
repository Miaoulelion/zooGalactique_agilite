package testsfonctionnels;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import planetes.Planete;
import zoo.Ville;

public class AssociationPlaneteVilleSteps {
	private Ville zorg;
	private Planete mars;

	@Given("une Planete sans Ville")
	public void une_Planete_sans_Ville() {
	    // Write code here that turns the phrase above into concrete actions
	    mars = new Planete();
	    zorg = new Ville();
	}

	@When("une Planete veut ajouter une Ville")
	public void une_Planete_veut_ajouter_une_Ville() {
	    // Write code here that turns the phrase above into concrete actions
	    mars.addVille(zorg);
	}

	@Then("la Ville fait desormais partie de la Planete et inversement")
	public void la_Ville_fait_desormais_parti_de_la_Planete() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(mars.getVilles().contains(zorg));
	    Assert.assertEquals(zorg.getPlanete(), mars);
	}
	
	
	@Given("une Planete avec une Ville")
	public void une_Planete_avec_une_Ville() {
	    // Write code here that turns the phrase above into concrete actions
		mars = new Planete();
	    zorg = new Ville();
	    mars.addVille(zorg);
	}

	@When("une Planete veut supprimer cette Ville")
	public void une_Planete_veut_supprimer_cette_Ville() {
	    // Write code here that turns the phrase above into concrete actions
	    mars.deleteVille(zorg);
	}

	@Then("la Ville n appartient plus a la Planete et inversement")
	public void la_Ville_n_appartient_plus_a_la_Planete_et_inversement() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(!mars.getVilles().contains(zorg));
	    Assert.assertTrue(zorg.getPlanete() == null);
	}
}
