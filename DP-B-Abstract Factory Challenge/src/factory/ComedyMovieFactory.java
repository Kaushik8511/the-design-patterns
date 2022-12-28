package factory;

import product.bollywood.BollywoodComedyMovie;
import product.bollywood.BollywoodMovieInterface;
import product.hollywood.HollywoodComedyMovie;
import product.hollywood.HollywoodMovieInterface;

public class ComedyMovieFactory implements MovieFactory {

	@Override
	public HollywoodMovieInterface getHollywoodMovie() {
		return new HollywoodComedyMovie();
	}

	@Override
	public BollywoodMovieInterface getBollywoodMovie() {
		return new BollywoodComedyMovie();
	}

}
