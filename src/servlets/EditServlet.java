package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Actor;
import model.ActorModel;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Long id1 = null;
		try {
			id1 = Long.parseLong(request.getParameter("id"));
		} catch (NumberFormatException e) {
			System.out.println("oy");
		}
		Actor actor = null;
		ActorModel am = ActorModel.getInstance();
		for (int i = 0; i < am.getAct().size(); i++) {
			if (am.getAct().get(i).getId() == id1)
				actor = am.getAct().get(i);
		}
//		Actor actor = ActorModel.getInstance().stream().filter(elem -> id1.equals(elem.getId())).findFirst().orElse(null);
		
		getServletContext().setAttribute("actor", actor);
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/edit.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id_s = (String) request.getParameter("id");
		String lastname = (String) request.getParameter("lastname");
		String name = (String) request.getParameter("name");
		String gender = (String) request.getParameter("gender");
		long id = Long.parseLong(id_s);
		Actor actor = null;
		ActorModel am = ActorModel.getInstance();
		for (int i = 0; i < am.getAct().size(); i++) {
			if (am.getAct().get(i).getId() == id)
				actor = am.getAct().get(i);
		}
		actor.setLastname(lastname);
		actor.setFirstname(name);
		actor.setGender(gender);
		ActorModel.writeXml("C:\\Users\\Ira\\Desktop\\MOE\\3course\\Java EE\\lab2\\WebContent\\file.xml");

		response.sendRedirect("dann");
	}

}
