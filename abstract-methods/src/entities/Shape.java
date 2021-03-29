// Abstract methods.
// Metodos que não possuem implementação. Se a classe possuir um metodo abstrato, sua classe também sera abstrata.

package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}


	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();

}
