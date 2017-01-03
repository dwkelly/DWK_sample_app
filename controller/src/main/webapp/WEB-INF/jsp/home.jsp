<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>DWK's User Management Home</title>
<!-- 		<link href="/resources/css/bootstrap.min.css" rel="stylesheet" media="screen"> -->
		<link href="<c:url value='/resources/css/bootstrap.css' />" rel="stylesheet" media="screen"/>
		<link href="<c:url value='/resources/css/bootstrap-theme.css' />" rel="stylesheet" media="screen"/>
<!-- 		<link href="/resources/css/custom.css" rel="stylesheet" media="screen"> -->
	</head>
	<body>
	<!-- JavaScript plugins (requires jQuery) -->
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	    <script src="<c:url value='/resources/js/bootstrap.js'/>" />
	<!-- Inlcude HTML5 Shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	    <h1>User Management</h1>
	    
		<table>
			<th>
			Name
			</th>
			<c:forEach var="entry" items="${userList}">
				<tr>
					<td>
					 ${entry.firstName} ${entry.lastName} 
				 	</td>
				 </tr>
		 	</c:forEach>
		</table>
	</body>
</html>