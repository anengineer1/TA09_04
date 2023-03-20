import java.util.Scanner;

public class TA09Ejercicio4App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca a: ");
		double a = sc.nextDouble();
		System.out.print("Introduzca b: ");
		double b = sc.nextDouble();
		System.out.print("Introduzca c: ");
		double c = sc.nextDouble();
		sc.close();
		
		Raices ecuacion = new Raices(a, b, c);
		ecuacion.calcular();
	}

}
