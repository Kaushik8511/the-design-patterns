package prototype;

public abstract class Shape implements Cloneable{
	private String _id;
	protected String type;
	
	abstract void draw();
	
	public String getType() {
		return type;
	}
	
	public String getId() {
		return _id;
	}
	
	public void setId(String id) {
		this._id = id;
	}
	
	//clone method of the Cloneable interface
	//If we have any additional member variables in the subclasses we have to override the clone method in subclass
	@Override
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
}

