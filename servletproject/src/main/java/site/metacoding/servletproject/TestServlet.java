package site.metacoding.servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:80/index.jsp (URL)
// http://localhost:80/hello (URL)
@WebServlet("/test")
public class TestServlet extends HttpServlet {

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	// 사용자에게 받은 http body, http header 정보를 HttpServletRequest req 에 담고
	// 그 친구한테 응답될 빈 객체 HttpServletResponse resp 를 만들어서
	// doGet(req, resp); 담아서 호출해준다. (아파치/톰캣에 의해 호출됨)
	// http://localhost:80/hello?file=login
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get요청됨");

		String file = req.getParameter("file");
		PrintWriter out = resp.getWriter();
		if (file.equals("login")) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>LoginPage</h1>");
			out.println("</body>");
			out.println("</html>");
		} else if (file.equals("join")) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>JoinPage</h1>");
			out.println("</body>");
			out.println("</html>");
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
