package testsfonctionnels;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import planetes.Noyau;
import planetes.Planete;

public class CalculDiamNoyauStep {
	Planete planeteRose;
	Noyau noyauRose;
	Planete planeteVerte;
	Noyau noyauVert;
	Planete planeteJaune;
	Noyau noyauJaune;
	Planete planeteGrise;
	Noyau noyauGris;

	@Given("Une planeteRose avec un noyauRose et une temperature et un diametre standard")
	public void une_planeteRose_avec_un_noyauRose_et_une_temperature_et_un_diametre_standard() {
	    // Write code here that turns the phrase above into concrete actions
		this.planeteRose = new Planete();
		this.noyauRose = new Noyau(this.planeteRose);
	}

	@When("modification de la temperature {int} de la planete planeteRose")
	public void modification_de_la_temperature_de_la_planete_planeteRose(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		this.planeteRose.setTemperatureMoyenne(int1.intValue());
	}

	@Then("Le noyau de planeteRose a un diametre approxime de diam= {int} km")
	public void le_noyau_de_planeteRose_a_un_diametre_approxime_de_diam_km(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   assertEquals(int1.intValue(), this.noyauRose.getDiametreApproximatif());
	}

	@Given("Une planeteVerte avec un noyauVert et une temperature et un diametre standard")
	public void une_planeteVerte_avec_un_noyauVert_et_une_temperature_et_un_diametre_standard() {
	    // Write code here that turns the phrase above into concrete actions
	    this.planeteVerte = new Planete();
	    this.noyauVert = new Noyau(this.planeteVerte);
	}

	@When("modification de la temperature {int} de la planete planeteVerte")
	public void modification_de_la_temperature_de_la_planete_planeteVerte(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    this.planeteVerte.setTemperatureMoyenne(int1.intValue());
	}

	@Then("Le noyau de planeteVerte a un diametre approxime de diam= {int} km")
	public void le_noyau_de_planeteVerte_a_un_diametre_approxime_de_diam_km(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(int1.intValue(), this.noyauVert.getDiametreApproximatif());
	}

	@Given("Une planeteJaune avec un noyauJaune et une temperature et un diametre standard")
	public void une_planeteJaune_avec_un_noyauJaune_et_une_temperature_et_un_diametre_standard() {
	    // Write code here that turns the phrase above into concrete actions
		this.planeteJaune = new Planete();
		this.noyauJaune = new Noyau(this.planeteJaune);
	}

	@When("modification du diametre vers {int} km de la planete planeteJaune")
	public void modification_du_diametre_vers_km_de_la_planete_planeteJaune(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    this.planeteJaune.setTemperatureMoyenne(int1.intValue());
	}

	@Then("Le noyau de la planete planeteJaune a un diametre approxime de diam= {int} km")
	public void le_noyau_de_la_planete_planeteJaune_a_un_diametre_approxime_de_diam_km(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(int1.intValue(), this.noyauJaune.getDiametreApproximatif());
	}

	@Given("Une planeteGrise avec un noyauGris et une temperature et un diametre standard")
	public void une_planeteGrise_avec_un_noyauGris_et_une_temperature_et_un_diametre_standard() {
	    // Write code here that turns the phrase above into concrete actions
	    this.planeteGrise = new Planete();
	    this.noyauGris = new Noyau(this.planeteGrise);
	}

	@When("modification du diametre vers {int} km de la planete planeteGrise")
	public void modification_du_diametre_vers_km_de_la_planete_planeteGrise(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    this.planeteGrise.setDiametre(int1.intValue());
	}

	@Then("Le noyau de la planete planeteGrise a un diametre approxime de diam= {int} km")
	public void le_noyau_de_la_planete_planeteGrise_a_un_diametre_approxime_de_diam_km(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(int1.intValue(), this.noyauGris.getDiametreApproximatif());
	}





}
