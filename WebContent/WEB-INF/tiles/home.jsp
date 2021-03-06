<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<h2 align="center">Welcome to Offers App</h2>
	<hr>
	<p>
		<a href="${pageContext.request.contextPath}/offers">Show current
			offers</a>
	</p>
	<p>
		<a href="${pageContext.request.contextPath}/createoffer">Create
			Offer</a>
	</p>
	
	<sec:authorize access="hasRole('ADMIN')">
		<p>		
			<a href="<c:url value="/admin" />">Admin</a>
		</p>
	</sec:authorize>
