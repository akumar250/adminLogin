package www.succesregiter.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessFully extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("this successfully servlet");
		out.println("<h2>this is success<h2>");
	}

}
