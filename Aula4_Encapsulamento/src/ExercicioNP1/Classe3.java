package ExercicioNP1;

public class Classe3 {

	public float d1;

	public Classe3(float p) {
		this.d1 = p;
	}

	public void metodo1(float m, float n) {
		d1 *= (m + n);
	}

	public void metodo1(float m) {
		this.metodo1(m, m);

		d1 *= m;
	}

	public void metodo1() {

		this.metodo1(this.d1);
	}
}
