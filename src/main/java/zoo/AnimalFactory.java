package zoo;

public class AnimalFactory {

	public static Lion getLion(Zoo zoo, String nom, float poids, int taille) {
		return new Lion(zoo, nom, poids, taille);
	}
	
	public static Lion getLion() {
		return new Lion();
	}
	
	public static Tigre getTigre(Zoo zoo, String nom, float poids, int taille) {
		return new Tigre(zoo, nom, poids, taille);
	}
	
	public static Tigre getTigre() {
		return new Tigre();
	}
	
	public static Singe getSinge(Zoo zoo, String nom, float poids, int taille) {
		return new Singe(zoo, nom, poids, taille);
	}
	
	public static Singe getSinge() {
		return new Singe();
	}
}
