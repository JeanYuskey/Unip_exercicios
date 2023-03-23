
public class Program {

	public static void main(String[] args) {
		Comissionado c1 = new Comissionado();
		System.out.println(c1); //toString() -> método já existente dentro da biblioteca JAVA
		System.out.println(c1.info()); //info() -> método criado por a gnt
		
		
		Vendedor v1 = new Vendedor();
		System.out.println(v1);
		System.out.println(v1.toString());
		
		//toString() ≠ ToString()


		Gente g2 = new Gente();
		
		System.out.println("\n1. "+g2.ToString());
		
		//g2.genero = 'F' -> n consigo fazer assim pq ele está em private
		g2.setGenero('F');
				
		//System.out.println("\n\n\n"+g2.ToString());
		g2.setNome("Severina");
		System.out.println("\n2. "+g2.getNome());
		System.out.println("\n3. "+g2.ToString());
		
		
	}

}
