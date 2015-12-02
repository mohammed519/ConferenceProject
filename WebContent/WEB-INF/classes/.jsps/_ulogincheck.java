
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import java.sql.*;
import databaseconnection.*;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class _ulogincheck extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _ulogincheck page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      
      
      Statement st = null;
      ResultSet rs = null;
      
      int id;
      String email = request.getParameter("email");
      	session.setAttribute("email",email);
      String password = request.getParameter("pass");
      
      try
      			{
      			Connection con=databasecon.getconnection();
      			st=con.createStatement();
      	String qry =" select  * from register where email='"+email+"' and pass='"+password+"' "; 
      	rs = st.executeQuery(qry);
      	if(!rs.next()){
      	out.println("Enter correct Email  And password");
      	
      	}
      	else{
      	
      	
      	id=rs.getInt("uid");
      	session.setAttribute("id",id);
      	
      	
      	email=rs.getString("email");
      	session.setAttribute("email",email);
      	//System.out.println(email);
      	
      	response.sendRedirect("userpage.jsp");
      	
      	
      	
      	
      			
      	}
      	con.close();
      	st.close();
      }
      catch(Exception ex){
      	out.println(ex);
      }
      
      out.write(__oracle_jsp_text[2]);

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
  private static final char __oracle_jsp_text[][]=new char[3][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n<html>\n<head>\n<title>Innovative Schemes for Resource Allocation</title>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n</head>\n\n<body>\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n</body>\n</html>\n\n\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
