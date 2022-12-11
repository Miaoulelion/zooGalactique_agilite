package testsfonctionnels;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import planetes.Planete;
import planetes.Satellite;

public class GestionSatellitesSteps {
	private Planete planete;
	private Satellite satellite;
	
	@Given("Une <planete> avec une temperature et un diametre standard")
	public void une_planete_avec_une_temperature_et_un_diametre_standard() {
	    // Write code here that turns the phrase above into concrete actions
	    this.planete = new Planete();
	}

	@When("de l-ajout d-un {string}")
	public void de_l_ajout_d_un(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    this.satellite = new Satellite(string);
	    this.planete.addSatellite(satellite);
	    
	}

	@Then("Le satellite true dans la liste de satellite")
	public void le_satellite_true_dans_la_liste_de_satellite() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(this.planete.getSatellites().contains(this.satellite));
	}

	@When("de la suppression d-un {string} de l-orbite de la planete <planete>")
	public void de_la_suppression_d_un_de_l_orbite_de_la_planete_planete(String string) {
	    // Write code here that turns the phrase above into concrete actions
		this.satellite = new Satellite(string);
	    this.planete.addSatellite(satellite);
	    this.planete.deleteSatellite(satellite);
	}

	@Then("Le satellite false dans la liste de satellite")
	public void le_satellite_false_dans_la_liste_de_satellite() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertFalse(this.planete.getSatellites().contains(satellite));
	}
}
