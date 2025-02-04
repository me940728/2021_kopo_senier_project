<%@page import="poly.dto.EmpDTO"%>
<%@page import="static poly.util.CmmUtil.nvl"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
    <%
    List<EmpDTO> rList = (List<EmpDTO>) request.getAttribute("rList");   
    String aemail= (String)session.getAttribute("aemail");
    %>
    <%
    if(aemail == null){
    	response.sendRedirect("/user/sessioCheck.do");	
    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD_EMP</title>
<meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Roboto:400,700"
    />
    <!-- https://fonts.google.com/specimen/Roboto -->
    <link rel="stylesheet" href="/resources/css/fontawesome.min.css" />
    <!-- https://fontawesome.com/ -->
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css" />
    <!-- https://getbootstrap.com/ -->
    <link rel="stylesheet" href="/resources/css/templatemo-style.css">
    <!--
	Product Admin CSS Template
	https://templatemo.com/tm-524-product-admin
	-->
</head>
<body>
         <div>
		<!-- 오근태 탑 탑!!-->
		<%@ include file="/WEB-INF/view/mainPage/oTop.jsp"%>
		<!-- 탑 영역 끝-->
	   </div>
	   
<body id="reportsPage">

    <div class="container mt-5">
      <div class="row tm-content-row">
        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 tm-block-col">
          <div class="tm-bg-primary-dark tm-block tm-block-products">
            <div class="tm-product-table-container">
              <table class="table table-hover tm-table-small tm-product-table">
                <thead>
                  <tr>
                    <th scope="col">&nbsp;</th>
                    <th scope="col">사원번호</th>
                    <th scope="col">이름</th>
                    <th scope="col">성별</th>
                    <th scope="col">최근 출근 일자</th>
                    <th scope="col">삭제</th>
                    <th scope="col">&nbsp;</th>
                  </tr>
                </thead>
                <tbody>
                <% 
                	for(EmpDTO e : rList) {
                %>
                  <tr>
                    <th scope="row"><!-- <input type="checkbox" /> --></th>
                    <td class="tm-product-name"><a href="/editEmp.do?empno=<%=e.getEmpno()%>"><%=nvl(e.getEmpno()) %></a></td> <!-- 사원번호 -->
                    <td><%=nvl(e.getEname()) %></td> <!-- 이름 -->
                    <td><%=nvl(e.getSex()) %></td><!-- 성별 -->
                    <td><%=nvl(e.getAttDate()) %></td> <!-- 최근 출근 일자 -->
                    <td>
                      <a href="/emp/empDelete.do?empno=<%=e.getEmpno() %>" class="tm-product-delete-link">
                        <i class="far fa-trash-alt tm-product-delete-icon"></i>
                      </a>
                    </td>
                  </tr>
                  
                  <%
                	}
                  %>               
               
                </tbody>
              </table>
            </div>
            <!-- table container -->
            <a
          		href="/addEmp.do"
              class="btn btn-primary btn-block text-uppercase mb-3">새로운 직원 등록</a>
<!--             <button class="btn btn-primary btn-block text-uppercase">
             직원 정보 삭제
            </button>
          </div> -->
        </div>
       
          </div>
        </div>
      </div>
    </div>
    <footer class="tm-footer row tm-mt-small">
      <div class="col-12 font-weight-light">
        <p class="text-center text-white mb-0 px-4 small">
          Copyright &copy; <b>2018</b> All rights reserved. 
          
          Design: <a rel="nofollow noopener" href="https://templatemo.com" class="tm-footer-link">Template Mo</a>
        </p>
      </div>
    </footer>

    <script src="/resources/js/jquery-3.3.1.min.js"></script>
    <!-- https://jquery.com/download/ -->
    <script src="/resources/js/bootstrap.min.js"></script>
    <!-- https://getbootstrap.com/ -->
    <script>
      $(function() {
        $(".tm-product-name").on("click", function() {
          window.location.href = "editEmp.do";
        });
      });
    </script>
</body>
</html>