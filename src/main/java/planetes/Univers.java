package planetes;

import java.util.LinkedList;

public class Univers {
	private static Univers univers = new Univers();
	private static LinkedList<Planete> planetes = new LinkedList<Planete>();
	
	private Univers() {
	}
	
	public static Univers getUnivers() {
		return univers;
	}
	
	public static void addPlanete(Planete planete) {
		planetes.add(planete);
	}
	
	public static LinkedList<Planete> getPlanetes() {
		return planetes;
	}
	
}
