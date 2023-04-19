package Banco;
public class Programa {

	public static void main(String[] args) {
		/*
		 * ContaBancaria c1 = new ContaBancaria(); c1.saldo = 100;
		 * System.out.println("Valor sacado: "+ c1.sacar(150)+"\nSaldo: "+c1.saldo);
		 * 
		 * }
		 */
		ContaBancaria c1 = new ContaBancaria();
		System.out.println(c1);
		ContaEspecial e1 = new ContaEspecial("Paulo",2,(float)300.00);
		e1.saldo = 100;
		e1.limite = 300;
		System.out.println(e1);
		e1.saldo = 100;
		//System.out.println("Valor sacado: " + e1.sacar(150) + "\nSaldo: " + e1.saldo);
		ContaEspecial e2 = new ContaEspecial();
		System.out.println(e2);
	}
}