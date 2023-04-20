package Banco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaPoupanca p1 = new ContaPoupanca();
		ContaEspecial e1 = new ContaEspecial();
		p1.informacao();
		e1.informacao();
		Banco b1 = new Banco();
		p1.depositar(100);
		System.out.println("Emprestimo p1 " + b1.valorEmprestimo(p1));
		System.out.println("Emprestimo e1 " + b1.valorEmprestimo(e1));

	}

}