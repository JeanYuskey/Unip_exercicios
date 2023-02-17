package Program_Conta;

public class contaDestino {

	public double saldo;
	public double limite;
	public int conta;
	public int nomeConta;
}
	
	class Program3{
		public static void main(String[] args){
		Conta cc1=new Conta();
		Conta cc2=new Conta();
		Conta cc3=new Conta();
		
		cc1.nomeConta = 111;
		cc1.saldo = 500;
		cc1.limite = 200;
		
		cc2.nomeConta = 222;
		cc2.saldo = 100;
		cc2.limite = cc1.limite;
		
		cc3.nomeConta = 333;
		cc3.saldo = 400;
		cc3.limite = cc1.limite;
		
		System.out.println("Conta: "+cc1.nomeConta+"\nsaldo= "+cc1.saldo+" e limite="+cc1.limite);
		System.out.println("Conta: "+cc2.nomeConta+"\nsaldo= "+cc2.saldo+" e limite="+cc2.limite);
		System.out.println("Conta: "+cc3.nomeConta+"\nsaldo= "+cc3.saldo+" e limite="+cc3.limite+"\n");
		
		cc1.transferirPara();
		cc2.transferirPara();
		cc3.transferirPara();
		
	}
	
}
