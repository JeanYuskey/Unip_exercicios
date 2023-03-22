
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data(8, 3, 2023); //É importante lembrar que d1 é uma referência, ou seja, um objeto criado dentro de uma memória, armazenado no endereço Data,concluindo d1 armazena um endereço de memória
		System.out.println(d1.toString());
		
		Data d2 = new Data(1,04,2002);
		
		Funcionario f1 = new Funcionario();
		System.out.println(f1.toString());
		
		Funcionario f2 = new Funcionario ("Josefa",d1, "Recepcionista", 2500);
		System.out.println(f2);
		
		Funcionario f3 = new Funcionario("Nuno", new Data(31,12,1999),"Segurança", 3000);
		System.out.println(f3);
		f3.aumento(50);
		f3.setCargo("Office Boy");
		f3.setNascimento(new Data (01,03,1998));
		f3.setSalario(5000);
		System.out.println(f3.getNome()+"\n"+f3.getCargo());
		System.out.println(f3.getNascimento());
		System.out.println(f3.getSalario());
		
		
		
		//f2.setNascimento(new Data (1, 4,2002));
		f2.setNascimento(d2);
		System.out.println(f2.getNascimento());
		d2.setAno(2005);
		System.out.println(f2);
		
		f3.getNascimento().setAno(1995);
		System.out.println(f3);
		
	}

}
