package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private A�adirTemaController a�adirTema;
    
    private VotarController votar;

    public ControllerFactoryEJB() {
        this.a�adirTema = new A�adirTemaController();
        this.votar = new VotarController();
    }

	@Override
	public A�adirTemaController getA�adirTemaController() {
		return a�adirTema;
	}

	@Override
	public VotarController getVotarController() {
		return votar;
	}

    

}
