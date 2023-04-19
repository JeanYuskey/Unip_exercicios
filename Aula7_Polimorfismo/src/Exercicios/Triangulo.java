package Exercicios;

public class Triangulo extends FiguraGeometrica{
	private double l1, l2, l3;
	//protected int lados;
	//protected String nome;

	public Triangulo() {
		//this.lados = 3;
		//this.nome = "Triangulo Equilatero";
		super(3, "Triângulo Equilâtero");
		
		this.l1 = 1;
		this.l2 = 1;
		this.l3 = 1;
	}

	// Isosceles
	public Triangulo(double l12, double l3) {
		//this.lados = 3;
		//this.nome = "Triângulo Isósceles";
		super(3, "Triângulo Isósceles");
		
		this.l1 = l12;
		this.l2 = l12;
		this.l3 = l3;
	}

	// Escaleno
	public Triangulo(double l1, double l2, double l3) {
		//this.lados = 3;
		//this.nome = "Triângulo Escaleno";
		super(3, "Triângulo Escaleno");
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	/*private String classificaTri(double l1, double l2, double l3) {
		String saida;
		if (l1 == l2 && l1 == l3 && l2 == l3)
			saida = "Triângulo Equilatero";
		else if (l1 == l2 || l1 == l3 || l2 == l3)
			saida = "Triângulo Isosceles";
		else
			saida = "Triângulo Escaleno";

		return saida;
	}

	*/

	public double perimetro() {
		return l1 + l2 + l3;
	}
}