package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Actor;
import model.ActorModel;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        String id_s = (String) request.getParameter("id");
        long id = Long.parseLong(id_s);
		ActorModel am = ActorModel.getInstance();
		for (int i = 0; i < am.getAct().size(); i++) {
			if (am.getAct().get(i).getId() == id)
				am.getAct().remove(i);
			ActorModel.writeXml("C:\\Users\\Ira\\Desktop\\MOE\\3course\\Java EE\\lab2\\WebContent\\file.xml");
		}
    
        response.sendRedirect("dann");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
