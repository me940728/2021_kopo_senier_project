/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2021-06-09 01:03:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.mainPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import poly.util.CmmUtil;

public final class addEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/mainPage/oTop.jsp", Long.valueOf(1623198924374L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("poly.util.CmmUtil");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    ");

    String aemail= (String)session.getAttribute("aemail");
    
    if(aemail == null){
    	response.sendRedirect("/user/sessioCheck.do");	
    }
    
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>add EMP</title>\r\n");
      out.write("<link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\"\r\n");
      out.write("    />\r\n");
      out.write("    <!-- https://fonts.google.com/specimen/Roboto -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/css/fontawesome.min.css\" />\r\n");
      out.write("    <!-- https://fontawesome.com/ -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/jquery-ui-datepicker/jquery-ui.min.css\" type=\"text/css\" />\r\n");
      out.write("    <!-- http://api.jqueryui.com/datepicker/ -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/css/bootstrap.min.css\" />\r\n");
      out.write("    <!-- https://getbootstrap.com/ -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/css/templatemo-style.css\">\r\n");
      out.write("    <!--\r\n");
      out.write("\tProduct Admin CSS Template\r\n");
      out.write("\thttps://templatemo.com/tm-524-product-admin\r\n");
      out.write("\t-->\r\n");
      out.write("</head>\r\n");
      out.write("       <div>\r\n");
      out.write("\t\t<!-- 오근태 탑 탑!!-->\r\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("    <script src=\"/resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <!-- https://jquery.com/download/ -->\n");
      out.write("    <script src=\"/resources/js/moment.min.js\"></script>\n");
      out.write("    <!-- https://momentjs.com/ -->\n");
      out.write("    <script src=\"/resources/js/Chart.min.js\"></script>\n");
      out.write("    <!-- http://www.chartjs.org/docs/latest/ -->\n");
      out.write("    <script src=\"/resources/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- https://getbootstrap.com/ -->\n");
      out.write("    <script src=\"/resources/js/tooplate-scripts.js\"></script>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-xl\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"opencvIndex.do\"> \n");
      out.write("                    <h1 class=\"tm-site-title mb-0\">O-GeunTae</h1>\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler ml-auto mr-0\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("                    aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("              <i class=\"fas fa-bars tm-nav-icon\"></i>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mx-auto h-100\">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"/opencvIndex.do\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-cog\"></i>\n");
      out.write("                                <span>\n");
      out.write("                                    대쉬보드\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                         <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"imgCheckPage.do\">\n");
      out.write("                                <i class=\"fas fa-tachometer-alt\"></i>\n");
      out.write("                                출근체크\n");
      out.write("                                <span class=\"sr-only\">(current)</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"empMange.do\">\n");
      out.write("                                <i class=\"far fa-user\"></i>\n");
      out.write("                                직원관리\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"sendMail.do\">\n");
      out.write("                                <i class=\"far fa-file-alt\"></i>\n");
      out.write("                                메일발송\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("<!--                         <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-cog\"></i>\n");
      out.write("                                <span>\n");
      out.write("                                    프로그램관리 <i class=\"fas fa-angle-down\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a> -->\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Profile</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Billing</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Customize</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link d-block\" href=\"user/logOut.do\">\n");
      out.write("                                <b>로그아웃</b>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t<!-- 탑 영역 끝-->\r\n");
      out.write("\t   </div>\r\n");
      out.write("<body id=\"reportsPage\">\r\n");
      out.write("\r\n");
      out.write("\t   \r\n");
      out.write("\r\n");
      out.write("    <div class=\"container tm-mt-big tm-mb-big\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto\">\r\n");
      out.write("          <div class=\"tm-bg-primary-dark tm-block tm-block-h-auto\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-12\">\r\n");
      out.write("                <h2 class=\"tm-block-title d-inline-block\">직원 정보</h2>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row tm-edit-product-row\">\r\n");
      out.write("              <div class=\"col-xl-6 col-lg-6 col-md-12\">\r\n");
      out.write("                  <div class=\"form-group mb-3\">\r\n");
      out.write("                  \r\n");
      out.write("            <form action=\"/user/addEmpProc.do\" class=\"tm-edit-product-form\" method=\"post\" enctype=\"multipart/form-data\">        \r\n");
      out.write("                    <label\r\n");
      out.write("                      for=\"empno\"\r\n");
      out.write("                      >사원번호\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      id=\"empno\"\r\n");
      out.write("                      name=\"empno\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      class=\"form-control validate\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("             <br>\r\n");
      out.write("                   <label\r\n");
      out.write("                      for=\"ename\"\r\n");
      out.write("                      >이름\r\n");
      out.write("                    </label>\r\n");
      out.write("                     <input\r\n");
      out.write("                      id=\"ename\"\r\n");
      out.write("                      name=\"ename\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      class=\"form-control validate\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("              <br>\r\n");
      out.write("                     <label\r\n");
      out.write("                      for=\"addrs\"\r\n");
      out.write("                      > 주소\r\n");
      out.write("                    </label>\r\n");
      out.write("                     <input\r\n");
      out.write("                      id=\"addrs\"\r\n");
      out.write("                      name=\"addrs\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      class=\"form-control validate\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("              \r\n");
      out.write("                  <div class=\"form-group mb-3\">\r\n");
      out.write("                    <label\r\n");
      out.write("                      for=\"category\"\r\n");
      out.write("                      >성별</label\r\n");
      out.write("                    >\r\n");
      out.write("                    <select\r\n");
      out.write("                      class=\"custom-select tm-select-accounts\"\r\n");
      out.write("                      id=\"sex\"\r\n");
      out.write("                      name = \"sex\"\r\n");
      out.write("                    >\r\n");
      out.write("                      <option selected>성별 선택</option>\r\n");
      out.write("                      <option value=\"1\">남자</option>\r\n");
      out.write("                      <option value=\"2\">여자</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                      <div class=\"form-group mb-3 col-xs-12 col-sm-6\">\r\n");
      out.write("                          <label\r\n");
      out.write("                            for=\"expire_date\"\r\n");
      out.write("                            >생년월일\r\n");
      out.write("                          </label>\r\n");
      out.write("                          <input\r\n");
      out.write("                            id=\"hiredate\"\r\n");
      out.write("                            name=\"bday\"\r\n");
      out.write("                            type=\"text\"\r\n");
      out.write("                            class=\"form-control validate\"\r\n");
      out.write("                            data-large-mode=\"true\"\r\n");
      out.write("                          />\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("              <div class=\"col-xl-6 col-lg-6 col-md-12 mx-auto mb-4\">\r\n");
      out.write("                <div class=\"tm-product-img-dummy mx-auto\">\r\n");
      out.write("                \r\n");
      out.write("\t\t\t\t        <!-- 상품명 등록(추후 제목으로 표시된다) -->\r\n");
      out.write("\t\t\t\t            <label for=\"img\"></label>\r\n");
      out.write("\t\t\t\t            <input type=\"file\" id=\"img\" name=\"fileUpload\" required/>\r\n");
      out.write("\t\t\t\t            <div class=\"select_img\"><img src=\"\"/></div>\r\n");
      out.write("        \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- 이거 눌러서 학습 시키는 기능 엮기 -->\r\n");
      out.write("                <div class=\"custom-file mt-3 mb-3\">\r\n");
      out.write("                  <input id=\"fileInput\" type=\"file\" style=\"display:none;\" />\r\n");
      out.write("                  <input\r\n");
      out.write("                    type=\"button\"\r\n");
      out.write("                    class=\"btn btn-primary btn-block mx-auto\"\r\n");
      out.write("                    value=\"직원 얼굴 학습 시키기\"\r\n");
      out.write("                    name=\"emp\"\r\n");
      out.write("                    onclick=\"empnoSend()\"\r\n");
      out.write("                  />\r\n");
      out.write("                </div>\r\n");
      out.write(" <!--\"window.open('imgStorage.do','이미지 학습','width=700,height=700,location=no,status=no,scrollbars=yes');\"   -->\r\n");
      out.write("                \r\n");
      out.write("              <div class=\"row tm-edit-product-row\">\r\n");
      out.write("              <div class=\"col-xl-6 col-lg-6 col-md-12\">\r\n");
      out.write("                  <div class=\"form-group mb-3\">\r\n");
      out.write("                  \r\n");
      out.write("                 <label\r\n");
      out.write("                      for=\"eemail\" \r\n");
      out.write("                      > 이메일\r\n");
      out.write("                    </label>\r\n");
      out.write("                     <input\r\n");
      out.write("                      id=\"eemail\"\r\n");
      out.write("                      name=\"eemail\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      class=\"form-control validate\"\r\n");
      out.write("                      required style=\"width: 350px\"\r\n");
      out.write("                    />\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("             </div>   \r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-12\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-block text-uppercase\">직원 등록 완료</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <footer class=\"tm-footer row tm-mt-small\">\r\n");
      out.write("        <div class=\"col-12 font-weight-light\">\r\n");
      out.write("          <p class=\"text-center text-white mb-0 px-4 small\">\r\n");
      out.write("            Copyright &copy; <b>2018</b> All rights reserved. \r\n");
      out.write("            \r\n");
      out.write("            Design: <a rel=\"nofollow noopener\" href=\"https://templatemo.com\" class=\"tm-footer-link\">Template Mo</a>\r\n");
      out.write("        </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer> \r\n");
      out.write("\r\n");
      out.write("    <script src=\"/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <!-- https://jquery.com/download/ -->\r\n");
      out.write("    <script src=\"/resources/jquery-ui-datepicker/jquery-ui.min.js\"></script>\r\n");
      out.write("    <!-- https://jqueryui.com/download/ -->\r\n");
      out.write("    <script src=\"/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- https://getbootstrap.com/ -->\r\n");
      out.write("    <script>\r\n");
      out.write("      $ = jquery;\r\n");
      out.write("      $(function() {\r\n");
      out.write("        $(\"#expire_date\").datepicker();\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- 직원 얼굴 학습 누르면 실행 되는 메서드-->\r\n");
      out.write("    <script>\r\n");
      out.write("    function empnoSend() {\r\n");
      out.write("      var empno = document.getElementById(\"empno\").value;\r\n");
      out.write("  \t  var win = window.open('imgStorage.do?empno='+empno,'이미지 학습','width=700,height=700,location=no,status=no,scrollbars=yes');\r\n");
      out.write("  \t \r\n");
      out.write("  \t  <!-- 태그 내에 있는 값중에 id가 empno 곳의 값을 가쟈와서 변수에 담는 코드-->\r\n");
      out.write("\t};\r\n");
      out.write("    </script>\r\n");
      out.write("    <!--사진 저장 자바스크립트-->\r\n");
      out.write("            <script>\r\n");
      out.write("            $(\"#img\").change(function() {\r\n");
      out.write("                if(this.files && this.files[0]) {\r\n");
      out.write("                var reader = new FileReader;\r\n");
      out.write("                reader.onload = function(data) {\r\n");
      out.write("                    $(\".select_img img\").attr(\"src\",data.target.result).width(100);\r\n");
      out.write("                }\r\n");
      out.write("                reader.readAsDataURL(this.files[0]);\r\n");
      out.write("            }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
