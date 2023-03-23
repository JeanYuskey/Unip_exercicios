package Private_mode;


public class Gente {
	private  String nome;
	public void setNome(String valor) {
		this.nome = valor;
	}
	public String getNome() {
		return this.nome;
	}
	private Data nascimento;
	public void setNascmento(Data valor) {
		this.nascimento = valor;
	}
	public Data getNascimento() {
		return this.nascimento;
	}
	private char genero;
	public void setGenero(char valor) {
		this.genero = valor;
	}
	//implementar construtores ()->"John Doe", 01/01/00, genero:?
	//implementar construtores (nome)-> 01/01/00, genero:?
	//implementar construtores (nome,idade)-> genero:?
	//implementar construtores (nome,idade,genero)
	public Gente() {
		this.nome = "John Doe 2";
		this.nascimento = new Data((byte)01, (byte)01, 00);
		this.genero = '?';
	}
	public Gente(String nome) {
		this.nome = nome;
		this.nascimento = new Data((byte)01, (byte)01, 00);
		this.genero = '?';
	}
	public Gente(String nome, Data idade) {
		this.nome = nome;
		this.nascimento = new Data((byte)02, (byte)02, 02);
		this.genero = '?';
	}
	public Gente(String nome, Data idade, char genero) {
		this.nome = nome;
		this.nascimento = new Data((byte)03, (byte)03, 03);
		this.genero = 'M';
	}
	
	public String ToString() {
		return "\nNome: "+this.nome+"\nNascimento: "+this.nascimento+"\nSexo: "+this.genero;
	}
	
}