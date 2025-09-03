package business;

public abstract class Calculo implements ICalculo {
	
	protected double valor1, valor2, resultado;
	
	protected String operacao;
	
	protected Calculo(double n1, double n2) {
		this.valor1 = n1;
		this.valor2 = n2;
	}
	
	public double mostrarResultado() {
		return resultado;
	}
	
	public String mostrarOperacao() {
		return operacao;
	}

}
