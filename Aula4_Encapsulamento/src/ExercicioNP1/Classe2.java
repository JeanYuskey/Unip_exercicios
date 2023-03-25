package ExercicioNP1;

public class Classe2 {
	double a1, a2, a3;

	public Classe2(double p) {
		this(p,p,p);
		System.out.println("Construtor com 1 parametro");
		System.out.println(p);
	}

	public Classe2(double p12, double p3) {
		this(p12, p12, p3);
		System.out.println("Construtor com 2 parametros");
		System.out.println(p12);
		System.out.println(p3);
	}

	public Classe2(double p1, double p2, double p3) {
		this.a1 = p1;
		this.a2 = p2;
		this.a3 = p3;
		System.out.println("Construtor com 3 parametros");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}