package ExercicioNP1;

public class Main {

	public static void main(String[] args) {
		//Relacionamento
		// Classe1 cl=new Classe1 (); <- erro, não existe esse Método construtor sem assinatura "()"
		Classe1 c1 = new Classe1(1,2);
		// Estpu colocando sysout(c1) só para que a variável c1 seja utilizado, portanto desconsidere essa linha
		System.out.println("______________________________" +c1+"\n");
		
		Classe2 c2 = new Classe2(3,4);
		System.out.println("______________________________" +c2+"\n");
		
		Classe2 c3= new Classe2(5);
		System.out.println("______________________________" +c3+"\n");

		Classe1 c4= new Classe1(6);
		System.out.println("______________________________" +c4+"\n");
		
		Classe3 c5= new Classe3(2);
		c5.metodo1(3, 4);
		System.out.println(c5.d1);
		System.out.println("______________________________\n");
		
		Classe3 c6= new Classe3(3);
		c6.metodo1(5);
		System.out.println(c6.d1);
		System.out.println("______________________________\n");
		
		Classe3 c7= new Classe3(4);
		c7.metodo1();
		System.out.println(c7.d1);
		System.out.println("______________________________\n");
		
	}

}
