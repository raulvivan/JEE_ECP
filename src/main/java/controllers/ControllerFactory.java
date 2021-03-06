package controllers;

public abstract class ControllerFactory {
    public abstract AņadirTemaController getAņadirTemaController();

	public abstract VotarController getVotarController();

	public abstract VerVotacionesController getVotacionesController();

	public abstract EliminarTemaController getEliminarTemaController();

	public abstract MostrarTemaController getMostrarTemaController();
}
