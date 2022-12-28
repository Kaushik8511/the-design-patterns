package factory;

import product.bollywood.BollywoodActionMoview;
import product.bollywood.BollywoodMovieInterface;
import product.hollywood.HollywoodActionMovie;
import product.hollywood.HollywoodMovieInterface;

public class ActionMovieFactory implements MovieFactory {

	@Override
	public HollywoodMovieInterface getHollywoodMovie() {
		return new HollywoodActionMovie();
	}

	@Override
	public BollywoodMovieInterface getBollywoodMovie() {
		return new BollywoodActionMoview();
	}

}
