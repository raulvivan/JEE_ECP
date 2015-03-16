package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private A�adirTemaController a�adirTema;
    
    private VotarController votar;
    
    private VerVotacionesController verVotaciones;
    
    private EliminarTemaController eliminarTema;
    
    private MostrarTemaController mostrarTema;

    public ControllerFactoryEJB() {
        this.a�adirTema = new A�adirTemaController();
        this.votar = new VotarController();
        this.verVotaciones = new VerVotacionesController();
        this.eliminarTema = new EliminarTemaController();
        this.mostrarTema = new MostrarTemaController();
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

	@Override
	public MostrarTemaController getMostrarTemaController() {
		return mostrarTema;
	}

    

}
