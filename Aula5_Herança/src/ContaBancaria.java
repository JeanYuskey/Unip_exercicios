import java.util.Scanner;

public class ContaBancaria {
	private String cliente;
	private int num_conta;
	//public Data abertura;
	protected float saldo;
	
	public ContaBancaria() {
		this("Alguém",0);
	}
	
	public ContaBancaria(String cliente, int num) {
		this.cliente = cliente;
		this.num_conta = num;
		this.saldo = 0;
		
	}
	public void depositar(float valor) {
		this.saldo += valor;
	}

	public float sacar(float valor) {
		if ((saldo - valor) <= 0) {
			System.out.println("Sem saldo");
			System.out.println("Deseja zerar o saldo?");
			Scanner entrada = new Scanner(System.in);
			String sn = entrada.nextLine();
			entrada.close();
			if (sn.equalsIgnoreCase("S") || sn.equalsIgnoreCase("SIM")) {
				valor = this.saldo;
				this.saldo = 0;
			} else {
				valor = 0;
			}
		} else {
			this.saldo -= valor;

		}
		return valor;
	 }
    public String toString(){
        String frase = "";
        frase+= "\nCliente: "+this.cliente;
        frase+= "\nNumero Conta:  "+this.num_conta;
        frase+= "\nSaldo: "+this.saldo;
        return frase;
    }
}