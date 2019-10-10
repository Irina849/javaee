package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Actor;
import model.ActorModel;

@WebServlet("/AddActorServlet")
public class AddActorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddActorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/add.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		ActorModel am = ActorModel.getInstance();
		long max_zn = 0;
		for (int i = 0; i < am.getAct().size(); i++) {
			if (am.getAct().get(i).getId() > max_zn)
				max_zn = am.getAct().get(i).getId();
		}

		String lastname = (String) request.getParameter("lastname");
		String name = (String) request.getParameter("name");
		String gender = (String) request.getParameter("gender");
		

		Actor actor = new Actor((max_zn + 1), lastname, name, gender);
		ActorModel.getInstance().getAct().add(actor);
		ActorModel.writeXml("C:\\Users\\Ira\\Desktop\\MOE\\3course\\Java EE\\lab2\\WebContent\\file.xml");
		
		response.sendRedirect("dann");
	}

}
