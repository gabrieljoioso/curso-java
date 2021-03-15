package util;

public class Calculator {
	
	public static final double PI = 3.14159; // Membro estático constante --> "final" significa que ele não vai mudar mais, constante. Padrão de nomes para constante é tudo em letra maiuscula.
	
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
