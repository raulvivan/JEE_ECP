package views.web.beans;

import javax.faces.bean.ManagedProperty;

import controllers.ControllerFactory;


public class ViewBean {

	@ManagedProperty(value = "#{controllerFactory}")
	private ControllerFactory factory;

	public void setFactory(ControllerFactory factory) {
		this.factory = factory;
	}

	public ControllerFactory getFactory() {
		return factory;
	}
}
