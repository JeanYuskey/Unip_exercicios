package Banco;

//Manutenção=50
public class ContaEspecial extends ContaBancaria {
	public float limite;

	public ContaEspecial() {
		super();
		this.limite = 5000;
	}

	@Override
	public void sacar(float valor) {
		if (saldo + limite - valor >= 0)
			this.saldo -= valor;
		else
			System.out.println("sem fundo suficiente");
	}
	public void calculaManutenção() {
		this.saldo -= 50;
	}

	@Override //Override = sobreescrever -> serve para ignorar o outro método identico a esse
	public void informacao() {
		System.out.println("Nome: "+nome);
		System.out.println("Conta: "+conta);
		System.out.println("Disponível: "+saldo);
		
	}
}