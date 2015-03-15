package views.web.dispatchers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import views.web.beans.AņadirTemaBean;
import views.web.beans.ListaTemasBean;
import views.web.beans.VotarBean;
import modelos.entities.Tema;
import modelos.entities.Voto;
import modelos.utils.Estudios;

@WebServlet("/jsp/*")
public class Dispatcher extends HttpServlet{
	private static final long serialVersionUID = 1L;

    private static String PATH_ROOT_VIEW = "/jspFiles/";

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
        	int id = Integer.parseInt(request.getParameter("id"));
        	votarBean.findTema(id);
        	request.setAttribute("estudios", Estudios.values());
        	request.setAttribute("votar", votarBean);
        	view = action;
        	break;
    	default:
    		ListaTemasBean listaTemas = new ListaTemasBean();
        	listaTemas.findTemas();
        	System.out.println(listaTemas.getTemas());
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
        	aņadirTema.aņadirTema();

        	break;
        case "votar":
        	Voto voto = new Voto();
        	voto.setValoracion(Integer.parseInt(request.getParameter("valoracion")));
        	Estudios[] estudios = Estudios.values();
        	voto.setEstudios(estudios[Integer.parseInt(request.getParameter("estudios"))]);
        	voto.setIp("127.0.0.1");
        	VotarBean votarBean = new VotarBean();
        	votarBean.setVoto(voto);
        	votarBean.aņadirVoto();
        	
        	break;
        }

        this.getServletContext().getRequestDispatcher(PATH_ROOT_VIEW + view + ".jsp")
            .forward(request, response);


        
    }

}
