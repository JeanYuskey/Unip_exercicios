package Carro_Motor;

public class Atributos_Carr0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carr0 jean = new Carr0();
		jean.nome="Jean";
		jean.marca="Volkswagen";
		jean.modelo="Fusca Beje Nilo";
		jean.cor="Azul";
		jean.ano=1968;
		
		Carr0 ze = new Carr0();
		ze.nome="Zé";
		ze.marca="Gurgel Motores S/A";
		ze.modelo="Gurgel Br-500";
		ze.cor="Branco";
		ze.ano=1985;
		
		
		Motor doJean = new Motor();
		doJean.numeroDeCilindros=4;
		doJean.litros=1.3;
		doJean.potencia=40;
		doJean.tipoDeRefrigeracao="Refrigerado a ar";
		doJean.combustivel="Gasolina";
		
		Motor doZe = new Motor();
		doZe.numeroDeCilindros=2;
		doZe.litros=2.5;
		doZe.potencia=15;
		doZe.tipoDeRefrigeracao="Refrigerado a ar";
		doZe.combustivel="Álcool;";
		
		jean.mostraCarro();
		doJean.mostraMotor();
		System.out.print("\n");
		
		ze.mostraCarro();
		doZe.mostraMotor();
		
	}

}
