package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nive trip!");
		Comment c2 = new Comment ("Wow that's awesome!");
		// instanciar o post com a data, titulo, conteudo e numero de likes
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment ("May the Force be with you");
		// instanciar o post com a data, titulo, conteudo e numero de likes
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night", "May the Force be with you", 5);
		
		p1.addComment(c3);
		p1.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}