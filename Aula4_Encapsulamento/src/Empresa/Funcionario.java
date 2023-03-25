package Empresa;
public class Funcionario {
	private String nome;
	private Data nascimento;
	private String cargo;
	private double salario;

	public Funcionario() {
		this("Joaquim", new Data(11,9,2001), "Porteiro", 2000); //new Data() serve para q n precise chamar atributo por atributo utilizando o this a todo momento, ou seja, fazer apenas uma vez de forma mais complexa tornando-o main para os outros, em que os valores serão colocado no parâmetro 
		this.nome = "Joaquim";
		this.nascimento = new Data(11, 9, 2001);
		this.cargo = "Porteiro";
		this.salario = 2000;

	}

	public Funcionario(String nome, Data nascimento, String cargo, double salario) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.cargo = cargo;
		this.salario = salario;
	}
	public void setNascimento(Data valor) {
		this.nascimento = valor;		
	}
	public Data getNascimento() {
		return this.nascimento;
	}
	
	
	
	public void setSalario(double valor) {
		this.salario = valor;
	}
	public double getSalario() {
		return this.salario;
	}
	
	
	
	public void setCargo(String valor) { //set -> usado para fazer alteração, como n conseguimos mudar o nome de uma pessoa, n precisamos colocar o setNome
		this.cargo = valor;
	}
	public String getCargo() { //get -> tem a funçao de retornar o valor do atributo q está privado
		return this.cargo;
	}
	
	
	
	public String getNome() {
		return this.nome;
	}
	
	
	
	
	public String toString() { //O método toString retorna uma representação string de um objeto
		return "nome:" + this.nome + "\n Nasc:" + this.nascimento + "\ncargo:" + this.cargo + "\nSalario:" + this.salario;
	}

	public void aumento() {
		this.aumento(10);
		//public void aumento() {
		//this.salario += 1.1;
	}

	public void aumento(float perc) {
		this.salario *= (1 + (perc / 100));
	}
}