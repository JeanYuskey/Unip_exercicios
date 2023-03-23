package Private_mode;


public class Program {

	public static void main(String[] args) {
		Comissionado c1 = new Comissionado();
		System.out.println(c1); //toString() -> método já existente dentro da biblioteca JAVA
		System.out.println(c1.info()); //info() -> método criado por a gnt

		//toString() ≠ ToString()
		
		Vendedor v1 = new Vendedor();
		System.out.println(v1);
		System.out.println(v1.toString());
		
		//Aqui será demonstrado a diferença da modificação feita por meio da revisão autoral do exercício
		// Podemos distinguir essa difrença comparando a classe Comissionado com a classe Vendedor
		// Intanciação
		
		
		Data d2 = new Data((byte)03,(byte)03,2023);
		System.out.println("\n"+d2);
		
		//Dentro da sobrecarga de método construtor
		Vendedor v2 = new Vendedor("Marcos", d2); //Método: Vendedor(String nome, Data valor) 
		System.out.println(v2);
		
		
		System.out.println("");
		//Agr da classe Comissionado
		Comissionado c2 = new Comissionado("Irmão do Marcos", 15);
		System.out.println(c2);
		
		

		Gente g2 = new Gente();
		
		System.out.println("\n1. "+g2.ToString());
		
		//g2.genero = 'F' -> n consigo fazer assim pq ele está em private
		g2.setGenero('F');
				
		//System.out.println("\n\n\n"+g2.ToString());
		g2.setNome("Severina");
		System.out.println("\n2. "+g2.getNome());
		System.out.println("\n3. "+g2.ToString());
		
		Data d1 = new Data((byte)03,(byte)03,2023);
		System.out.println("\n"+d1);
		
		g2.setNascmento(d1);
		System.out.println("\n4. "+g2.ToString());
		
		
	
	}

}
