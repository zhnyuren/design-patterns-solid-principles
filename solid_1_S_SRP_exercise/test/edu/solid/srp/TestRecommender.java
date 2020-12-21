package edu.solid.srp;

import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class TestRecommender {

	@Test
	public void basic_test() {
		Recommender r = new Recommender();
		
		List<Movie> recommenations = r.recommendations(BBDD.JOHN);
		
		Assert.assertFalse(recommenations.contains(BBDD.ET));
	}
	
	@Test 
	public void test_format() {
		Recommender r = new Recommender();
		List<Movie> recommenations = r.recommendations(BBDD.JOHN);

		CSVExporter csvExporter = new CSVExporter();
		String csv = csvExporter.recommendationsCSV(recommenations);
		
		String expected = "Saving Private Ryan,Spielberg,war";
		
		Assert.assertEquals(expected, csv);
	}

}
