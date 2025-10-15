package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletForm
 */
@WebServlet("/ServletForm")
public class ServletForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		try(PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE HTML>");
			out.println("<html>");
			out.println("<head><title>Meu Primeiro Servlet</title></head>");
			out.println("<body>");
			out.println("<h2>Meu Segundo Servlet</h2>");
			out.println("<p>Sendo executado em" + request.getContextPath() + "</p>");
			out.println("<p>ADS - Linguagens Programação 3</p>");
			out.println("<form action=\"/Aula10-Parte2/ServletForm\" method=\"post\">");
			out.println("<label for=\"fname\">Nome:</label><br>	");
			out.println("<input type=\"text\" id=\"nome\" name=\"nome\"><br>	");
			out.println("<label for=\"lname\">e-mail:</label><br>	");
			out.println("<input type=\"email\" id=\"email\" name=\"email\"><br><br>");
			out.println("<input type=\"submit\" value=\"Submit\">	");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
