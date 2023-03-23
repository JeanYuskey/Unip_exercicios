package Animais;

public class Animal {
	public String nome;
	public int comprimento;
	public int patas;
	public String cor;
	public String ambiente;
	public float velocidade;

	public Animal(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
		
		System.out.println("ANIMAL");
		System.out.println("Nome: "+this.nome);
		System.out.println("Comprimento: "+this.comprimento+" metros");
		System.out.println("Patas: "+this.patas+" patas");
		System.out.println("Cor: "+this.cor);
		System.out.println("Ambiente: "+this.ambiente);
		System.out.println("Velocidade: "+this.velocidade+" m/s");
	}
	
	public void alteraNome(String nome) {
		this.nome = nome;
		System.out.println("Nome alterado: "+nome);
	}
	public void alteraComprimento(int comprimento) {
		this.comprimento = comprimento;
		System.out.println("Coomprimento alterado: "+comprimento+" metros");
	}
	public void alteraPatas(int patas) {
		this.patas = patas;
		System.out.println("N° de patas alterado: "+patas+" patas");
	}
	public void alteraCor(String cor) {
		this.cor = cor;
		System.out.println("Cor alterado: "+cor);
	}
	public void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
		System.out.println("Ambiente alterado: "+ambiente);
	}
	public void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
		System.out.println("Velocidade alterado: "+velocidade+" m/s");
	}

	public String tipo;
	public String alimento;
	public String caracteristica;
	
	public void Mamifero(String tipo, String alimento) {
		this.tipo = tipo;
		this.alimento = alimento;
		if (tipo == "mamifero" || tipo == "mamifero") {
			this.alimento = alimento;
			System.out.println("Tipo: Mamífero");
			System.out.println("Alimentação: "+alimento);
			
		} else {
			System.out.println("Não é mamífero");
		}
	}
	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
		System.out.println("Alimento alterado: "+alimento);
	}
	
	public void Peixe(String tipo,String caracteristica) {
		this.tipo = tipo;
		this.caracteristica = caracteristica;
		if (tipo == "peixe" || tipo == "Peixe") {
			this.caracteristica = caracteristica;
			System.out.println("Tipo: Mamífero");
			System.out.println("Característica: "+caracteristica);
			
		} else {
			System.out.println("Não é mamífero");
		}
	}

}






