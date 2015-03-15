package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private A�adirTemaController a�adirTema;
    
    private VotarController votar;
    
    private VerVotacionesController verVotaciones;
    
    private EliminarTemaController eliminarTema;

    public ControllerFactoryEJB() {
        this.a�adirTema = new A�adirTemaController();
        this.votar = new VotarController();
        this.verVotaciones = new VerVotacionesController();
        this.eliminarTema = new EliminarTemaController();
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
	public VerVotacionesController getVotacionesController() {
		return verVotaciones;
	}

	@Override
	public EliminarTemaController getEliminarTemaController() {
		return eliminarTema;
	}

    

}
