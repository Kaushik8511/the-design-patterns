package item;

public abstract class Burger implements Item{
	@Override
	public Packing packType() {
		return new Wrapper();
	}
}
