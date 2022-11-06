#Author: sylvain.vitry@dauphine.eu
#Author: hugo.jolion@dauphine.eu

Feature: Associer une Ville a un Zoo

  En tant que Ville
	Je souhaite associer un Zoo a ma ville
	Afin de proposer une nouvelle activite a mes habitants

  Scenario: Association d un Zoo a une Ville
    Given une ville sans Zoo
  	When  une ville s associer a un zoo 
  	Then  le zoo appartient a la ville
