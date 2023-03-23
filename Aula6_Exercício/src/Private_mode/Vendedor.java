package Private_mode;


public class Vendedor {
	public String nome;
	public Data nascimento;
	public char genero;
	public double salario;
	//implementar construtores ()->"John Doe", 01/01/00, genero:?,salario,1000
	//implementar construtores (nome)-> 01/01/00, genero:?,salario,1000
	//implementar construtores (nome,idade)-> genero:?,salario,1000
	//implementar construtores (nome,idade,genero)->salario,1000
	//implementar construtores (nome,idade,genero,salario)
	
	public Vendedor() {
		this.nome = "John Doe";
		this.nascimento = new Data((byte)01, (byte)01, 00);
		this.genero = '?';
		this.salario = 1000;
	}
	
	public Vendedor(String nome) {
		this.nome = nome;
		this.nascimento = new Data((byte)01, (byte)01, 00);
		this.genero = '?';
		this.salario = 1000;
	}
	
	public Vendedor(String nome, Data idade) {
		this.nome = nome;
		//this.nascimento = new Data((byte)02, (byte)02, 02);
								  /*Nome: Marcos
									Nascimento: 2/2/2
									Sexo: ?
									Salario: 1000.0 */
		
		this.nascimento = idade;  /*Nome: Marcos
									Nascimento: 3/3/2023
									Sexo: ?
									Salario: 1000.0 */
		this.genero = '?';
		this.salario = 1000;
	}
	
	public Vendedor(String nome, Data idade, char genero) {
		this.nome = nome;
		this.nascimento = new Data((byte)03, (byte)03, 03);
		this.genero = 'M';
		this.salario = 1000;
	}
	
	public Vendedor(String nome, Data idade, char genero, double salario) {
		this.nome = nome;
		this.nascimento = new Data((byte)04, (byte)04, 04);
		this.genero = 'M';
		this.salario = 9999;
	}
	
	public String toString() {
		return "\nNome: "+this.nome+"\nNascimento: "+this.nascimento+"\nSexo: "+this.genero+"\nSalario: "+this.salario;
	}

}