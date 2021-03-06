package views.web.dispatchers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.ControllerFactoryEJB;
import views.web.beans.AņadirTemaBean;
import views.web.beans.EliminarTemaBean;
import views.web.beans.ListaTemasBean;
import views.web.beans.VerVotacionesBean;
import views.web.beans.VotarBean;
import modelos.entities.Tema;
import modelos.entities.Voto;
import modelos.utils.Estudios;

@WebServlet("/jsp/*")
public class Dispatcher extends HttpServlet{
	private static final long serialVersionUID = 1L;

    private static String PATH_ROOT_VIEW = "/jspFiles/";

	private ControllerFactoryEJB controllerFactoryEJB;
    
    

    @Override
	public void init() throws ServletException {
    	controllerFactoryEJB = new ControllerFactoryEJB();
	}

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String action = request.getPathInfo().substring(1);

        String view;
        switch (action) {
        case "aņadirTema": 
        	view = action;
        	break;
        case "votar":
        	VotarBean votarBean = new VotarBean();
        	votarBean.setId(Integer.parseInt(request.getParameter("id")));
        	votarBean.setFactory(controllerFactoryEJB);
        	votarBean.update();
        	request.setAttribute("votar", votarBean);
        	view = action;
        	break;
        case "verVotaciones":
        	VerVotacionesBean verVotaciones = new VerVotacionesBean();
        	verVotaciones.setId(Integer.parseInt(request.getParameter("id")));
        	verVotaciones.setFactory(controllerFactoryEJB);
        	verVotaciones.update();
        	request.setAttribute("votaciones", verVotaciones);
        	view = action;
        	break;
        case "eliminarTema":
        	EliminarTemaBean eliminarTemaBean = new EliminarTemaBean();
        	eliminarTemaBean.setId(Integer.parseInt(request.getParameter("id")));
        	request.setAttribute("eliminar", eliminarTemaBean);
        	view = action;
        	break;
    	default:
    		ListaTemasBean listaTemas = new ListaTemasBean();
    		listaTemas.setFactory(controllerFactoryEJB);
    		listaTemas.update();
        	request.setAttribute("temas", listaTemas);
        	view = "listaTemas";
        	break;
        }

        this.getServletContext().getRequestDispatcher(PATH_ROOT_VIEW + view + ".jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String action = request.getPathInfo().substring(1);
        String view = "listaTemas";
        switch (action) {	
        case "aņadirTema":
        	Tema tema = new Tema();
        	tema.setNombre(request.getParameter("tema"));
        	tema.setPregunta(request.getParameter("pregunta"));
        	AņadirTemaBean aņadirTema = new AņadirTemaBean();
        	aņadirTema.setTema(tema);
        	aņadirTema.setFactory(controllerFactoryEJB);
        	view = aņadirTema.process();
        	break;
        case "votar":
        	Voto voto = new Voto();
        	voto.setValoracion(Integer.parseInt(request.getParameter("valoracion")));
        	voto.setEstudios(Estudios.valueOf(request.getParameter("estudios")));
        	voto.setIp(request.getRemoteAddr());
        	VotarBean votarBean = new VotarBean();
        	votarBean.setVoto(voto);
        	votarBean.setId(Integer.parseInt(request.getParameter("id")));
        	votarBean.setFactory(controllerFactoryEJB);
        	view = votarBean.process();
        	
        	break;
        case "eliminarTema":
        		EliminarTemaBean eliminarTema = new EliminarTemaBean();
        		eliminarTema.setId(Integer.parseInt(request.getParameter("id")));
        		eliminarTema.setIdentificacion(Integer.parseInt(request.getParameter("identificador")));
        		eliminarTema.setFactory(controllerFactoryEJB);
        		view = eliminarTema.process();
        }
        
        if(view.equals("listaTemas")){
        	ListaTemasBean listaTemas = new ListaTemasBean();
    		listaTemas.setFactory(controllerFactoryEJB);
        	request.setAttribute("temas", listaTemas);
        }

        this.getServletContext().getRequestDispatcher(PATH_ROOT_VIEW + view + ".jsp")
            .forward(request, response);


        
    }

}
