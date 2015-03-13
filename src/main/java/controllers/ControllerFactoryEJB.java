package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private AņadirTemaController aņadirTema;
    
    private VotarController votar;

    public ControllerFactoryEJB() {
        this.aņadirTema = new AņadirTemaController();
        this.votar = new VotarController();
    }

	@Override
	public AņadirTemaController getAņadirTemaController() {
		return aņadirTema;
	}

	@Override
	public VotarController getVotarController() {
		return votar;
	}

    

}
