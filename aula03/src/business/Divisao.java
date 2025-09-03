package business;

public class Divisao extends Calculo {

	public Divisao(double n1, double n2) {
		super(n1, n2);
		operacao = "divisão";
	}

	@Override
	public void calcular() {
		resultado = valor1 / valor2;

	}

}
