package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private A�adirTemaController a�adirTema;
    
    private VotarController votar;
    
    private verVotacionesController verVotaciones;

    public ControllerFactoryEJB() {
        this.a�adirTema = new A�adirTemaController();
        this.votar = new VotarController();
        this.verVotaciones = new verVotacionesController();
    }

	@Override
	public A�adirTemaController getA�adirTemaController() {
		return a�adirTema;
	}

	@Override
	public VotarController getVotarController() {
		return votar;
	}

	@Override
	public verVotacionesController getVotacionesController() {
		return verVotaciones;
	}

    

}
