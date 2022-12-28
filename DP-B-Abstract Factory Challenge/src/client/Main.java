package client;

import factory.FactoryProducer;
import factory.MovieFactory;
import product.bollywood.BollywoodMovieInterface;
import product.hollywood.HollywoodMovieInterface;

public class Main {

	public static void main(String[] args) throws Exception {
		MovieFactory actionMovieFactory = FactoryProducer.getFactory("action");

		HollywoodMovieInterface hAction = actionMovieFactory.getHollywoodMovie();
		BollywoodMovieInterface bAction = actionMovieFactory.getBollywoodMovie();

		System.out.println(bAction.getMovieName());
		System.out.println(hAction.getMovieName());

		MovieFactory comedyMovieFactory = FactoryProducer.getFactory("COMEDY");
		
		BollywoodMovieInterface bComedy = comedyMovieFactory.getBollywoodMovie();
		HollywoodMovieInterface hComedy = comedyMovieFactory.getHollywoodMovie();
		
		System.out.println(bComedy.getMovieName());
		System.out.println(hComedy.getMovieName());
	}

}
