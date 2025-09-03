package business;

public class Soma extends Calculo {
	
	public Soma(double n1, double n2) {
		super(n1, n2);
		operacao = "soma";
	}

	@Override
	public void calcular() {
		resultado = valor1 + valor2;

	}

}
