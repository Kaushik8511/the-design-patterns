

interface DisplayModule {
	void display();
}

class Monitor implements DisplayModule {

	@Override
	public void display() {
		System.out.println("display through monitor");
		
	}
	
}

class Projector implements DisplayModule {

	@Override
	public void display() {
		System.out.println("display through projector");
	}
	
}


//we have displayModule only here
//it gives us the flexibility to modify concrete class without affecting client (this class)
//we can also have other implementations without affecting any of the exsting code
public class Computer {
	DisplayModule displayModule;

	public void setDisplayModule(DisplayModule displayModule) {
		this.displayModule = displayModule;
	}
	
	public void display() {
		displayModule.display();
	}
}
