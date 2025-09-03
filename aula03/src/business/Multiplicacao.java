package business;

public class Multiplicacao extends Calculo {

	public Multiplicacao(double n1, double n2) {
		super(n1, n2);
		operacao = "multiplicação";
	}

	@Override
	public void calcular() {
		resultado = valor1 * valor2;

	}

}
