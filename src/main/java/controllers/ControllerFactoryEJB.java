package controllers;

//@ManagedBean(name = "controllerFactory")
//@SessionScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private AñadirTemaController añadirTema;
    
    private VotarController votar;

    public ControllerFactoryEJB() {
        this.añadirTema = new AñadirTemaController();
        this.votar = new VotarController();
    }

	@Override
	public AñadirTemaController getAñadirTemaController() {
		return añadirTema;
	}

	@Override
	public VotarController getVotarController() {
		return votar;
	}

    

}
