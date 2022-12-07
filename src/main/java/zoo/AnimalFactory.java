package zoo;

public class AnimalFactory {

	public static Animal getLion(Zoo zoo, String nom, float poids, int taille) {
		return new Lion(zoo, nom, poids, taille);
	}
	
	public static Animal getLion() {
		return new Lion();
	}
	
	public static Animal getTigre(Zoo zoo, String nom, float poids, int taille) {
		return new Tigre(zoo, nom, poids, taille);
	}
	
	public static Animal getTigre() {
		return new Tigre();
	}
	
	public static Animal getSinge(Zoo zoo, String nom, float poids, int taille) {
		return new Singe(zoo, nom, poids, taille);
	}
	
	public static Animal getSinge() {
		return new Singe();
	}
}
