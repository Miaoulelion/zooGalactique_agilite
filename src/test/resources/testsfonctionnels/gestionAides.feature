#Author: sylvain.vitry@dauphine.eu
#Author: hugo.jolion@dauphine.eu
Feature: US_001 Gestion des aides
  
  En tant que Ville
  Je souhaite pouvoir calculer le montant des aides a donner a mon zoo
  Afin d adapter mon budget municipal

  Scenario Outline: Calculer les aides
    Given le calcul des aides en fonction de <nbVisiteur> et de <superficie>
    When la ville le demande
    Then le <montant> est calcule

    Examples: 
      | nbVisiteur | superficie | montant |
      |      20000 |      10000 |  200000 |
      |         20 |       1000 |    2000 |
