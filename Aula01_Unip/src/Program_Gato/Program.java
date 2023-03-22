package Program_Gato;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato doHugo =new Gato();
		doHugo.nome="Lua";
		doHugo.idade=6;

		Gato doLuis=new Gato();
		doLuis.nome="Frodo";
		doLuis.idade=4;
		
		Gato doJoaquim=new Gato();
		doJoaquim.nome="Teobaldo";
		doJoaquim.idade=10;

		doJoaquim.mostraGato();
		doLuis.mostraGato();
		doHugo.mostraGato();
		
	}
}
