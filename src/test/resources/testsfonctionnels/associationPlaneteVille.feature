#Author: sylvain.vitry@dauphine.eu
#Author: hugo.jolion@dauphine.eu
#Author: nicolas.berthier0@dauphine.eu
#Author: anis.hammouche@dauphine.eu

Feature: US_005 Associer une Ville a une Planete

  En tant que Planete
	Je souhaite ajouter une Ville a ma Planete
	Afin de peupler ma Planete

  Scenario: Association d une Ville a une Planete
    Given une Planete sans Ville
  	When  une Planete veut ajouter une Ville
  	Then  la Ville fait desormais partie de la Planete et inversement

