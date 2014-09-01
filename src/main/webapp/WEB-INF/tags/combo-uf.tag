<%@tag description="Voltar" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@attribute name="id" required="true" %>
<%@attribute name="name" required="true" %>
<%@attribute name="value" required="false" %>
<%@attribute name="classes" required="true" %>
<%@attribute name="obrigatorio" required="false" %>
<%@attribute name="disabled" required="false" %>

<c:set var="ufs" value="${fn:split('AC,AL,AM,AP,BA,CE,DF,ES,GO,MA,MG,MS,MT,PA,PB,PE,PI,PR,RJ,RN,RO,RR,RS,SC,SE,SP,TO', ',')}" scope="application" />
<c:set var="app" value="${value}"/>

<select id="${id}" name="${name}" class="${classes} ${obrigatorio}" ${disabled}>    
	<option value="">Selecione</option>
	<c:forEach var="uf" items="${ufs}">     
		<option value="${uf}" ${app eq uf ? 'selected=selected' : ''}>${uf}</option>      
	</c:forEach>      
</select>