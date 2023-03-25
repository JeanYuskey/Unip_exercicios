package ExercicioNP1_Carro;

public class Program {

	public static void main(String[] args) {
		Carro c1 = new Carro("c1", "Preto", new Motor("m1", 4, 1.0));
		System.out.println(c1);
		System.out.println("");
		
		Carro c2 = new Carro("c2", "Prata", new Motor("m2", 4, 1.6));
		System.out.println(c2);
		System.out.println("");
		
		Motor m3 = new Motor("m3", 4, 1.8);
		System.out.println(m3);

	}

}
