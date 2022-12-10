package zoo;


public class AnimalFactory {
	public enum AnimalChoix {SINGE, LION, TIGRE};

	public static Animal build(AnimalChoix typeAnimal){
		switch(typeAnimal) {
		case LION: return new Lion();
		case SINGE: return new Singe();
		case TIGRE: return new Tigre();
		default: throw new IllegalArgumentException("Type d'animal inconnu.");
		}
	}
	
	public static Animal build(AnimalChoix typeAnimal, Zoo zoo, String nom, float poids, int taille){
		switch(typeAnimal) {
		case LION: return new Lion(zoo, nom, poids, taille);
		case SINGE: return new Singe(zoo, nom, poids, taille);
		case TIGRE: return new Tigre(zoo, nom, poids, taille);
		default: throw new IllegalArgumentException("Type d'animal inconnu");
		}
	}
}
