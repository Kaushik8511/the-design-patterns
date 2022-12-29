package component;

//this class should not be modified
public class ConcreteComponent extends Component{

	@Override
	public void doJob() {
		System.out.println("From concrete component and I am closed for modification");
	}

}
