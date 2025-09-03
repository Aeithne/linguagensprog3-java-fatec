package business;

public class Subtracao extends Calculo {

	public Subtracao(double n1, double n2) {
		super(n1, n2);
		operacao = "subtracao";
	}

	@Override
	public void calcular() {
		resultado = valor1 - valor2;

	}
}
