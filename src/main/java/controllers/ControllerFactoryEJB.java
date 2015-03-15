package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private AñadirTemaController añadirTema;
    
    private VotarController votar;
    
    private verVotacionesController verVotaciones;

    public ControllerFactoryEJB() {
        this.añadirTema = new AñadirTemaController();
        this.votar = new VotarController();
        this.verVotaciones = new verVotacionesController();
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
	public verVotacionesController getVotacionesController() {
		return verVotaciones;
	}

    

}
