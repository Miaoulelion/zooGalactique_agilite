package testsfonctionnels;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import planetes.PlaneteComposite;
import planetes.Satellite;

public class GestionSatellitesStep {
	private PlaneteComposite terre;
	private Satellite lune;
	private PlaneteComposite pluton;
	private Satellite charon;
	private PlaneteComposite neptune;
	private Satellite triton;
	private Satellite nereide;
	
	@Given("Une terre avec une temperature et un diametre standard")
	public void une_terre_avec_une_temperature_et_un_diametre_standard() {
	    // Write code here that turns the phrase above into concrete actions
		this.terre = new PlaneteComposite();
	}

	@When("de l-ajout d-un lune")
	public void de_l_ajout_d_un_lune() {
	    // Write code here that turns the phrase above into concrete actions
		this.lune = new Satellite("lune");
		this.terre.ajouterSatellite(this.lune);
	}

	@Then("Le satellite luneEstEnOrbite dans la liste de satellite")
	public void le_satellite_luneEstEnOrbite_dans_la_liste_de_satellite() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(this.terre.getSatellites().contains(this.lune));
	}

	@Given("Une pluton avec une temperature et un diametre standard")
	public void une_pluton_avec_une_temperature_et_un_diametre_standard() {
	    // Write code here that turns the phrase above into concrete actions
		this.pluton = new PlaneteComposite();
	}

	@When("de l-ajout d-un charon")
	public void de_l_ajout_d_un_charon() {
	    // Write code here that turns the phrase above into concrete actions
		this.charon = new Satellite("charon");
		this.pluton.ajouterSatellite(this.charon);
	}

	@Then("Le satellite charonEstEnOrbite dans la liste de satellite")
	public void le_satellite_charonEstEnOrbite_dans_la_liste_de_satellite() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(this.pluton.getSatellites().contains(this.charon));
	}

	@Given("Une neptune avec une temperature et un diametre standard")
	public void une_neptune_avec_une_temperature_et_un_diametre_standard() {
	    // Write code here that turns the phrase above into concrete actions
		this.neptune = new PlaneteComposite();
	}

	@When("de l-ajout d-un triton")
	public void de_l_ajout_d_un_triton() {
	    // Write code here that turns the phrase above into concrete actions
		this.triton = new Satellite("triton");
		this.neptune.ajouterSatellite(this.triton);
	}

	@Then("Le satellite tritonEstEnOrbite dans la liste de satellite")
	public void le_satellite_tritonEstEnOrbite_dans_la_liste_de_satellite() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(this.neptune.getSatellites().contains(this.triton));
	}

	@When("de l-ajout d-un nereide")
	public void de_l_ajout_d_un_nereide() {
	    // Write code here that turns the phrase above into concrete actions
		this.nereide = new Satellite("nereide");
		this.neptune.ajouterSatellite(this.nereide);
	}

	@Then("Le satellite nereideEstEnOrbite dans la liste de satellite")
	public void le_satellite_nereideEstEnOrbite_dans_la_liste_de_satellite() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(this.neptune.getSatellites().contains(this.nereide));
	}
	
	@When("de la suppression d-un lune de l-orbite de la planete terre")
	public void de_la_suppression_d_un_lune_de_l_orbite_de_la_planete_terre() {
	    // Write code here that turns the phrase above into concrete actions
		this.terre.supprimerSatellite(this.lune);
	}

	@Then("Le satellite luneNEstPlusEnOrbite dans la liste de satellite")
	public void le_satellite_luneNEstPlusEnOrbite_dans_la_liste_de_satellite() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(this.terre.getSatellites().contains(this.lune));
	}

	@When("de la suppression d-un triton de l-orbite de la planete neptune")
	public void de_la_suppression_d_un_triton_de_l_orbite_de_la_planete_neptune() {
	    // Write code here that turns the phrase above into concrete actions
		this.neptune.supprimerSatellite(this.triton);
	}

	@Then("Le satellite tritonNEstPlusEnOrbite dans la liste de satellite")
	public void le_satellite_tritonNEstPlusEnOrbite_dans_la_liste_de_satellite() {
	    // Write code here that turns the phrase above into concrete actions
	    assertFalse(this.neptune.getSatellites().contains(this.triton));
	}

	@When("de la suppression d-un nereide de l-orbite de la planete neptune")
	public void de_la_suppression_d_un_nereide_de_l_orbite_de_la_planete_neptune() {
	    // Write code here that turns the phrase above into concrete actions
	    this.neptune.supprimerSatellite(this.nereide);
	}

	@Then("Le satellite nereideNEstPlusEnOrbite dans la liste de satellite")
	public void le_satellite_nereideNEstPlusEnOrbite_dans_la_liste_de_satellite() {
	    // Write code here that turns the phrase above into concrete actions
	    assertFalse(this.neptune.getSatellites().contains(this.nereide));
	}




}
