<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach var="number" begin="5" end="10">
	<c:out value="${number}">
	</c:out>
</c:forEach>