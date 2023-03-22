
public class Data {
	public int ano;
	public byte dia, mes;
	//implementar o construtor (dd,mm,aa)
	public Data(byte dd, byte mm, int aa) {
		this.dia = dd;
		this.mes = mm;
		this.ano = aa;
	}
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
}