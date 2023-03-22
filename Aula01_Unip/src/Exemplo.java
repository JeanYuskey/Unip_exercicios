public class Exemplo {

	public static void main(String[] args) {
		int a;
		float b;
		a=5;
		a=a+ (int) 7.5;
		b=5;
		b=b+a;
		if (a<10)
		{
		    System.out.println("Menor que 10");
		}
		else
		{
			System.out.println("Maior que 10");
		}
		
		if (b>10 || a<10)
		{
			System.out.println("Igualando b a 10");
			b=10;
		}
		else
			System.out.println("b Menor que 10");

		double c=15.1234567;
		if (c>10 && c<20)
		{
			System.out.println("c entre dez e vinte");
			b= (float) (b+c);
		}
		int d=1;
		switch (d){
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default:
			System.out.println("Alguns");
		}
		d=1;
		while (d<5) {
			System.out.println(d);
			d++;
		}
		
		d=1;
		do {
			System.out.println(d);
			d++;
		}while (d<10);
		for(d=3 ; d<=10 ; d=d+2       )
			System.out.println("Laço for="+d);

		
		System.out.println("a="+a+" b="+b+" c="+c);

	}

}







