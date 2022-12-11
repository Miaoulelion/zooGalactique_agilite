package zoo;

import java.util.ArrayList;

public class AnimalFactory extends AbstractAnimalFactory {

	public Animal build(AnimalChoix typeAnimal){
		switch(typeAnimal) {
		case LION: return new Lion();
		case SINGE: return new Singe();
		case TIGRE: return new Tigre();
		default: throw new IllegalArgumentException("Type d'animal inconnu.");
		}
	}
	
	public Animal build(AnimalChoix typeAnimal, Zoo zoo, String nom, float poids, int taille){
		switch(typeAnimal) {
		case LION: return new Lion(zoo, nom, poids, taille);
		case SINGE: return new Singe(zoo, nom, poids, taille);
		case TIGRE: return new Tigre(zoo, nom, poids, taille);
		default: throw new IllegalArgumentException("Type d'animal inconnu");
		}
	}
	
	public ArrayList<Animal> buildAnimauxClones(AnimalChoix typeAnimal, int nbrClones){
		ArrayList<Animal> animauxClones = new ArrayList<Animal>();
		for(int i=0;i<nbrClones;++i) {
			animauxClones.add(this.build(typeAnimal));
		}
		return animauxClones;
	}

}
