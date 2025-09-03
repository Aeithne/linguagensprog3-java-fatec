package business;

public class Quadrado extends Figura {
	
	private double lado;

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

}
