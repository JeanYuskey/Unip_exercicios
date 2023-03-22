
public class Comissionado {
	public String nome;
	public Data nascimento;
	public char genero;
	public double comissao;
	//implementar construtores ()->"John Doe", 01/01/00, genero:?,comissao:1000
	//implementar construtores (nome)-> 01/01/00, genero:?,comissao:1000
	//implementar construtores (nome,idade)-> genero:?,comissao:1000
	//implementar construtores (nome,idade,genero)->comissao:1000
	//implementar construtores (nome,idade,genero,comissao)
	
	public Comissionado() {
		this.nome = "John Doe";
		this.nascimento = new Data((byte)01,(byte)01,2000);
		this.genero = '?';
		this.comissao = 1000; 
	}
	
	public Comissionado(String nome) {
		this.nome = nome;
		this.nascimento = new Data ((byte)01,(byte)01,2000);
		this.genero = '?';
		this.comissao = 1000;	
	}
	
	public Comissionado(String nome, Data idade) {
		this.nome = nome;
		this.nascimento = new Data ((byte)02,(byte)02,2002);
		this.genero = '?';
		this.comissao = 1000;
	}
	public Comissionado(String nome, Data idade, String genero) {
		this.nome = nome;
		this.nascimento = new Data ((byte)03,(byte)03,03);
		this.genero = 'M';
		this.comissao = 1000;
	}
	public Comissionado(String nome, Data idade, String genero, double comissao) {
		this.nome = nome;
		this.nascimento = new Data ((byte)03,(byte)03,2003);
		this.genero = 'M';
		this.comissao = 9999;
	}
	public String toString() {
		return "RETORNAR TODAS AS INFORMAÇOES toString()"+"\n Nome: "+this.nome+"\n Nascimento: "+this.nascimento+"\n Gênero: "+this.genero+"\n Comissário: "+this.comissao;
		
	}
	public String info() {
		return "\nRETORNAR TODAS AS INFORMAÇOES info()"+"\n Nome: "+this.nome+"\n Nascimento: "+this.nascimento+"\n Gênero: "+this.genero+"\n Comissário: "+this.comissao;
		
	}
}
