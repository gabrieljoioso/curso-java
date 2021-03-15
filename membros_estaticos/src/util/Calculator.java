package util;

public class Calculator {
	
	public static final double PI = 3.14159; // Membro est�tico constante --> "final" significa que ele n�o vai mudar mais, constante. Padr�o de nomes para constante � tudo em letra maiuscula.
	
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
