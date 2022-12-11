#Author: sylvain.vitry@dauphine.eu
#Author: hugo.jolion@dauphine.eu

Feature: US_000 Associer un Zoo a une Ville

  En tant que Ville
	Je souhaite associer un Zoo a ma ville
	Afin de proposer une nouvelle activite a mes habitants

  Scenario: Association d un Zoo a une Ville
    Given une ville sans Zoo
  	When  une ville s associe a un zoo 
  	Then  le zoo appartient a la ville
