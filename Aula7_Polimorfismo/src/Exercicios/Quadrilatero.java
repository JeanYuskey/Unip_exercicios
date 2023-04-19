package Exercicios;

public class Quadrilatero extends FiguraGeometrica{
    private double l1,l2,l3,l4;
    //protected int lados;
    //protected String nome;

    //Quadrado
    public Quadrilatero() {
        //this.lados=4;
        //this.nome="Quadrilatero";
    	super(4, "QUadrilâtero");
    	
        this.l1=1;
        this.l2=1;
        this.l3=1;
        this.l4=1;
    }
    
    //Paralelogramo
    public Quadrilatero(double l12, double l34) {
    	//this.lados = 4;
    	//this.nome = "Paralelogramo";
    	super(4, "Paralelogramo");
    	
    	this.l1 = l12;
    	this.l2 = l34;
    	this.l3 = l12;
    	this.l4 = l34;
    }
    
    //Trapézio Isosceles
    public Quadrilatero(double l1, double l2, double l34) {
    	//this.lados = 4;
    	//this.nome = "Trapézio Isósceles";
    	super(4, "trapézio Isósceles");
    	
    	this.l1 = l1;
    	this.l2 = l2;
    	this.l3 = l34;
    	this.l4 = l34;
    }
    
    //Trapézio
    public Quadrilatero(double l1, double l2, double l3, double l4) {
    	//this.lados = 4;
    	//this.nome = "Trapezóide";
    	super(4, "Trapezóide");
    	
    	this.l1 = l1;
    	this.l2 = l2;
    	this.l3 = l3;
    	this.l4 = l4;
    }
    
    public double perimetro() {
        return l1+l2+l3+l4;
    }
}
