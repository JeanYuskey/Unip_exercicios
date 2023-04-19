package Exercicios;

public class Ferramentas {

	//tipo Object = é o todo do endereço da memória (genérico) = qualquer coisa , onde é necessário especificar
	//fg é uma referência, um endereço de memória, tipo da variavel , no caso tipo fg -> parametro de entrada
	//public static void MostraFigura(Object fg) { 
		// static = fixar na memória
	public static void MostraFigura(FiguraGeometrica fg) { // fg é o nome da variável, mas n o conteúdo
		if (fg instanceof Circulo) {
			System.out.println(((Circulo)fg).nome+"\nPerímetro: "+((Circulo)fg).perimetro());
			//(Circulo)fg) -> cast dentro de outro cast, tem o objetivo de especificar
			//fg.nome = vc n sabe qual figura é, ou seja, ela é genérica
			//especificação: através do cast = (Circulo)fg.nome --> assinatura do parâmetro
			
			//Object recebe qualquer coisa, um double, int, String, Circulo, Reta etc
			
			// if (fg instaceof Circulo) -> fg é um Circulo
			//     fg é um Object (o geral) em que deve dizer oq ela é, no caso Circulo
			// instaceof compara uma variável com a classe especifica -> retornando um valor boolean
			
			/*o ((Circulo)fg) está sendo redundante, portanto posso apagar sem dar erro
			Isso ocorre pois o .nome está na classe FiguraGeometrica
			Porém se n tivesse, n poderia apagar, como por exemplo o .perimetro, onde é necessário definir o tipo
			*/
		}
		else if (fg instanceof Reta) {
			System.out.println(((Reta)fg).nome+"\nPerímetro: "+((Reta)fg).perimetro());
		}
		else if (fg instanceof Triangulo) {
			System.out.println(((Triangulo)fg).nome+"\nPerímetro: "+((Triangulo)fg).perimetro());
		}
		else if (fg instanceof Quadrilatero) {
			System.out.println(((Quadrilatero)fg).nome+"\nPerímetro: "+((Quadrilatero)fg).perimetro());
		}
	}

}