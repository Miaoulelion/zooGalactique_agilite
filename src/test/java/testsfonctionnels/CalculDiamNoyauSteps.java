package testsfonctionnels;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import planetes.Noyau;
import planetes.Planete;

public class CalculDiamNoyauSteps {
	private Planete planete;
	private Noyau noyau;
		

	@Given("Une planete avec un noyau et une temperature et un diametre standard")
	public void une_planete_avec_un_noyau_et_une_temperature_et_un_diametre_standard() {
	    // Write code here that turns the phrase above into concrete actions
		this.planete = new Planete();
		this.noyau = new Noyau(this.planete);
	}

	@When("modification de la temperature {int} de la planete")
	public void modification_de_la_temperature_de_la_planete(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		this.planete.setTemperatureMoyenne(int1);
	}

	@Then("Le noyau de la planete a un diametre approxime de diam= {int} km")
	public void le_noyau_de_la_planete_a_un_diametre_approxime_de_diam_km(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	 	Assert.assertEquals(int1.intValue(), this.noyau.getDiametreApproximatif());
	}

	@When("modification du diametre vers {int} km de la planete")
	public void modification_du_diametre_vers_km_de_la_planete(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		this.planete.setDiametre(int1);
	}

}
