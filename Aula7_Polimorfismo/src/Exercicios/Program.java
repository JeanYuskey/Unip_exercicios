package Exercicios;

public class Program {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Reta r1=new Reta(2);
        Circulo c1=new Circulo();
        Triangulo t1=new Triangulo(2,3);
        Triangulo t2=new Triangulo();
        Quadrilatero q1=new Quadrilatero(1,2,3,4);
        
        FiguraGeometrica f1 = new FiguraGeometrica(5, "alo");
        
        Ferramentas.MostraFigura(c1);
        System.out.println("");
        Ferramentas.MostraFigura(t1);
        System.out.println("");
        Ferramentas.MostraFigura(t2);
        System.out.println("");
        Ferramentas.MostraFigura(q1);
        System.out.println("");
        Ferramentas.MostraFigura(r1);
        
        
        
        System.out.println("");
        
        Ferramentas.MostraFigura(f1);

    }

}