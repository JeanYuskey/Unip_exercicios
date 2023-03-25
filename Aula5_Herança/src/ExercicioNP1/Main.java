package ExercicioNP1;

public class Main {

	public static void main(String[] args) {
		Classe1 c1 = new Classe1();
		Classe2 c2 = new Classe2();
		//Estpu colocando sysout(c1+c2) só para que a variável c1 e c2 seja utilizado, portanto desconsidere a linha abaixo
		System.out.println("______________________________"+c1+c2+"\n"); //Herança
		
		Classe3 c3 = new Classe3("e");
		Classe4 c4 = new Classe4();
		System.out.println("______________________________"+c3+c4+"\n"); 

		Classe3 c5 = new Classe3();
		Classe4 c6 = new Classe4("e"); //c6 pega a Classe3("e") ->"e b"   e a Classe4("e") ->"e d"
		System.out.println("______________________________"+c5+c6+"\n"); 
 	}

}
