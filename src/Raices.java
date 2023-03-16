
public class Raices {

	// valor por defecto
	final private double VALOR_POR_DEFECTO = 0.0;

	// ax^2 + bx + c = 0
	private double a;
	private double b;
	private double c;

	public Raices() {
		this.a = this.VALOR_POR_DEFECTO;
		this.b = this.VALOR_POR_DEFECTO;
		this.c = this.VALOR_POR_DEFECTO;
	}

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminante() {
		return (Math.pow(b, 2) - 4 * a * c);
	}

	public boolean tieneRaices() {
		return (getDiscriminante() > 0);
	}

	public boolean tieneRaiz() {
		return (getDiscriminante() == 0);
	}

	public void obtenerRaiz() {
		System.out.println(-this.b / (2 * this.a));
	}

	public void obtenerRaices() {
		System.out.println("Solución 1: " + ((-this.b + Math.sqrt(getDiscriminante())) / (2 * this.a)));
		System.out.println("Solución 2: " + ((-this.b - Math.sqrt(getDiscriminante())) / (2 * this.a)));
	}

	public void calcular() {
		if (tieneRaices()) {
			obtenerRaices();
		} else if (tieneRaiz()) {
			obtenerRaiz();
		} else {
			System.out.println("No tiene solución");
		}
	}

}