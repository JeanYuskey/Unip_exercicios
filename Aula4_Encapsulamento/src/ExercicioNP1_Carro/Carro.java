package ExercicioNP1_Carro;

public class Carro {
	//Atributos
	public String modelo;
	public String cor;
	public Motor motor;
	
	//Método
	public Carro(String modelo, String cor, Motor motor){
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
	}
	public String toString() {
		return "Carro "+this.modelo+" -> Cor:"+this.cor+this.motor;
	}
}
