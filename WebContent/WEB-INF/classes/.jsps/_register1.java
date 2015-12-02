
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import java.sql.*;
import databaseconnection.*;
import java.io.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class _register1 extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html; charset=utf-8");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, "", true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _register1 page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      
      
      String name=null,email=null;
      System.out.println("reaching");
      
      String a=request.getParameter("name");
      String b=request.getParameter("email");
      
      String c=request.getParameter("pass");
      
      String d=request.getParameter("dob");
      String e=request.getParameter("mobile");
      String f=request.getParameter("gender");
      String g=request.getParameter("address");
      
      int aaa=(int) (Math.random() * 100);
      int bbb=aaa*5;
      
      
      PreparedStatement ps = null;
      
      	ResultSet rs = null;
      	
      	
      	PreparedStatement ps1 = null;
      
      	ResultSet rs1 = null;
      	Statement st1=null;
      	try
      			{
      			Connection con1=databasecon.getconnection();
      			st1=con1.createStatement();
      	String qry1 =" select  * from register where email='"+b+"'  "; 
      	rs1 = st1.executeQuery(qry1);
      	if(!rs1.next()){
      	
      	try
      	{
      		
      		Connection con = databasecon.getconnection();
      
      		ps = con.prepareStatement("insert into register(name,email,pass,dob,mobile,gender,address) values(?,?,?,?,?,?,?)");
      		ps.setString(1,a); 
      ps.setString(2,b);
      ps.setString(3,c);
      ps.setString(4,d);
      ps.setString(5,e);
      ps.setString(6,f);
      ps.setString(7,g);
      ps.executeUpdate();
       response.sendRedirect("index.html?success");
      }
      catch(Exception e1)
      {    
      out.println(e1.getMessage());
      }
      
      	
      	}
      	else{
      	
      	
      	out.print("The registerd email id is alredy in our Db Try with different Eamil ID");
      	
      	
      	
      			
      	}
      	con1.close();
      	st1.close();
      }
      catch(Exception e1)
      {    
      out.println(e1.getMessage());
      }
      
      	
      	
      	
      	
      	
      	
      	
      	
      	
      
      out.write(__oracle_jsp_text[3]);

    }
    catch (Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch (Exception clearException) {
        }
        pageContext.handlePageException(e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext, true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[4][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<html>\n<head>\n<title> Scientific Workflow</title>\n\n</head>\n\n<body>\n\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n</body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
