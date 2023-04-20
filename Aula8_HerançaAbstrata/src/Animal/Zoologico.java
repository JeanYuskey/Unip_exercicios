package Animal;

public class Zoologico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero m1 = new Mamifero("Camelo", "Marrom", "Deserto", 4, 40f, 4, "herbivoro");
		Peixe p1 = new Peixe("Tubarão", "Cinza", "Oceano", 5, 50f, "Não é peixe");
		Mamifero m2 = new Mamifero();
		m1.dados();
		p1.dados();
		m2.dados();

	}
}