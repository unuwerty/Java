import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/hello")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String nick = request.getParameter("nick");
         
        try {
            writer.println("<h2>Nickname: " + nick + "</h2>");
        } finally {
            writer.close();  
        }
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
 
        String name = request.getParameter("username");
        String age = request.getParameter("userage");
        String gender = request.getParameter("gender");
        String hobby = request.getParameter("hobby");
        String[] visited_country = request.getParameterValues("visited_country");
         
        try {
            writer.println("<p>Name: " + name + "</p>");
            writer.println("<p>Age: " + age + "</p>");
            writer.println("<p>Gender: " + gender + "</p>");
            writer.println("<p>Hobby: " + hobby + "</p>");
            writer.println("<h3>country: </h3>");
            for(String country: visited_country)
                writer.println("<li>" + country + "</li>");
        } finally {
            writer.close();  
        }
    }
}
