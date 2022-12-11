#Author: nicolas.berthier0@dauphine.eu
#Author: anis.hammouche@dauphine.eu

Feature: US_003 Approximation du diametre d-un noyau
  
  En tant que scientifique, je veux pouvoir approximer le diametre du noyau d-une planete lorsqu-elle en possede un,
  afin de faire avancer la science

  Scenario Outline: Approximer le diametre du noyau de planete avec des temperatures differentes
    Given Une <planete> avec un <noyau> et une temperature et un diametre standard
    When modification de la temperature <temperature> de la planete <planete>
    Then Le noyau de <planete> a un diametre approxime de diam= <DiametreApproxime> km

    Examples: 
      | planete      | noyau     | temperature | DiametreApproxime |
      | planeteRose  | noyauRose |          50 |                75 |
      | planeteVerte | noyauVert |         500 |               300 |

  Scenario Outline: Approximer le diamemetre du noyau d-une planete avec des diametres differents
    Given Une <planete> avec un <noyau> et une temperature et un diametre standard
    When modification du diametre vers <diametrePlanete> km de la planete <planete>
    Then Le noyau de la planete <planete> a un diametre approxime de diam= <DiametreApproximeBis> km

    Examples: 
      | planete      | noyau      | diametrePlanete | DiametreApproximeBis |
      | planeteJaune | noyauJaune |            1000 |                  550 |
      | planeteGrise | noyauGris  |            3000 |                 1550 |
