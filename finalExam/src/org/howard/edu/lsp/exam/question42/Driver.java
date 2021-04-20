package org.howard.edu.lsp.exam.question42;

import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");

		Set<String> songs = db.getSongs("Rap");
		System.out.println( db.getGenreOfSong("Savage") );// prints “Rap”
		System.out.println( db.getGenreOfSong("Always There"));// prints “Jazz”
		System.out.println(songs); //prints "[Savage, Gin and Juice]"

	}

}
