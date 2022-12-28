package item;

public abstract class ColdDrink implements Item{
	@Override
	public Packing packType() {
		return new Bottle();
	}
}
