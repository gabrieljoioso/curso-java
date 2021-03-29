package entities;

public class Product {

	private String name; //Quando passamos para private --> Encapsulamento --> usa o get e set para obter e alterar.
	private double price;
	private int quantity;
	
	
	public Product() { //Construtor padr�o como uma op��o caso queira utilizar em Program.
		
	}
	
	public Product(String name, double price, int quantity) { // construtor tendo o mesmo nome da classe recebendo os atributos para obrigar que a instancia��o seja iniciada com valores nos atributos definidos.
		this.name = name; // referencia para o atributo do objeto, DIFERENCIAR ATRIBUTOS DA CLASSE DE VARIAVEIS LOCAIS. Est� referenciando o name(atributo da classe) no parametro "name".
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { // CONSTRUTOR --> SOBRECARGA, disponibilizar mais de uma vers�o da mesma opera��o com os parametros diferentes.
		this.name = name; 
		this.price = price;
		// N�o precisa colocar o this.quantity = 0(� opcional) pois em Java por padr�o, objetos e arrays iniciam com o numero 0.
	}
	
	
	
	// metodos get e set s�o colocados depois dos construtores.
	public String getName() { // permitir que o nome/valor seja obtido em outras classes.
		return name;
	}
	
	public void setName(String name) { // Alterar o nome ou valor.
		this.name = name; // atribui o novo valor no atributo name do objeto.
	}

	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price; // atribui o novo valor no atributo price do objeto.
	}
	
	
	public int getQuantity() { //Integridade do objeto. N�o podemos permitir que seja acessado e alterado diretamente no programa.
		return quantity; //retorna a quantidade, S� pode ser alterado quando houver uma entrada ou saida no estoque.
	}
	
	// n�o podemos criar o set neste caso do quantity, para proteger o objeto produto de altera��es inconsistentes na quantidade dele.
	
	
	
	
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	/*
	 * this.quantity � uma palavra reservada que significa uma autoreferencia para o
	 * objeto. Estou sendo especifico que quero acessar o atributo da classe e n�o o
	 * parametro de addProducts.
	 */

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	
	
	
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) // Convertendo para o formato de duas casas decimais.
				+ ", " // Formata��o toString para ser apresentado em Program.
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock()); // Convertendo para o formato de duas casas decimais.
															
																								
	}
}