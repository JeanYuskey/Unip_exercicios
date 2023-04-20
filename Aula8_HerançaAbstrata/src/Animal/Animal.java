package Animal;

public abstract class Animal {
	protected String nome;
	protected String cor;
	protected String ambiente;
	protected int comprimento;
	protected float velocidade;
	protected int patas;

	public Animal() {
		this("Urso do Canada", "Marrom", "Floresta temperada", 3, 50f, 4);
	}

	public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.patas = patas;
	}

	void alteraNome(String nome) {
		this.nome = nome;
	}

	void alteraComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	void alteraPatas(int patas) {
		this.patas = patas;
	}

	void alteraCor(String cor) {
		this.cor = cor;
	}

	void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	abstract void dados();

}