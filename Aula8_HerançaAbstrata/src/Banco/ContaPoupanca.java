package Banco;

//Manutenção gratuita
public class ContaPoupanca extends ContaBancaria {
	public float limite;
	public int diaAniv;

	public ContaPoupanca() {
		super();
		this.diaAniv = 1;
	}

	@Override
	public void sacar(float valor) {
		if (saldo + limite - valor >= 0)
			this.saldo -= valor;
		else
			System.out.println("sem fundo suficiente");
	}

	@Override
	public void calculaManutenção() {
		// Método abstrato deve ser utilizado obrigatoriamente, que é derivado a classe abstrata
		//this.saldo -= 0; -> como é free n é necessário colocar nd
	}

	@Override
	public void informacao() {
		// Método abstrato deve ser utilizado obrigatoriamente
		System.out.println("Nome: "+this.nome);
		System.out.println("Conta: "+this.conta);
		System.out.println("Aniversário: "+this.diaAniv);
		
	}
}
