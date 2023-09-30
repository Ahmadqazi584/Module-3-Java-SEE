package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class StudentFrontent
 */
public class StudentFrontent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentFrontent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
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
				+ "    background-color:rgb(77, 74, 74);\r\n"
				+ "    border:rgb(77, 74, 74) 1px solid;\r\n"
				+ "    border-radius: 5px;\r\n"
				+ "    color: white;\r\n"
				+ "    font-family: Georgia, 'Times New Roman', Times, serif;\r\n"
				+ "    font-size: 25px;\r\n"
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
				+ "            <h1 id=\"title\"> Student Registration Form</h1>\r\n"
				+ "            <p id=\"description\">Fill your Details Here</p>\r\n"
				+ "        </header>\r\n"
				+ "        <div class=\"form-wrapper\">\r\n"
				+ "            <form action=\"StudentServlet\" id=\"survey-form\">\r\n"
				+ "              <div class=\"name\">\r\n"
				+ "                    <label id=\"name-label\">Name</label><br>\r\n"
				+ "                    <input type=\"text\" class=\"input-styling\" name=\"myname\" id=\"name\" placeholder=\"Enter Name\" required>\r\n"
				+ "                </div>\r\n"
				+ "              \r\n"
				+ "              \r\n"
				+ "              \r\n"
				+ "              <div class=\"department\">\r\n"
				+ "                    <label id=\"name-label\">Department</label><br>\r\n"
				+ "                    \r\n"
				+ "                <select placeholder=\"Enter Name\" class=\"input-styling\" name=\"departments\" id=\"department\" required>\r\n"
				+ "    <option value=\"mechanical\" name=\"department\">Mechanical</option>\r\n"
				+ "    <option value=\"electrical\" name=\"department\">Electrical</option>\r\n"
				+ "    <option value=\"software\" name=\"department\">Software</option>\r\n"
				+ "    <option value=\"computerscience\" name=\"department\">Computer Science</option>\r\n"
				+ "  </select>\r\n"
				+ "                </div>\r\n"
				+ "              \r\n"
				+ "              \r\n"
				+ "                \r\n"
				+ "              <div class=\"email\">\r\n"
				+ "                    <label id=\"email-label\">Email address</label><br>\r\n"
				+ "                    <input type=\"email\" class=\"input-styling\" id=\"email\" placeholder=\"Enter Email address\" name=\"email\" required>\r\n"
				+ "                </div>\r\n"
				+ "              <div class=\"code\">\r\n"
				+ "                    <label id=\"number-label\">Age</label><br>     \r\n"
				+ "                    <input type=\"number\" class=\"input-styling\" id=\"number\" placeholder=\"Enter Age\" name=\"age\" pattern=\"[0-9]{3}\" min=\"001\" max=\"999\" required>\r\n"
				+ "                </div>\r\n"
				+ "                <div class=\"number\">\r\n"
				+ "                    <label>Phone number</label><br>        \r\n"
				+ "                    <input type=\"number\" class=\"input-styling\" id=\"number\" placeholder=\"Enter Phone Number\" name=\"phonenumber\" pattern=\"[0-9]{10}\" required>\r\n"
				+ "                </div>\r\n"
				+ "                \r\n"
				+ "                <div class=\"gender\">\r\n"
				+ "                    <label id=\"gender\">Select gender</label><br>\r\n"
				+ "                        <input type=\"radio\" name=\"gender\" value=\"male\" checked> Male<br>\r\n"
				+ "                        <input type=\"radio\" name=\"gender\" value=\"female\"> Female<br>\r\n"
				+ "                        <input type=\"radio\" name=\"gender\" value=\"other\"> Other  \r\n"
				+ "                </div>\r\n"
				+ "\r\n"
				+ "                \r\n"
				+ "                <div class=\"submit\">\r\n"
				+ "                    <button type=\"submit\" id=\"submit\" name=\"register\" >Submit</button>\r\n"
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
