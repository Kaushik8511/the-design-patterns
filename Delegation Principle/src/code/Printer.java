package code;


//the "delegator"
public class Printer {

	private RealPrinter realPrinter = new RealPrinter();
	
	//create the delegate method
	void print() {
		realPrinter.print();
	}
}
