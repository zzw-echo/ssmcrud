<%--
  Created by IntelliJ IDEA.
  User: zev
  Date: 2019/6/1
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工列表</title>
<%
    pageContext.setAttribute("APP_PATH",request.getContextPath());
%>


    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
    <link href="${APP_PATH}static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<%--    搭建显示页面--%>
    <div class="container">
<%--        标题--%>
        <div class="row">
            <div class="clo-md-12">
                <h1>SSM-CRUD</h1>
            </div>
        </div>
<%--        新加删除按钮--%>
        <div class="row"></div>
<%--        显示表格内容--%>
        <div class="row"></div>
<%--        显示分页信息--%>
        <div class="row"></div>
    </div>

</body>
</html>
