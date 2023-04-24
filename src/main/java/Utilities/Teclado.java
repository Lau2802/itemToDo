package Utilities;
import java.util.Scanner;
public class Teclado {
	public static String leerString() {
		return new Scanner(System.in).nextLine();
	}
	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}
	public static double leerDouble() {
		return new Scanner(System.in).nextDouble();
	}
	public static float leerFloat() {
		return new Scanner(System.in).nextFloat();
	}
	
	
	public static String leerString(String mensaje) {
		System.out.println(mensaje);
		return leerString();
	}
	public static int leerInt(String mensaje) {
		System.out.println(mensaje);
		return leerInt();
	}
	public static double leerDouble(String mensaje) {
		System.out.println(mensaje);
		return leerDouble();
	}
	public static float leerFloat(String mensaje) {
		System.out.println(mensaje);
		return leerFloat();
	}

}
