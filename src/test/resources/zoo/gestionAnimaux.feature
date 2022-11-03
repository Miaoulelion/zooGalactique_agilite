#Author: sylvain.vitry@dauphine.eu
#Author: hugo.jolion@dauphine.eu

Feature: Gestion des animaux
	
	En tant que Zoo
	Je souhaite pouvoir ajouter, modifier ou supprimer un animal de mon Zoo
	Afin d adapter l offre pour mes clients

  Scenario Outline: Ajouter un animal dans le Zoo 
  Given un zoo souhaitant ajouter <animal1> parmi ses animaux
  When  un zoo accueille un nouvel animal 
  Then  <animal1> est dans la liste <lstAnimaux1> du zoo
  
  
  
  Scenario Outline: Modifier un animal du Zoo 
  Given un zoo souhaitant modifier <animal1> parmi ses animaux
  When  un zoo le souhaite 
  Then  <animal1> est modifié
  
  
  Scenario Outline: Supprimer un animal du Zoo lors d un transfert
  Given un zoo souhaitant supprimer <animal1> de ses animaux
  When  un zoo transfère <animal1> 
  Then  <animal1> est supprimé de la liste <lstAnimaux1> du zoo
  

  Scenario Outline: Supprimer un animal du Zoo lors d un décès
  Given un zoo souhaitant supprimer <animal1> de ses animaux
  When  lorsque <animal1> décède
  Then  <animal1> est supprimé de la liste <lstAnimaux1> du zoo
  
  