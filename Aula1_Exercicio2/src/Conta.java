import java.util.Scanner;

public class Conta {
	public double saldo;
	public double limite;
	public int conta;
	public String nome;
	
	public Conta() {
		System.out.println("Entre com o nome: ");
		Scanner entrada = new Scanner(System.in); //Eu importo uma classe já existente na biblioteca do JAVA que se chama Scanner e instâncio ela
		nome = entrada.nextLine();
		saldo = 0;
		limite = 10;
		entrada.close();
	}
	public Conta(String n) { //método construtor Conta
		nome = n;
		saldo = 0;
		limite = 100;
	}
	public Conta(String n, double L) {
		nome = n;
		saldo = 0;
		limite = L;
	}
	
	public void depositar(double valor){
		saldo += valor;
	}
	public void sacar(double valor){
		saldo = saldo - valor; //saldo-=valor
	}
	public void sacar() {
		saldo -= 10; //método construtor sacar
	}
	public void transferir(Conta destino, double valor) {
		sacar(valor);
		destino.depositar(valor);
	}
	
	public String Tostring() {
		
		/* String retorno = "conta: "+conta+"\nNome: "+nome;
		*retorno = retorno+ "\nSaldo: "+saldo+"\nLimite: "+limite;
		*return retorno
		*/
		
		return "Conta: "+conta+"\nNome: "+nome+"\nSaldo: "+saldo+"\nLimite: "+limite;
	}

}
