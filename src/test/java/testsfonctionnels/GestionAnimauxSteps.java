package testsfonctionnels;

import org.junit.Assert;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;
import zoo.Animal;
import zoo.AnimalFactory;
import zoo.Zoo;  

public class GestionAnimauxSteps {
	AnimalFactory animalFactory;
	private Animal tigre;
	private Animal lion ;
	private Zoo zoo ;
	
	@Given("un zoo souhaitant ajouter un animal parmi ses animaux")
	public void un_zoo_souhaitant_ajouter_un_animal_parmi_ses_animaux() {
		animalFactory = new AnimalFactory();
		tigre = animalFactory.build(AnimalFactory.AnimalChoix.TIGRE);
		zoo = new Zoo();
	}

	@When("un zoo accueille un nouvel animal")
	public void un_zoo_accueille_un_nouvel_animal() {
		zoo.ajouterAnimal(tigre);
	}

	@Then("un animal est dans la liste d animaux du zoo")
	public void un_animal_est_dans_la_liste_d_animaux_du_zoo() {
		Assert.assertTrue(this.zoo.getListeAnimauxPresents().contains(tigre) == true);
		Assert.assertTrue(this.tigre.getZoo() == this.zoo);
	}
	
	@Given("un zoo souhaitant connaitre le nombre d animaux presents en son sein")
	public void un_zoo_souhaitant_connaitre_le_nombre_d_animaux_presents_en_son_sein() {
		animalFactory = new AnimalFactory();
		tigre = animalFactory.build(AnimalFactory.AnimalChoix.TIGRE);
		lion = animalFactory.build(AnimalFactory.AnimalChoix.LION);
		zoo = new Zoo();
	}

	@When("quand il le souhaite")
	public void quand_il_le_souhaite() {
		zoo.ajouterAnimal(tigre);
		zoo.ajouterAnimal(lion);
	}

	@Then("le zoo connait desormais son nombre d animaux")
	public void le_zoo_connait_desormais_son_nombre_d_animaux() {
		Assert.assertTrue(this.zoo.getNombreAnimaux() == 2);
	}

	
	// ------
	// Scenarios non implémentés
	// ------
	
	@Given("un zoo souhaitant modifier un animal parmi ses animaux")
	public void un_zoo_souhaitant_modifier_un_animal_parmi_ses_animaux() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("un zoo le souhaite")
	public void un_zoo_le_souhaite() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("un animal est modifie")
	public void un_animal_est_modifie() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("un zoo souhaitant supprimer un animal de ses animaux")
	public void un_zoo_souhaitant_supprimer_un_animal_de_ses_animaux() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("un zoo transfere un animal")
	public void un_zoo_transfere_un_animal() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("un animal est supprime de la liste d animaux du zoo")
	public void un_animal_est_supprime_de_la_liste_d_animaux_du_zoo() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("lorsque un animal decede")
	public void lorsque_un_animal_decede() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("un animal est supprime de la liste des animaux du zoo")
	public void un_animal_est_supprime_de_la_liste_des_animaux_du_zoo() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}

