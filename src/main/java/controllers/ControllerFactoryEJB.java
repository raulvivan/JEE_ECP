package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private AņadirTemaController aņadirTema;
    
    private VotarController votar;
    
    private VerVotacionesController verVotaciones;
    
    private EliminarTemaController eliminarTema;

    public ControllerFactoryEJB() {
        this.aņadirTema = new AņadirTemaController();
        this.votar = new VotarController();
        this.verVotaciones = new VerVotacionesController();
        this.eliminarTema = new EliminarTemaController();
    }

	@Override
	public AņadirTemaController getAņadirTemaController() {
		return aņadirTema;
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
