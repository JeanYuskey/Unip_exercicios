
public class ContaPoupança extends ContaBancaria {
	public int diaRendimento;
	public void calcularNovoSaldo(float taxa) {
		super.saldo*=(1+taxa/100);
	}

}
