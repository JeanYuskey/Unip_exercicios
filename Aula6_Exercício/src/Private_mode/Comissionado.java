package Private_mode;

//Revisão: encontrei um erro no atributo nascimento, em que o exercício pede a idade do indivíduo
//Portanto, estarei trocando onde se pede a idade por um valor do tipo int
//No entanto, msm com o erro é possível utilizar, mas Como?
//Instanciando da classe Data, e colocando no valor do tipo Data nas assianturas dos métodos em que pede a idade, pois a idade(nascimento) é do tipo Data
//Corrigirei apenas da classe Comissado para conseguirmos distinguir a diferença

public class Comissionado {
	public String nome;
	public Data nascimento;
	public int idade;
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
	
	public Comissionado(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.genero = '?';
		this.comissao = 1000;
	}
	public Comissionado(String nome, int idade, String genero) {
		this.nome = nome;
		this.idade = idade;
		this.genero = 'M';
		this.comissao = 1000;
	}
	public Comissionado(String nome, int idade, String genero, double comissao) {
		this.nome = nome;
		this.idade = idade;
		this.genero = 'M';
		this.comissao = 9999;
	}
	public String toString() {
		return "RETORNAR TODAS AS INFORMAÇOES toString()"+"\n Nome: "+this.nome+"\n Nascimento: "+this.idade+"\n Data de nascimento: "+this.nascimento+"\n Gênero: "+this.genero+"\n Comissário: "+this.comissao;
		
	}
	public String info() {
		return "\nRETORNAR TODAS AS INFORMAÇOES info()"+"\n Nome: "+this.nome+"\n Nascimento: "+this.nascimento+"\n Gênero: "+this.genero+"\n Comissário: "+this.comissao;
		
	}
}
