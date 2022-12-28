package factory;

import product.bollywood.BollywoodMovieInterface;
import product.hollywood.HollywoodMovieInterface;

public interface MovieFactory {
	HollywoodMovieInterface getHollywoodMovie();
	BollywoodMovieInterface getBollywoodMovie();
}
