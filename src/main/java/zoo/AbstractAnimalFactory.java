package zoo;


public abstract class AbstractAnimalFactory {
	public enum AnimalChoix {SINGE, LION, TIGRE};
	public abstract Animal build(AnimalChoix typeAnimal);
	public abstract Animal build(AnimalChoix typeAnimal, Zoo zoo, String nom, float poids, int taille);
}
