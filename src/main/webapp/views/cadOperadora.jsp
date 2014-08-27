<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="ds" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">
	
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css'/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap-responsive.min.css'/>"/>
	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"/>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/font-awesome.min.css'/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/pages/portalweb.css'/>"/>

	<title>Cadastro de Operadoras</title>


</head>

<body ng-app ng-controller="cadOperadoraController">
	<div class=container>
	

		<table class="table table-striped" id="tblOperadoras">
			<thead>
				<tr>
					<th>Id</th>
					<th>Operadora</th>
					<th>Registo ANS</th>
					<th>Nome Fantasia</th>
					<th>Site</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="operadora in operadoras">
					<td>{{operadora.id}}</td>
					<td>{{operadora.razaoSocial}}</td>
					<td>{{operadora.registroANS}}</td>
					<td>{{operadora.nomeFantasia}}</td>
					<td><a href="{{operadora.site}}">{{operadora.site}}</a></td>
					<td>
						<a href="#" ng-click="edit(operadora)">
	                  		<span class="label">edit</span>
	                  	</a> |
	                  	<a href="#" ng-click="deleteUser(user)">
	                  		<span class="label label-important">remover</span>
	                  	</a>
	                 	
					</td>
				</tr>
			</tbody>		
		</table>
		
		<form class="form" >
		
			<div class="table-responsive" id="tblAddEdit" style="display:none" >
				<table class="table ">
					<thead>
						<tr>
							<th style="colspan:2" >{{operadora.nomeFantasia}}</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Razão Social</td>
							<td><input type="text" ng-model="operadora.razaoSocial" class="input-large" maxlength="512" ></td>
							
							<td>Registro ANS</td>
							<td><input type="text" ng-model="operadora.registroANS" class="form-control" maxlength="16" ></td>
							
						</tr>
						
						<tr>
							<td>Nome Fantasia</td>
							<td><input type="text" ng-model="operadora.nomeFantasia" class="form-control" maxlength="512" ></td>
						
							<td>CNPJ</td>
							<td><input type="text" ng-model="operadora.cnpj" class="form-control" maxlength="18" ></td>
						</tr>						

						<tr>
							<td>Logradouro</td>
							<td><input type="text" ng-model="operadora.logradouro" class="form-control" maxlength="1024"></td>
						</tr>	

						<tr>
							<td>Número</td>
							<td><input type="text" ng-model="operadora.numeroLogradouro" class="form-control" maxlength="32" ></td>
							
							<td>Complemento</td>
							<td><input type="text" ng-model="operadora.complemento" class="form-control" maxlength="32" ></td>
						</tr>							

						<tr>
							<td>Bairro</td>
							<td><input type="text" ng-model="operadora.bairro" class="form-control" maxlength="64" ></td>

							<td>Cidade</td>
							<td><input type="text" ng-model="operadora.cidade" class="form-control" maxlength="64" ></td>
						</tr>	

						<tr>
							<td>Estado (UF)</td>
							<td><input type="text" ng-model="operadora.uf" class="form-control" maxlength="2" ></td>

							<td>CEP</td>
							<td><input type="text" ng-model="operadora.cep" class="form-control" maxlength="9" ></td>
						</tr>							
						
						<tr>
							<td>Tel DDD</td>
							<td><input type="text" ng-model="operadora.telDDD" class="form-control" maxlength="2" ></td>

							<td>Telefone</td>
							<td><input type="text" ng-model="operadora.telefone" class="form-control" maxlength="256" ></td>

							<td>Fax</td>
							<td><input type="text" ng-model="operadora.fax" class="form-control"  maxlength="256" ></td>
						</tr>							
						
						<tr>
							<td>E-mail do responsável</td>
							<td><input type="text" ng-model="operadora.emailResponsavel" class="form-control" maxlength="512" ></td>

							<td>Site</td>
							<td><input type="text" ng-model="operadora.site" class="form-control" maxlength="512" ></td>
						</tr>	
						
					</tbody>
				</table>
			
		
				<input type="hidden" value="" ng-model="operadora.id">
	
				<button ng-click="postUser()" class="btn btn-success dropdown-toggle">Send user</button>
				<button ng-click="putUser()" class="btn btn-primary dropdown-toggle" disabled="disabled">Edit user</button>
			</div>
		</form>
		
	</div>
</body>

<script type="text/javascript" src="http://jqueryjs.googlecode.com/files/jquery-1.2.6.min.js"></script>

<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/angular/angular.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/angular/cadOperadoraController.js'/>"></script>

<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/excanvas.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/chart.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/bootstrap.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/grafico/grafico.js'/>"></script>

</html>