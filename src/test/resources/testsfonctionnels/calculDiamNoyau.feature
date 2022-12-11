#Author: nicolas.berthier0@dauphine.eu
#Author: anis.hammouche@dauphine.eu
Feature: US_003 Approximation du diametre d-un noyau
  
  En tant que scientifique, je veux pouvoir approximer le diametre du noyau d-une planete lorsqu-elle en possede un,
  afin de faire avancer la science

  Scenario Outline: Approximer le diametre du noyau de planete avec des temperatures differentes
    Given Une planete avec un noyau et une temperature et un diametre standard
    When modification de la temperature <temperature> de la planete
    Then Le noyau de la planete a un diametre approxime de diam= <DiametreApproxime> km

    Examples: 
      | temperature | DiametreApproxime |
      |          50 |                75 |
      |         500 |               300 |

  Scenario Outline: Approximer le diamemetre du noyau d-une planete avec des diametres differents
    Given Une planete avec un noyau et une temperature et un diametre standard
    When modification du diametre vers <diametrePlanete> km de la planete
    Then Le noyau de la planete a un diametre approxime de diam= <DiametreApproximeBis> km

    Examples: 
      | diametrePlanete | DiametreApproximeBis |
      |            1000 |                  550 |
      |            3000 |                 1550 |
