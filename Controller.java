import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class Controller extends HttpServlet {
	
	protected void Writers (HttpServletRequest request, HttpServletResponse response, String fname) 
			throws ServletException, IOException {
		try (PrintWriter writer = response.getWriter()){
			fname = request.getParameter("fname");
			writer.println("nick: " + fname);
	}
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {    
        Writers(request, response, request.getParameter("nick: "));
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        try (PrintWriter writer = response.getWriter()) {
        	Writers(request, response, request.getParameter("username: "));
        	Writers(request, response, request.getParameter("userage: "));
        	Writers(request, response, request.getParameter("gender: "));
        	Writers(request, response, request.getParameter("hobby: "));
            String[] visited_country = request.getParameterValues("visited_country");
            writer.println("country: ");
            for(String country: visited_country)
                writer.println(country);
        }
    }
	protected void doPut(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
		Writers(request, response, request.getParameter("answer: "));
		
	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
		Writers(request, response, request.getParameter("massage: "));
		}
}