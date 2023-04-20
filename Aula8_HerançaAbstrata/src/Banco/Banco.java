package Banco;

public class Banco {
	public static int nconta;

	public float valorEmprestimo(ContaBancaria c) {
		float valor = 0;
		if (c instanceof ContaPoupanca) {
			valor = ((ContaPoupanca) c).saldo * 10;
		} else if (c instanceof ContaEspecial) {
			valor = ((ContaEspecial) c).limite * 5;
		}
		return valor;
	}

}
