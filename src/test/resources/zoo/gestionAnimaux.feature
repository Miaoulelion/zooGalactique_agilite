#Author: sylvain.vitry@dauphine.eu
#Author: hugo.jolion@dauphine.eu

Feature: Gestion des animaux
	
	En tant que Zoo
	Je souhaite pouvoir ajouter, modifier ou supprimer un animal de mon Zoo
	Afin d adapter l offre pour mes clients

  Scenario: Ajouter un animal dans le Zoo 
  Given un zoo souhaitant ajouter un animal parmi ses animaux
  When  un zoo accueille un nouvel animal 
  Then  un animal est dans la liste d animaux du zoo
  
  
  
  Scenario: Modifier un animal du Zoo 
  Given un zoo souhaitant modifier un animal parmi ses animaux
  When  un zoo le souhaite 
  Then  un animal est modifie
  
  
  Scenario: Supprimer un animal du Zoo lors d un transfert
  Given un zoo souhaitant supprimer un animal de ses animaux
  When  un zoo transfere un animal
  Then  un animal est supprime de la liste d animaux du zoo
  

  Scenario: Supprimer un animal du Zoo lors d un décès
  Given un zoo souhaitant supprimer un animal de ses animaux
  When  lorsque un animal decede
  Then  un animal est supprime de la liste des animaux du zoo