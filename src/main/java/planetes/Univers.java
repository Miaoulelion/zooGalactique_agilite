package planetes;

import java.util.LinkedList;

public final class Univers {
	private static final Univers INSTANCE = new Univers();
	private static LinkedList<Planete> planetes = new LinkedList<Planete>();
	
	private Univers() {
	}
	
	public static Univers getInstance() {
		return INSTANCE;
	}
	
	public static void addPlanete(Planete planete) {
		planetes.add(planete);
	}
	
	public static LinkedList<Planete> getPlanetes() {
		return planetes;
	}
	
}
