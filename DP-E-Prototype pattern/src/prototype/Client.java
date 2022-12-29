package prototype;

public class Client {
	public static void main(String[] args) {
		//creates new instances and add them into the cache
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape type: " + clonedShape.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape type: " + clonedShape2.getType());
		
		
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape type: " + clonedShape3.getType());
	}
}	
