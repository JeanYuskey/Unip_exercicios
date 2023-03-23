package Private_mode; //private = acesso somente métodos da pórpria classe


public class Data {
	private int ano;
	public void setAno(int ano) { //set -> altera para um outro valor 
		this.ano = ano;
	}
	public int getAno() { // get -> retorna/acessa um valor
		return this.ano;
	}
	private byte dia, mes;
	public void setDia(byte dia) {
		this.dia = dia;
	}
	public byte getDia() {
		return this.dia;
	}
	public void setMes(byte mes) {
		this.mes = mes;
	}
	public byte getMes() {
		return this.mes;
	}
	//implementar o construtor (dd,mm,aa)
	/*private Data(byte dd, byte mm, int aa) {
		this.dia = dd;
		this.mes = mm;
		this.ano = aa;
	}
	public void setData(byte dd, byte mm, int aa) {
		this.dia = dd;
		this.mes = mm;
		this.ano = aa;
	}
	public Data getData(byte dd, byte mm, int aa) {
		return this.getData(mm, mm, aa);
	} */
	
	public Data(byte dd, byte mm, int aa) {
		this.dia = dd;
		this.mes = mm;
		this.ano = aa;
	}
	
	
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
}