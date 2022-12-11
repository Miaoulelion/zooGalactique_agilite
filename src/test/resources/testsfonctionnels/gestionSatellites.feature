#Author: nicolas.berthier0@dauphine.eu
#Author: anis.hammouche@dauphine.eu
Feature: US_004 Ajout et suppression de satellites autour d-une planete
  
  En tant que scientifique, je veux pouvoir modifier l-environnement d-une planete en ajoutant ou supprimant des satellites,
  afin de simuler le cycle de vie d-une planete

  Scenario Outline: Un nouveau satellite gravite autour d-une planete
    Given Une planete avec une temperature et un diametre standard
    When de l-ajout d-un <satellite>
    Then Le satellite <estEnOrbite> dans la liste de satellite

    Examples: 
      | satellite | estEnOrbite |
      | "lune"    | true        |
      | "charon"  | true        |
      | "triton"  | true        |
      | "nereide" | true        |

  Scenario Outline: Un satellite est sorti de l-orbite d-une planete
    Given Une planete avec une temperature et un diametre standard
    When de la suppression d-un <satellite> de l-orbite de la planete
    Then Le satellite <estEnOrbite> dans la liste de satellite

    Examples: 
      | satellite | estEnOrbite |
      | "lune"    | false       |
      | "triton"  | false       |
      | "nereide" | false       |
