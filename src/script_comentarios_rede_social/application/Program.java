package script_comentarios_rede_social.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import script_comentarios_rede_social.entities.Comment;
import script_comentarios_rede_social.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome");
		
		Post p = new Post(sdf.parse("19/07/2021 12:00:44"), "Traveling to New Zeeland", "I'm going to visit this beautiful country!", 89);
		
		p.addComent(c1);
		p.addComent(c2);
		
		System.out.println(p);

	}

}
