package Exercicios;

public class Circulo extends FiguraGeometrica{
	private double raio;
	//protected int lados;
	//protected String nome;

	public Circulo() {
		super(0, "Circulo");
		//this.lados = 0;
		//this.nome = "Circulo";
		this.raio = 1;
	}

	public Circulo(double r) {
		super(0,"Circulo");
		//this.lados = 0;
		//this.nome = "Circulo";
		this.raio = r;
	}

	public double perimetro() {
		return 2 * 3.14159 * raio;
	}
}
