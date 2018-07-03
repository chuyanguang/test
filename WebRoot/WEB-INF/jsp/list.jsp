<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>list</title>
  </head>
  
  <body>
  	<c:forEach items="${list}" var="u" >
  		<p>${u.name}</p>
  	</c:forEach>
  </body>
</html>
