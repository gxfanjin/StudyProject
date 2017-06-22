<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户列表</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery/jquery-1.8.3.min.js"></script>

<script type="text/javascript">
	
</script>
</head>

<body>

	<form id="queryListFm" action="<%=request.getContextPath()%>/user/queryAllUser" method="post">
		<table>
			<thead>
				<tr>
					<th>姓名</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userList}" var="user">
					<tr>
						<c:if test="${not empty user.userName}">
							<td>${user.userName}</td>
						</c:if>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>


</body>
</html>