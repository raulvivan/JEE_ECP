package views.web.beans;

import controllers.ControllerFactory;

public class ViewBean {

	private ControllerFactory factory;

	public void setFactory(ControllerFactory factory) {
		this.factory = factory;
	}

	public ControllerFactory getFactory() {
		return factory;
	}
}
