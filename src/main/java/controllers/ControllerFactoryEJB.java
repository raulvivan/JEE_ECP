package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private AñadirTemaController añadirTema;
    
    private VotarController votar;
    
    private VerVotacionesController verVotaciones;
    
    private EliminarTemaController eliminarTema;
    
    private MostrarTemaController mostrarTema;

    public ControllerFactoryEJB() {
        this.añadirTema = new AñadirTemaController();
        this.votar = new VotarController();
        this.verVotaciones = new VerVotacionesController();
        this.eliminarTema = new EliminarTemaController();
        this.mostrarTema = new MostrarTemaController();
    }

	@Override
	public AñadirTemaController getAñadirTemaController() {
		return añadirTema;
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
