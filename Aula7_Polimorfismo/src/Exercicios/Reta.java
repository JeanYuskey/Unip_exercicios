package Exercicios;

public class Reta extends FiguraGeometrica {
	private double comprimento;
	//protected int lados;
	//protected String nome;

	public Reta() {
		//this.lados = 1;
		//this.nome = "Reta";
		super(1, "Reta");
		this.comprimento = 1;
	}

	public Reta(double compr) {
		//this.lados = 1;
		//this.nome = "Reta";
		super(1, "Reta");
		this.comprimento = compr;
	}

	public double perimetro() {
		return this.comprimento;
	}
}