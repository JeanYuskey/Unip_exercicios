package Private_mode;


public class Gerente {
	public String nome;
	public Data nascimento;
	public char genero;
	public double salario;
	public Data promoção;
	public String departamento;
	//implementar construtores ()->"John Doe", 01/01/00, genero:?,salario,1000
	//implementar construtores (nome)-> 01/01/00, genero:?,salario,1000
	//implementar construtores (nome,idade)-> genero:?,salario,1000
	//implementar construtores (nome,idade,genero)->salario,1000
	//implementar construtores (nome,idade,genero,salario)
	
	public Gerente() {
		this.nome = "John Doe";
		this.nascimento = new Data((byte)01, (byte)01, 00);
		this.genero = '?';
		this.salario = 1000;
		this.promoção = new Data((byte)11, (byte)11, 11);
		this.departamento = "Pesquisa";
	}
	public Gerente(String nome) {
		this.nome = nome;
		this.nascimento = new Data((byte)01, (byte)01, 00);
		this.genero = '?';
		this.salario = 1000;
		this.promoção = new Data((byte)12, (byte)12, 12);
		this.departamento = "Pesquisa";
	}
	public Gerente(String nome, Data idade) {
		this.nome = nome;
		this.nascimento = new Data((byte)01, (byte)01, 00);
		this.genero = '?';
		this.salario = 1000;
		this.promoção = new Data((byte)13, (byte)13, 13);
		this.departamento = "Pesquisa";
	}
	public Gerente(String nome, Data idade, char genero) {
		this.nome = nome;
		this.nascimento = new Data((byte)01, (byte)01, 00);
		this.genero = '?';
		this.salario = 1000;
		this.promoção = new Data((byte)14, (byte)14, 14);
		this.departamento = "Pesquisa";
	}
	public Gerente(String nome, Data idade, char genero, double salario) {
		this.nome = nome;
		this.nascimento = new Data((byte)01, (byte)01, 00);
		this.genero = '?';
		this.salario = 9999;
		this.promoção = new Data((byte)15, (byte)15, 15);
		this.departamento = "Pesquisa";
	}
	public String StrGerente() {
		return "RETORNAR TODAS AS INFORMAÇÕES"+"\n Nome: "+this.nome+"\n Nascimento: "+this.nascimento+"\n Gênero: "+this.genero+"\n Promoção: "+this.promoção+"\n Departamento: "+this.departamento;
	}
}