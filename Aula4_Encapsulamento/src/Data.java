
public class Data
{
    private int dia; //antes estava public no dia, mes e ano, ai ent foi trocado para private
    private int mes;
    private int ano;
    public Data(int dia,int mes,int ano)
    {
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }
    public void setDia(int dia) {
    	this.dia = dia;
    }
    public void setMes(int mes) {
    	this.mes = mes;
    }
    public void setAno(int ano) {
    	this.ano = ano;
    }

    public String toString() 
    {
        return dia+"/"+mes+"/"+ano;
    }
}