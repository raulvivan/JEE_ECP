package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private AņadirTemaController aņadirTema;
    
    private VotarController votar;
    
    private verVotacionesController verVotaciones;

    public ControllerFactoryEJB() {
        this.aņadirTema = new AņadirTemaController();
        this.votar = new VotarController();
        this.verVotaciones = new verVotacionesController();
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
	public verVotacionesController getVotacionesController() {
		return verVotaciones;
	}

    

}
