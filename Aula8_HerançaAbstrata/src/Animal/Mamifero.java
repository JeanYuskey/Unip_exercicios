package Animal;

public class Mamifero extends Animal {
	protected String alimento;

	public Mamifero() {
		super();
		this.alimento = "Onivoro";
	}

	public Mamifero(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas,
			String alimento) {
		super(nome, cor, ambiente, comprimento, velocidade, patas);
		this.alimento = alimento;
	}

	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String alimento() {
		return this.alimento;
	}

	@Override
	public void dados() {
		System.out.println("MAMÍFERO");
		System.out.println("Nome: "+nome);
		System.out.println("Cor: "+cor);
		System.out.println("Ambiente: "+ambiente);
		System.out.println("Comprimento: "+comprimento);
		System.out.println("Velocidade: "+velocidade);
		System.out.println("Patas: "+patas);
		System.out.println("Alimento: "+alimento);
		System.out.println("");
	}
}