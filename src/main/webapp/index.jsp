<%@ page import="cn.xsy.util.Page" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<style type="text/css">
    .page{
        position: absolute;
        left: 1500px;
        top: 580px;
    }
</style>
<html>
<body>
<
<table>
    <tr>
        <td>编号</td>
        <td>标题</td>
        <td>访问量</td>
        <td>评论次数</td>
    </tr>

    <c:forEach items="newsinfo" var="item">
    <tr>
        <td>${item.newsid}</td>
        <td>${item.newstitle}</td>
        <td>${item.clickcount}</td>
        <td></td>

    </tr>
    </c:forEach>
    <p class="page">
            <%
                    Page page2 = (Page) request.getAttribute("page");
                %>
    <li><a href="/TestServlet?action=page&pageIndex=1">首页</a></li>

    <li>
        <a href="/TestServlet?action=page&pageIndex=<%=page2.getPageIndex() > page2.getPageCoals() ? page2.getPageCoals() : page2.getPageIndex() - 1%>">上一页</a>
    </li>
    <li><%=page2.getPageIndex()%></li>
    <li>
        <a href="/UserServlet?action=page&pageIndex=<%=page2.getPageIndex() > page2.getPageCoals() ? page2.getPageCoals() : page2.getPageIndex() + 1%>">下一页</a>
    </li>
    <li>
        <a href="/TestServlet?action=page&pageIndex=<%=page2.getPageCoals()%>">尾页</a>
    </li>
    </p>
</table>

</body>
</html>
