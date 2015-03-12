package views.web.dispatchers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.entities.Tema;

@WebServlet("/añadirTema")
public class AñadirTemaDispatcher extends HttpServlet{
	private static final long serialVersionUID = 1L;

    private static String PATH_ROOT_VIEW = "/añadirTema";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher(PATH_ROOT_VIEW + ".jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getPathInfo().substring(1);
        String view = "home";

        Tema tema = new Tema();
        tema.setNombre(request.getParameter("nombre"));
        tema.setPregunta(request.getParameter("pregunta"));


        this.getServletContext().getRequestDispatcher(PATH_ROOT_VIEW +".jsp")
                .forward(request, response);
    }

}
