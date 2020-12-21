package edu.solid.srp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Recommender {

	public List<Movie> recommendations (Client client) {
		
		List<Movie> recommended = new ArrayList<>();
		
		for (Movie favorite: client.getFavorites()) {
			recommended.addAll(BBDD.MOVIES_BY_DIRECTOR.get(favorite.getDirector()));
		}
		
		recommended.removeAll(client.getFavorites());
		
		return recommended;
	}
	
}
