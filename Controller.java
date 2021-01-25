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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {    

        try (PrintWriter writer = response.getWriter()){
            String nick = request.getParameter("nick");
        	writer.println("Nickname: " + nick);
        }
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
          
        try (PrintWriter writer = res.getWriter()) {
            String name = req.getParameter("username");
            String age = req.getParameter("userage");
            String gender = req.getParameter("gender");
            String hobby = req.getParameter("hobby");
            String[] visited_country = req.getParameterValues("visited_country");
            
            writer.println("<p>Name: " + name + "</p>");
            writer.println("<p>Age: " + age + "</p>");
            writer.println("<p>Gender: " + gender + "</p>");
            writer.println("<p>Hobby: " + hobby + "</p>");
            writer.println("<h3>country: </h3>");
            for(String country: visited_country)
                writer.println("<li>" + country + "</li>");
        }
    }
	protected void doPut(HttpServletRequest rq, HttpServletResponse rs) 
            throws ServletException, IOException {
		try (PrintWriter writer = rs.getWriter()) {
			String massage = rq.getParameter("Put");
			writer.println("Massage: " + massage);
		}
	}
	protected void doDelete(HttpServletRequest quest, HttpServletResponse resp) 
            throws ServletException, IOException {
		try (PrintWriter writer = resp.getWriter()) {
			String massage = quest.getParameter("Delete");
			writer.println("Answer: " + massage);
		}
	}
}