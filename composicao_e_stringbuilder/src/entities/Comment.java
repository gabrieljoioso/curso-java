package entities;

public class Comment {
	
	private String text;
	
	// construtor padrão
	public Comment() {
		
	}

	// construtor parametrizado
	public Comment(String text) {
		this.text = text;
	}


	// motodo get/set
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}
	
}
