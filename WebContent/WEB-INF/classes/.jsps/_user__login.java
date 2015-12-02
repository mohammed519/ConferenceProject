
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _user__login extends com.orionserver.http.OrionHttpJspPage {


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
    _user__login page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);

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
  private static final char __oracle_jsp_text[][]=new char[1][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE html>\n  <head>\n    <title>Contact - Grand Responsive Template</title>\n\t<meta name=\"keywords\" content=\"\" />\n\t<meta name=\"description\" content=\"\" />\n\t<meta charset=\"utf-8\">\n\t<meta name=\"viewport\" content=\"initial-scale=1\">\n \t<link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,700italic,400,600,700,800' rel='stylesheet' type='text/css'> \n    \n   \t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"> \n   \t<link rel=\"stylesheet\" href=\"css/templatemo_misc.css\">\n\t<link rel=\"stylesheet\" href=\"css/templatemo_style.css\">  \n\t<!-- \n    Grand Template \n    http://www.templatemo.com/preview/templatemo_442_grand\n    -->\n    <!-- JavaScripts -->   \n    <script src=\"js/jquery-1.11.1.min.js\"></script>  <!-- lightbox -->\n\t<script src=\"js/templatemo_custom.js\"></script> <!-- lightbox -->\n    <script src=\"js/jquery.lightbox.js\"></script>\n    <script src=\"js/bootstrap-collapse.js\"></script>    \n    \n    <!-- JavaScripts -->  \n</head>\n  <body>\n  \t<!-- menu start -->\t\n  \t\n<div class=\"menu\"> \n  <div class=\"container\"> \n    <div class=\"row\"> \n      <div class=\"templatemo_menubg shadow\"> \n        <div class=\"col-sm-4\"> \n          <div class=\"templatemo_logo\">Conference</div>\n        </div>\n        <div class=\"col-sm-8\"> <nav class=\"navbar navbar-default\" role=\"navigation\"> \n          <div class=\"container-fluid\"> \n            <!-- Brand and toggle get grouped for better mobile display -->\n            <div class=\"navbar-header\"> \n              <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"><span class=\"sr-only\">Toggle \n              navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> \n              <span class=\"icon-bar\"></span></button>\n            </div>\n            <!-- Collect the nav links, forms, and other content for toggling -->\n            <div id=\"top-menu\"> \n              <div class=\"collapse navbar-collapse main_menu\" id=\"bs-example-navbar-collapse-1\"> \n                <ul class=\"nav navbar-nav\">\n                  <li><a href=\"index.html\">HOME</a></li>\n                  <li><a href=\"index.html\">Back</a></li>\n                 \n                </ul>\n              </div>\n            </div>\n            <!-- /.navbar-collapse -->\n          </div>\n          <!-- /.container-fluid -->\n          </nav> </div>\n      </div>\n    </div>\n  </div>\n</div>\n   <!-- menu end -->\n   <!-- contact start -->\n   \t<div class=\"templatemo_topbg topmargin\">\n   \t <div class=\"templatemo_grey\">\n        <div class=\"container\">\n        \n     \n     \n     <div class=\"container\">\n     \t<div class=\"row margin30\">\n        \t\n      <div class=\"col-md-4\"> \n        <div class=\"templatemo_contact_map shadow\"> <img src=\"images/login.jpg\" height=\"350\"> \n        </div>\n      </div>\n            \n      <div class=\"col-md-8\"> \n        <div class=\"templatemo_contact_form shadow\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n          <img  align=\"middle\" src=\"images/downarrows.gif\"> <br>\n          <br>\n           <form action=\"ulogincheck.jsp\" method=\"post\">\n            \n           <input type=\"text\" name=\"email\"  placeholder=\"Your Email ...\">\n            <input type=\"text\" name=\"pass\"   placeholder=\"Your Password ...\">\n            <button type=\"submit\" class=\"blue\">Click For Login</button>\n            <br>\n            <br>\n            <br>\n          </form>\n          <img src=\"images/arrow.gif\" width height=\"85\"> <a href=\"register.jsp\"> \n          <button type=\"submit\" class=\"blue\">New User Register</button>\n          </a> </div>\n      </div>\n        </div>\n     </div></div>\n   <!-- contact end -->\n   <!-- footer start -->\n   <div class=\"container\">\n   \t\t<div class=\"row\">\n        \t<div class=\"col-md-12 margin30 center\">\n            \n            </div>\n            <div class=\"footermargin\">&nbsp;</div>\n        </div>\n   </div>\n   <!-- footer end-->\n  </body>\n\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
