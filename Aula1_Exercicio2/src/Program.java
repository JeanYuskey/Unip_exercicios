
public class Program {

	public static void main(String[] args) {
		/*
		Conta cc1=new Conta();
		Conta cc2=new Conta();
		Conta cc3=new Conta();
		
		cc1.nome = "Maria das Dores";
		cc2.nome = "Maria do Socorro";
		cc3.nome = "Maria da Encarnação";
		
		cc1.saldo = 500;
		cc2.saldo = 100;
		cc3.saldo = 400;
		
		cc1.limite = 200;
		cc2.limite = cc1.limite;
		cc3.limite = cc1.limite;

		System.out.println(cc1.Tostring()+"\n"+cc2.Tostring()+"\n"+cc3.Tostring());
		cc1.depositar(500);
		cc1.sacar(200);
		System.out.println(cc1.Tostring());
		
		*/
		
		Conta cc1 = new Conta("Maria");
		System.out.println(cc1.Tostring());
		System.out.println("");
		
		Conta cc2 = new Conta("João",500);
		System.out.println(cc2.Tostring());
		System.out.println("");
		
		Conta cc3 = new Conta();
		System.out.println(cc3.Tostring());
		System.out.println("----------------------------------");
		System.out.println("");
		
		cc1.depositar(100);
		cc1.sacar();
		System.out.println(cc1.Tostring());
		System.out.println("");
		
		cc1.sacar(30);
		System.out.println(cc1.Tostring());
		System.out.println("");
		
		cc1.transferir(cc2, 20); //o cc2 referencia do tipo Conta (pode colocar qualquer coisa para endereço)
		System.out.println(cc1.Tostring());
		System.out.println(cc2.Tostring());
	}

}
