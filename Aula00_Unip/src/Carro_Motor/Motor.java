package Carro_Motor;

public class Motor {
	public short numeroDeCilindros;
	public double litros;
	public int potencia;
	public String tipoDeRefrigeracao;
	public String combustivel;
	
	public void mostraMotor() {
		System.out.println("Número do Cilindro: "+numeroDeCilindros+" cilindros");
		System.out.println("Litros: "+litros+"L");
		System.out.println("Potência: "+potencia+"cv");
		System.out.println("Tipo de Refrigeração: "+tipoDeRefrigeracao);
		System.out.println("Combustível: "+combustivel);
		
	}

}
