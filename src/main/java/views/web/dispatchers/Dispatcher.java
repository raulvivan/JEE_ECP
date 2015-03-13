package views.web.dispatchers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import views.web.beans.A�adirTemaBean;
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
        case "a�adirTema": 
        	view = action;
        	break;
        case "votar":
        	VotarBean votarBean = new VotarBean();
        	int id = Integer.parseInt(request.getParameter("id"));
        	votarBean.findTema(id);
        	Tema tema = votarBean.getTema();
        	request.setAttribute("tema", tema);
        	view = action;
        	break;
        }

        this.getServletContext().getRequestDispatcher(PATH_ROOT_VIEW + ".jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String action = request.getPathInfo().substring(1);
        String view = "home";
        switch (action) {
        case "a�adirTema":
        	Tema tema = new Tema();
        	tema.setNombre(request.getParameter("nombre"));
        	tema.setPregunta(request.getParameter("pregunta"));
        	A�adirTemaBean a�adirTema = new A�adirTemaBean();
        	a�adirTema.setTema(tema);
        	a�adirTema.a�adirTema();

        	break;
        case "votar":
        	Voto voto = new Voto();
        	voto.setValoracion(Integer.parseInt(request.getParameter("valoracion")));
        	Estudios[] estudios = Estudios.values();
        	voto.setEstudios(estudios[Integer.parseInt(request.getParameter("estudios"))]);
        	voto.setIp("127.0.0.1");
        	VotarBean votarBean = new VotarBean();
        	votarBean.setVoto(voto);
        	votarBean.a�adirVoto();
        }

        this.getServletContext().getRequestDispatcher(PATH_ROOT_VIEW + view + ".jsp")
            .forward(request, response);


        
    }

}
