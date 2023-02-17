
public class Robo {

	public short codigodeindetificacao;
	public String versao;
	public int datadecriacao; 
}
class Program{
	public static void main(String[] args) {
		Robo r2d2 = new Robo();
		Robo c3po = new Robo();
		r2d2.versao = "V1.0";
		c3po.versao = r2d2.versao;
		c3po.codigodeindetificacao = 999;
		r2d2.datadecriacao = c3po.datadecriacao = 991231;
		System.out.println("Robo r2d2 código"+r2d2.codigodeindetificacao+" , versão"+r2d2.datadecriacao+" , versão"+r2d2.versao);
		System.out.println("Robo c3po código"+c3po.codigodeindetificacao+" , versão"+r2d2.datadecriacao+" , versão"+c3po.versao);
	}

}
//Robo r2d2 = new Robo(); ->Robo é a classe(declaração do tipo da variável), r2d2=referência
//new robo(); significa a criação de um objeto(instância)
//r2d2 e c3po em amarelo são referências
//após a referência, utiliza-se o uso do ponto ('.') para acessar ao atributo do objeto
