package ExercicioNP1_Carro;

public class Motor {
	//Atributos
	public String nome;
	public int cilindros;
	public double capacidade;
	
	//Método construtor
	public Motor(String nome, int cil, double cc) {
		this.nome = nome;
		this.cilindros = cil;
		this.capacidade = cc;
	}
	public String toString() {
		return "\nMotor: "+this.nome+" | Cilindros: "+this.cilindros+" | Capacidade:"+this.capacidade;
	}
}

