<%@tag description="Widget para tabelas para o portalweb" pageEncoding="UTF-8"%>
<%@attribute name="id" required="false" %>
<%@attribute name="titulo" required="true" %>
<%@attribute name="color" required="false" %>
<%@attribute name="icone" required="false" %>
<%@attribute name="extraClasses" required="false" %>
	
<ul id="${id}" class="column ${extraClasses}">
      <li class="widget widget-table action-table">
          <div class="widget-head widget-header">
          	<i class="${icone == '' ? 'icon-list-alt' : icone}"></i>
              <h3>${titulo}</h3>
          </div>
          <div class="widget-content">
			<jsp:doBody></jsp:doBody>
      	 </div>
      	<div id="widget-botom" class="${color == '' ? 'color-blue' : color}"></div>
      </li>
</ul>