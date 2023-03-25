package Banco;
public class ContaEspecial extends ContaBancaria {
	public float limite;
	
	public ContaEspecial() {
		super("Alguém Especial", 5001);
		this.limite = 100;
		//this("Alguém Especial",5000, 100);
	}
	
	public ContaEspecial(String cliente, int num, float limite) {
		super(cliente,num); //super chama a ContaBancaria(String cliente, int num)
		this.limite = limite;
	}
	
	@Override
	public float sacar(float valor) {
		if (((this.saldo + this.limite) - valor) <= 0) {
			System.out.println("Sem saldo");
			valor = 0;
		} else {
			this.saldo -= valor;
		}
		return valor;
		
	}
	@Override
	public String toString() {
		String frase = super.toString(); //o super.toString() está chamando a classe toString do ContaBancaria, o resto das frases é pra add limite e saldo+limite
		frase += "\nLimite: "+this.limite;
		frase += "\nSaldo+limite: "+(this.saldo+this.limite);
		return frase;
	}
}
