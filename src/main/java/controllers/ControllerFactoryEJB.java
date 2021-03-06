package controllers;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "controllerFactory")
@ApplicationScoped
public class ControllerFactoryEJB extends ControllerFactory {

    private AņadirTemaController aņadirTema;
    
    private VotarController votar;
    
    private VerVotacionesController verVotaciones;
    
    private EliminarTemaController eliminarTema;
    
    private MostrarTemaController mostrarTema;

    public ControllerFactoryEJB() {
        this.aņadirTema = new AņadirTemaController();
        this.votar = new VotarController();
        this.verVotaciones = new VerVotacionesController();
        this.eliminarTema = new EliminarTemaController();
        this.mostrarTema = new MostrarTemaController();
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

	@Override
	public MostrarTemaController getMostrarTemaController() {
		return mostrarTema;
	}

    

}
