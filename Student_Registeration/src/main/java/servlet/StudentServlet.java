package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String name = request.getParameter("myname");
		String department = request.getParameter("departments");
		String email = request.getParameter("email");
		String age = request.getParameter("age");
		String phonenumber = request.getParameter("phonenumber");
		String gender = request.getParameter("gender");
		
		
		PrintWriter pw = response.getWriter();
		pw.write("<style>");
		pw.write("body{\r\n"
				+ "    margin:0;\r\n"
				+ "    padding: 0;    \r\n"
				+ "    background-image:url('https://images.unsplash.com/photo-1525921429624-479b6a26d84d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60');\r\n"
				+ "    background-repeat: no-repeat;\r\n"
				+ "   background-size: cover;\r\n"
				+ "   font-family: Georgia, 'Times New Roman', Times, serif;\r\n"
				+ "   color: rgb(77, 74, 74);\r\n"
				+ "   \r\n"
				+ "}\r\n"
				+ "header{\r\n"
				+ "    text-align: center;\r\n"
				+ "}\r\n"
				+ "header h1{\r\n"
				+ "    font-size: 35px;\r\n"
				+ "    font-weight: bold;\r\n"
				+ "    margin-top: 70px;\r\n"
				+ "}\r\n"
				+ "header p{\r\n"
				+ "    font-size: 20px;\r\n"
				+ "    margin-bottom: 40px;\r\n"
				+ "}\r\n"
				+ ".form-wrapper{\r\n"
				+ "    color: white;\r\n"
				+ "    margin-left: auto;\r\n"
				+ "    margin-right:auto ;\r\n"
				+ "    height: auto;\r\n"
				+ "    width:700px;\r\n"
				+ "    background: rgba(0, 0, 0, 0.5);     \r\n"
				+ "    padding:20px; \r\n"
				+ "    \r\n"
				+ "}\r\n"
				+ "*{\r\n"
				+ "    box-sizing: border-box;\r\n"
				+ "}\r\n"
				+ "#survey-form>div{\r\n"
				+ "    margin: 20px;\r\n"
				+ "}\r\n"
				+ "#survey-form{\r\n"
				+ "    font-size: 25px;\r\n"
				+ "}\r\n"
				+ ".input-styling{\r\n"
				+ "    width:100%;\r\n"
				+ "    height: 30px;\r\n"
				+ "    border:rgb(141, 137, 137) 1px solid;\r\n"
				+ "    border-radius: 5px;\r\n"
				+ "    padding-left: 10px;\r\n"
				+ "}\r\n"
				+ "button{\r\n"
				+ "    width: 100%;\r\n"
				+ "    height: 40px;\r\n"
				+ "    background-color:red;\r\n"
				+ "    border:rgb(77, 74, 74) 1px solid;\r\n"
				+ "    border-radius: 5px;\r\n"
				+ "    color: white;\r\n"
				+ "    font-family: Georgia, 'Times New Roman', Times, serif;\r\n"
				+ "    font-size: 25px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".message>h4{\r\n"
				+ "  line-height:2em;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* Responsive */\r\n"
				+ "@media (max-width:600px){\r\n"
				+ "    body {\r\n"
				+ "        width: auto;\r\n"
				+ "      display:block;\r\n"
				+ "      text-align: center;\r\n"
				+ "    }\r\n"
				+ "    header{\r\n"
				+ "        color: black;\r\n"
				+ "    }\r\n"
				+ "    .form-wrapper{\r\n"
				+ "        color: white;\r\n"
				+ "        margin-left: auto;\r\n"
				+ "        margin-right:auto ;\r\n"
				+ "        height: auto;\r\n"
				+ "        width:400px;\r\n"
				+ "        background: rgba(0, 0, 0, 0.5);     \r\n"
				+ "        padding:20px; \r\n"
				+ "        font-size: 20px;\r\n"
				+ "        \r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "");
		pw.write("</style>");
		
		pw.write("<!-- <script src=\"https://cdn.freecodecamp.org/testable-projects-fcc/v1/bundle.js\"></script> -->\r\n"
				+ "<div class=\"container\">\r\n"
				+ "        <header>\r\n"
				+ "            <h1 id=\"title\"> Student Registration Details</h1>\r\n"
				+ "            <p id=\"description\">Check your Details Here</p>\r\n"
				+ "        </header>\r\n"
				+ "        <div class=\"form-wrapper\">\r\n"
				+ "            <form action=\"StudentFrontent\" id=\"survey-form\">\r\n"
				+ "              <div class=\"message\">\r\n"
				+ "                <h4 id=\"name-label\">I'm <span style=\"color:red;\">"+ name +"</span>, having gender <span style=\"color:yellow;\">" + gender + "</span>. I'm <span style=\"color:blue;\">"+ age +"</span> years old and belongs to <span style=\"color:khaki;\">"+ department +"</span> department. My contact number is <span style=\"color:lightgreen;\">"+ phonenumber +"</span>, for online newsletters my email <span style=\"color:pink;\">"+ email +"</span></h4><br>\r\n"
				+ "                </div>\r\n"
				+ "              \r\n"
				+ "              \r\n"
				+ "              \r\n"
				+ "              \r\n"
				+ "\r\n"
				+ "                \r\n"
				+ "                <div class=\"submit\">\r\n"
				+ "                    <button type=\"submit\" id=\"submit\" name=\"register\" >Back</button>\r\n"
				+ "                </div>\r\n"
				+ "            </form>\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "");
	      
			
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
