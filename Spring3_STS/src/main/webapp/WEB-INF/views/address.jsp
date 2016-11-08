<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add address</title>
</head>
<body>
	<form:form method="post" action="addAddress.html" commandName="address">
		<table>
			<tr>
				<td><form:hidden path="id" />
			</tr>
			<tr>
				<td><form:label path="city">
						<spring:message code="label.city" />
					</form:label></td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td><form:label path="street">
						<spring:message code="label.street" />
					</form:label></td>
				<td><form:input path="street" /></td>
			</tr>
			<tr>
				<td><form:label path="postalCode">
						<spring:message code="label.postalcode" />
					</form:label></td>
				<td><form:input path="postalCode" /></td>
			</tr>
			<tr>
				<td><form:label path="buildingNumber">
						<spring:message code="label.buildingnumber" />
					</form:label></td>
				<td><form:input path="buildingNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="flatNumber">
						<spring:message code="label.flatnumber" />
					</form:label></td>
				<td><form:input path="flatNumber" /></td>
			</tr>
			<tr>
				<td colspan="2"><c:if test="${address.id==0}">
						<input type="submit"
							value="<spring:message code="label.addaddress"/>"></input>
					</c:if> <c:if test="${address.id!=0}">
						<input type="submit"
							value="<spring:message code="label.editaddress"/>"></input>
					</c:if></td>
			</tr>
		</table>

	</form:form>
	<h3>
		<spring:message code="label.addresslist" />
	</h3>
	<c:if test="${!empty addressList}">
		<table class="data">
			<tr>
				<th><spring:message code="label.city" /></th>
				<th><spring:message code="label.street" /></th>
				<th><spring:message code="label.postalcode" /></th>
				<th><spring:message code="label.buildingnumber" /></th>
				<th><spring:message code="label.flatnumber" /></th>
				<th>&nbsp;</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${addressList}" var="address">
				<tr>
					<td>${address.city}</td>
					<td>${address.street}</td>
					<td>${address.postalCode}</td>
					<td>${address.buildingNumber}</td>
					<td>${address.flatNumber}</td>
					<td><a href="deleteAddress/${address.id}.html">delete</a></td>
					<td><a href="address.html?addressId=${address.id}">edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>