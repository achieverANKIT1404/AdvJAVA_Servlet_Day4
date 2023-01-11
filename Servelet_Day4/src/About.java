
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/about")
public class About extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>achieverANKIT | About</title>");
		out.print("<style>");
		
		out.print("body{ background-image: url(Backg.png); background_attachment: fixed;  background-size: 100%; font-family:calibri;}");

		out.print(".data{background-color:wheat; width:18pc; height:12pc; padding:5px; margin-top:8pc; border-radius:7px;}");
		
		out.print("h3{font-size:28px; color:forestgreen;}");
		
		out.print("p{font-size:18px; color:navy; font-weight:530;}");
		
        out.print("ul{   margin: 0;  padding: 0;  list-style: none; height: 45px;  background-color: indigo;  font-size: 18px;  line-height: 36px;  border-radius: 7px;}");	
		
		out.print(" h1{  margin-left: 13px; padding: 0 30px; margin-top: 5px; color:navajowhite;}");	 
		
		out.print(" li{   float: left; }");	 
		
		out.print("a{ display: block; padding: 0 10px; color: #fff;  text-decoration: none; margin-left: 60px;  margin-top:3px; }");	
		
	   out.print(" a:hover,  .active a{color: sandybrown;}");		   		
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		
		out.print("<nav>");
        out.print(" <ul>");
        out.print("<li><h1>achieverANKIT</h1></li>"); 
        out.print("<li><a href = 'index.html'>Home</a></li>");
        out.print("<li class = 'active'><a href = 'about'>About</a></li>");  
        out.print("<li><a href = 'prof'>Profile</a></li>");  
        out.print("<li><a href = 'contact'>Contact</a></li>");
        out.print("</ul>");
        out.print("</nav>");
        
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		out.print("<h2 style = 'color:maroon; text-align:center; font-size:35px;'>Welcome to About Page</h2>");
		
		out.print("<center>");
		out.print("<div class = 'data'>");
        out.print("<h3>Login Details</h3>");
        out.print("<hr>");
		out.print("<p>UserName : "+name+"<p>");
		out.print("<p>Password : "+pass+"<p>");
		out.print("</div>");
		out.print("</center>");
		
		RequestDispatcher rd1 = request.getRequestDispatcher("contact");
		rd1.forward(request, response);
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
