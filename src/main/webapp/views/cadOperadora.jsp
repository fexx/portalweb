<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="ds" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="op" tagdir="/WEB-INF/tags" %>

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
	
	<div class=container id="cadOperadorasAddEditInfo" >

		<!-- LISTA OPERADORAS CADASTRADAS -->
	
		<div id="listaOperadoras" >
		
			<div class="panel-heading"  >
			    <div class="btn-group pull-right">
			        <a href="#" class="btn btn-default btn-sm" ng-click="">Cadastrar Nova Operadora</a>			         			      
			    </div>
			</div>		
			
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Operadora</th>
						<th>Registo ANS</th>
						<th>Nome Fantasia</th>
						<th>Site</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="operadora in operadoras">
						<td>{{operadora.razaoSocial}}</td>
						<td>{{operadora.registroANS}}</td>
						<td>{{operadora.nomeFantasia}}</td>
						<td class="operadoraWebSite" ><a ng-href="{{operadora.site}}" ng-click="openUrl(operadora)" >{{operadora.site}}</a></td>
						<td>
							<a href="#" ng-click="infoOperadora(operadora)">
		                  		<span class="label">Mais Informações</span>
		                  	</a>
						</td>
					</tr>
				</tbody>		
			</table>				
		
		</div>
		
		<!-- VISUALIZACAO DE CADASTRO SELECIONADO -->
		
		<div  id="visualizarInfoGeralOperadora">
		
			<div class="panel-heading"  >
			    <div class="btn-group pull-right">
			        <a href="#" class="btn btn-default btn-sm" ng-click="fecharInfoOperadora()">Voltar</a> 			       
			    </div>
			    <h4> Detalhes da operadora: {{operadora.nomeFantasia}}</h4>
			</div>
		
			<br/>
		
			<div class="panel panel-default" >			
				<div class="panel-heading"  >
				    <div class="btn-group pull-right">
				        <a href="#" class="btn btn-default btn-sm" ng-click="habilitaEditarCadOperadora()" id="btnEditarOperadora" >Editar Operadora</a>			         			      
				    </div>
				    <h4>Cadastrado da Operadora</h4>
				</div>					    
			    
			    <!-- CADASTRO OPERADORA -->
			    
			    <table class="table table-bordered">
					<tbody>
						<tr>
							<td>Razão Social</td>
							<td class="razaoSocial" >{{operadora.razaoSocial}}</td>
							
							<td>Registro ANS</td>
							<td class="registroAns" >{{operadora.registroANS}}</td>
							
						</tr>
						
						<tr>
							<td>Nome Fantasia</td>
							<td class="nomeFantasia" >{{operadora.nomeFantasia}}</td>
						
							<td>CNPJ</td>
							<td class="cnpj" >{{operadora.cnpj}}</td>
						</tr>						

						<tr>						
							<td>CEP</td>
							<td class="cep" >{{operadora.cep}}</td>

							<td>Logradouro</td>
							<td class="logradouro" >{{operadora.logradouro}}</td>
						</tr>	

						<tr>
							<td>Número</td>
							<td class="numeroLogradouro" >{{operadora.numeroLogradouro}}</td>
							
							<td>Complemento</td>
							<td class="complemento" >{{operadora.complemento}}</td>
						</tr>							

						<tr>
							<td>Bairro</td>
							<td class="bairro" >{{operadora.bairro}}</td>

							<td>Cidade</td>
							<td class="cidade" >{{operadora.cidade}}</td>
						</tr>	

						<tr>
							<td>Estado (UF)</td>
							<td class="uf" >{{operadora.uf}}</td>

						</tr>							
						
						<tr>
							<td>Tel DDD</td>
							<td class="telDDD" >{{operadora.telDDD}}</td>

							<td>Telefone</td>
							<td class="telefone" >{{operadora.telefone}}</td>

							<td>Fax</td>
							<td class="fax" >{{operadora.fax}}</td>
						</tr>							
						
						<tr>
							<td>E-mail do responsável</td>
							<td class="emailResponsavel" >{{operadora.emailResponsavel}}</td>

							<td>Site</td>
							<td class="site" ><a href="{{operadora.site}}" >{{operadora.site}}</a></td>
						</tr>	
						
					</tbody>
				</table>
							
			</div>
			
			<div  class="panel panel-default">
			   	<div class="panel-heading">
				    <div class="btn-group pull-right">
				        <a href="#" class="btn btn-default btn-sm" ng-click="habilitaEditarCadOperadoraInfoGeral()">Editar Info Geral</a> 			       
				    </div>
				    <h4>Info Geral da Operadora</h4>
				</div>
				
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Segementação</th>
							<th>Competência</th>
							<th>Total de beneficiários</th>
							<th>Data de cadastro</th>
							<th>Status</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>{{operadoraInfo.segmentacao}}</td>
							<td>{{operadoraInfo.competencia}}</td>
							<td>{{operadoraInfo.totalBeneficiarios | number:0}}</td>
							<td>{{operadoraInfo.dtCadastro  | date:'dd/MM/yyyy' }}</td>
							<td>{{operadoraInfo.status}}</td>
						</tr>
					</tbody>		
				</table>
				
			</div>			
		
			<div  class="panel panel-default" >
			   	<div class="panel-heading">
				    <h4>IDSS da Operadora</h4>
				</div>
			
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Ano base</th>
							<th>Ano Competência</th>
							<th>Nota Geral</th>
							<th>Dt. Inclusão</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr  ng-repeat="idss in operadoraIdss">
							<td>{{idss.anoBase}}</td>
							<td>{{idss.anoCompetencia}}</td>
							<td>{{idss.notaGeral * 10 | number:3 }}</td>
							<td>{{idss.dtInclusao  | date:'dd/MM/yyyy' }}</td>
							<td>
			                 	<a href="#" ng-click="respostaIdss(idss)">
			                  		<span class="label">Detalhes</span>
			                  	</a> |
			                  	<a href="#" ng-click="habilitaEditarCadOperadoraIdss(idss)">
			                  		<span class="label">Editar</span>
			                  	</a>
							</td>
						</tr>
					</tbody>		
				</table>				
			</div>		
		
			<div  class="panel panel-default" id="tblOperadorasIdssResposta" >
			   	<div class="panel-heading">
					<div class="btn-group pull-right">
				        <a href="#" class="btn btn-default btn-sm" ng-click="fecharPainelRespostas()">Fechar Painel</a>
				    </div>
				    <h4>Respostas IDSS da Operadora</h4>
				</div>			

				<table class="table table-bordered" >
					<thead>
						<tr>							
							<th>Questão</th>
							<th>Nota</th>
						</tr>
					</thead>
					<tbody>
						<tr  ng-repeat="resposta in respostaIdssLista">
							<td > <div ng-show="resposta.questaoIdss.questaoPai == null" > {{resposta.questaoIdss.ordem}} - {{resposta.questaoIdss.questao}}</div>
									<div style="padding-left: 5%" ng-show="resposta.questaoIdss.questaoPai != null" > {{resposta.questaoIdss.questaoPai.ordem}}.{{resposta.questaoIdss.ordem}} - {{resposta.questaoIdss.questao}}</div>
							</td>
							
							<!--  <td>{{resposta.notaIdss * 10 | number:3}}</td>-->
							
							<td> <input type="number" ng-model="resposta.notaIdss"  ng-value="resposta.notaIdss" /></td>							
							 
						</tr>
					</tbody>		
				</table>			
			</div>			
		
		</div>
	
		<div id="addEditCadOperadora">
			<div class="panel-heading">
			    <h4>Alteração de dados da operadora: {{operadora.nomeFantasia}}</h4>
			</div>					
			<form class="form" >
			
				<div class="table-responsive" id="tblAddEditCadOperadoraInfoGeral" >
				
				    <table class="table table-bordered">
						<tbody>
							<tr>
								<td>Razão Social</td>
								<td class="razaoSocial" ><input type="text" ng-model="operadoraEdit.razaoSocial" class="form-control" maxlength="512" /></td>
								
								<td>Registro ANS</td>
								<td class="registroAns" ><input type="text" ng-model="operadoraEdit.registroANS" class="form-control" maxlength="16" /></td>
								
							</tr>
							
							<tr>
								<td>Nome Fantasia</td>
								<td class="nomeFantasia" ><input type="text" ng-model="operadoraEdit.nomeFantasia" class="form-control" maxlength="512" /></td>
							
								<td>CNPJ</td>
								<td class="cnpj" ><input type="text" ng-model="operadoraEdit.cnpj" class="form-control" maxlength="18" /></td>
							</tr>						
	
							<tr>						
								<td>CEP</td>
								<td class="cep" ><input type="text" ng-model="operadoraEdit.cep" class="form-control" maxlength="9" /></td>
	
								<td>Logradouro</td>
								<td class="logradouro" ><input type="text" ng-model="operadoraEdit.logradouro" class="form-control" maxlength="1024" /></td>
							</tr>	
	
							<tr>
								<td>Número</td>
								<td class="numeroLogradouro" ><input type="text" ng-model="operadoraEdit.numeroLogradouro" class="form-control" maxlength="32" /></td>
								
								<td>Complemento</td>
								<td class="complemento" ><input type="text" ng-model="operadoraEdit.complemento" class="form-control" maxlength="32" /></td>
							</tr>							
	
							<tr>
								<td>Bairro</td>
								<td class="bairro" ><input type="text" ng-model="operadoraEdit.bairro" class="form-control" maxlength="64" /></td>
	
								<td>Cidade</td>
								<td class="cidade" ><input type="text" ng-model="operadoraEdit.cidade" class="form-control"  maxlength="64" /></td>
							</tr>	
	
							<tr>
								<td>Estado (UF)</td>
								<td class="uf" ><op:combo-uf name="addEditUf" classes="form-control" id="addEditUf"/></td>
	
							</tr>							
							
							<tr>
								<td>Tel DDD</td>
								<td class="telDDD" ><input type="text" ng-model="operadoraEdit.telDDD" class="form-control"  maxlength="2" /></td>
	
								<td>Telefone</td>
								<td class="telefone" ><input type="text" ng-model="operadoraEdit.telefone" class="form-control"  maxlength="256" /></td>
	
								<td>Fax</td>
								<td class="fax" ><input type="text" ng-model="operadoraEdit.fax" class="form-control"  maxlength="256" /></td>
							</tr>							
							
							<tr>
								<td>E-mail do responsável</td>
								<td class="emailResponsavel" ><input type="email" ng-model="operadoraEdit.emailResponsavel" class="form-control"  maxlength="512" /></td>
	
								<td>Site</td>
								<td class="site" ><input type="text" ng-model="operadoraEdit.site" class="form-control"  maxlength="512" /></td>
							</tr>	
							
						</tbody>
					</table>
			
					<input type="hidden" value="" ng-model="operadoraEdit.id">
		
					<button ng-click="editarCadastroOperadora()" class="btn btn-success">Salvar</button>
					<button ng-click="cancelEditCadastroOperadora()" class="btn btn-cancel">Cancelar</button>
				</div>
			</form>						

		</div>	

		<div id="addEditCadOperadoraInfo">
			<div class="panel-heading">
			    <h4>Alteração de informações gerais da operadora: {{operadora.nomeFantasia}}</h4>
			</div>					
			<form class="form" >
			
				<div class="table-responsive">
				
				    <table class="table table-bordered">
						<tbody>
						
							<tr>
								<td>Segmentação</td>
								<td class="segmentacaoOperadoraInfo" ><input type="text" ng-model="operadoraInfoEdit.segmentacao" class="form-control" maxlength="512" /></td>
							</tr>						
							
							<tr>
								<td>Total de beneficiários</td>
								<td class="ttBenefOperadoraInfo" ><input type="number" ng-model="operadoraInfoEdit.totalBeneficiarios" class="form-control" maxlength="512" /></td>
							</tr>
							
							<tr>
								<td>Competência</td>
								<td class="competenciaOperadoraInfo" ><input type="text" ng-model="operadoraInfoEdit.competencia" class="form-control" maxlength="512" /></td>
							</tr>

							<tr>
								<td>Status ANS</td>
								<td class="statusAnsOperadoraInfo" ><input type="text" ng-model="operadoraInfoEdit.statusANS" class="form-control" maxlength="512" /></td>
							</tr>								
							
						</tbody>
					</table>
			
					<input type="hidden" value="" ng-model="operadoraInfoEdit.id">
		
					<button ng-click="editarCadastroOperadoraInfo()" class="btn btn-success">Salvar</button>
					<button ng-click="cancelEditCadastroOperadoraInfo()" class="btn btn-cancel">Cancelar</button>
				</div>
			</form>						

		</div>	

		<div id="addEditCadOperadoraIdss">
			<div class="panel-heading">
			    <h4>Alteração de IDSS da operadora: {{operadora.nomeFantasia}}</h4>
			</div>					
			<form class="form" >
			
				<div class="table-responsive">
				
				    <table class="table table-bordered">
						<tbody>
						
							<tr>
								<td>Ano Base</td>
								<td class="anoBaseOperadoraIdss" ><input type="number" step="any" ng-model="operadoraIdssEdit.anoBase" class="form-control" maxlength="512" /></td>
							</tr>						
							
							<tr>
								<td>Ano Competência</td>
								<td class="anoCompetenciaOperadoraIdss" ><input type="number" step="any" ng-model="operadoraIdssEdit.anoCompetencia" class="form-control" maxlength="512" /></td>
							</tr>													
							
							<tr>
								<td>Nota Geral</td>
								<td class="anoBaseOperadoraIdss" ><input type="number" step="any" ng-model="operadoraIdssEdit.notaGeral" class="form-control" maxlength="512" /></td>
							</tr>													
							
						</tbody>
					</table>
			
					<input type="hidden" value="" ng-model="operadoraIdssEdit.id">
		
					<button ng-click="editarCadastroOperadoraIdss()" class="btn btn-success">Salvar</button>
					<button ng-click="cancelEditCadastroOperadoraIdss()" class="btn btn-cancel">Cancelar</button>
				</div>
			</form>						

		</div>	
	
	</div>

</body>

<script type="text/javascript" src="http://jqueryjs.googlecode.com/files/jquery-1.2.6.min.js"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/angular/angular.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/excanvas.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/chart.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/bootstrap.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/grafico/grafico.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/angular/cadOperadoraController.js'/>"></script>

</html>