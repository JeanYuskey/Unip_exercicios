package Animais;

public class Program {

	public static void main(String[] args) {
System.out.println("Jardim Zoológico \n");
	
	Mamifero camelo = new Mamifero("Camelo", 3, 4, "Marrom claro", "Terra", (float)18.0556);
	camelo.alteraCor("Marrom escuro");
	
	camelo.Mamifero("mamifero", "Vegetação e peixes");

System.out.println("\n\n");
	
	Peixe tubarao = new Peixe("Tubarão", 5, 0, "Cinza", "Mar",(float)5.27778);
	tubarao.Peixe("peixe", "Barbatanas e cauda");
	
System.out.println("\n\n");
	
	Mamifero urso = new Mamifero("Urso-do-Canadá", (int)2.5, 4, "Preto", "Terra", (float)11.1111);
	urso.Mamifero("mamifero", "Mel");
	}

}
