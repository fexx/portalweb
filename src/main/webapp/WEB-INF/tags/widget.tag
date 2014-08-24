<%@tag description="Widget para o portalweb" pageEncoding="UTF-8"%>
<%@attribute name="id" required="false" %>
<%@attribute name="titulo" required="true" %>
<%@attribute name="color" required="false" %>
<%@attribute name="icone" required="false" %>
<%@attribute name="extraClasses" required="false" %>
<%@attribute name="extraHeader" required="false" %>

<ul id="${id}" class="column ${extraClasses}">
      <li class="widget widget-nopad">
          <div class="widget-head widget-header ${extraHeader}">
          	<i class="${icone == '' ? 'icon-list-alt' : icone}"></i>
              <h3>${titulo}</h3>
          </div>
          <div class="widget-content">
          	<div class="widget big-stats-container">
	            <div class="widget-content">
					<jsp:doBody></jsp:doBody>
	            </div>
            </div>
      	 </div>
      	<div id="widget-botom" class="${color == '' ? 'color-blue' : color}"></div>
      </li>
</ul>