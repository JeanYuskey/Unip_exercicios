
public class Carro {
	public String marca;
	public String modelo;
	public String cor;
	public int ano;
}
class Program2
	{	
		public static void main(String[] args)
		{
		Carro Jean = new Carro();
		Carro Ze = new Carro();
		Jean.marca="Volkswagen";
		Jean.modelo="fusca";
		Jean.cor="preto";
		Jean.ano=1968;
		
		Ze.marca="Gurgel BR500";
		Ze.modelo="spin";
		Ze.cor="verde";
		Ze.ano=1978;
		System.out.printf("O carro do Jean é {0}, do modelo{1}, da cor {3} e do ano {4}\n", Jean.marca, Jean.modelo, Jean.cor, Jean.ano);
		System.out.printf("O carro do Ze é {0}, do modelo{1}, da cor {3} e do ano {4}\n", Ze.marca, Ze.modelo, Ze.cor, Ze.ano);
		}
	}