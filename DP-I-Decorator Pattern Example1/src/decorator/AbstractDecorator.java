package decorator;

import component.Component;

public abstract class AbstractDecorator extends Component{
	protected Component component;
	
	public void setComponent(Component component) {
		this.component = component;
	}
	
	@Override
	public void doJob() {
		if(component != null) {
			component.doJob();
		}
	}
}
