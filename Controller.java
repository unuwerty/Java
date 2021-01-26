import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class Controller extends HttpServlet {
	
	private void sendResponse (HttpServletRequest request, String arg, HttpServletResponse response) 
			throws ServletException, IOException {
		try (PrintWriter writer = response.getWriter()){
			writer.println(arg);
	}
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {    
		sendResponse(request, "nick: wer", response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        sendResponse(request, "name: ewr \n userage: 345 \n gender: male \n hobby: sport \n Sport: Baseball", response);
       
    }
	protected void doPut(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
		sendResponse(request, "answer: ew34", response);
		
	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
		sendResponse(request, "question: 23wq?", response);
		}
}