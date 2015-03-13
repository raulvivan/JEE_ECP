package controllers;

public abstract class ControllerFactory {
    public abstract AñadirTemaController getAñadirTemaController();

	public abstract VotarController getVotarController();
}
