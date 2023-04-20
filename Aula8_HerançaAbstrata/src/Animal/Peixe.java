package Animal;

public class Peixe extends Animal{
	protected String caracteristica;

	public Peixe() {
		super("Bacalhau", "cinza", "Oceano", 1, 5.0f, 0);
		this.caracteristica = "Tem cabeca";
	}

	public Peixe(String nome, String cor, String ambiente, int comprimento, float velocidade, String caracteristica) {
		super(nome, cor, ambiente, comprimento, velocidade, 0);
		this.caracteristica = caracteristica;
	}

	public String caracteristica() {
		return this.caracteristica;
	}

	@Override
	public void dados() {
		System.out.println("PEIXE");
		System.out.println("Nome: "+nome);
		System.out.println("Cor: "+cor);
		System.out.println("Ambiente: "+ambiente);
		System.out.println("Comprimento: "+comprimento);
		System.out.println("Velocidade: "+velocidade);
		System.out.println("Característica: "+caracteristica);
		System.out.println("");
		
	}
}
