package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private AñadirTemaController añadirTema;
    
    private VotarController votar;
    
    private VerVotacionesController verVotaciones;
    
    private EliminarTemaController eliminarTema;

    public ControllerFactoryEJB() {
        this.añadirTema = new AñadirTemaController();
        this.votar = new VotarController();
        this.verVotaciones = new VerVotacionesController();
        this.eliminarTema = new EliminarTemaController();
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

    

}
