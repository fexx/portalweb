function cadOperadoraController($scope, $window, $http) {
	
	$scope.operadoras = [];
	$scope.operadorasInfo = [];
	$scope.operadoraIdssLista = [];
	$scope.respostaIdssLista = [];
	
	$scope.operadora;
	$scope.operadoraEdit;
	$scope.operadoraInfo;
	$scope.operadoraInfoEdit;
	$scope.operadoraIdss;
	$scope.operadoraIdssEdit;
	
	/*CONTROLE DE EXIBICAO DE TELA AO INICIAR*/	
	$("#addEditCadOperadora").hide();
	$("#addEditCadOperadoraInfo").hide();
	$("#addEditCadOperadoraIdss").hide();	
	/*
	 * POPULA LISTA DE OPERADORAS CADASTRADAS
	 * */	
	var listaOperadorasCadastradas = function(){
		$http.get('/portalweb/cadOperadora/lista').success(function(data) {
			$scope.operadoras = data;
		});	
	}
	
	/*
	 * POPULA LISTA DE OPERADORAS CADASTRADAS
	 * */	
	$(function (){
		listaOperadorasCadastradas();
		
	});	
	
	/* POPULA OBJETO DE CADASTRO DE OPERADORA / INFORMAÇÕES GERAIS / IDSS  */
	$scope.infoOperadora = function(operadora){
		
		/*
		 * OCULTA DIV COM LISTA DE OPERADORAS CADASTRADAS E EXIBE DIV DE INFORMACOES GERAIS
		 * */
		$("#listaOperadoras").hide();
		$("#visualizarInfoGeralOperadora").show();
		
		/*
		 * POPULAR OBJETO OPERADORA COM A OPERADORA SELECIONADA
		 * */
		$scope.operadora = operadora;
		
		/*
		 * POPULAR OBJETO DE INFO DE CADASTRO DA OPERADORA 
		 * */
		var operadoraVal = angular.toJson(operadora);
		$http.post('/portalweb/cadOperadoraInfo/operadoraInfo', operadoraVal).success(function(data){
    		$scope.operadoraInfo = data;
    	});
		// TODO: IMPLEMENTAR CASO DE FALHA IMPRIMINDO EM TELA O ERRO OCORRIDO
		
		/*
		 * POPULAR OBJETO DE IDSS DE CADASTRO DA OPERADORA 
		 * */
		$http.post('/portalweb/cadOperadoraIdss/operadoraIdss', operadoraVal).success(function(data){
			$scope.operadoraIdss = data;
    	});
		
		//TODO: IMPLEMENTAR CASO DE FALHA IMPRIMINDO EM TELA O ERRO OCORRIDO
		
	}
    
	/*
	 * VOLTAR PARA VISUALIZACAO DE LISTA DE OPERADORAS CADASTRADAS
	 * */
	$scope.fecharInfoOperadora = function(){

		/*
		 * EXIBE DIV COM LISTA DE OPERADORAS CADASTRADAS E OCULTA DIV DE INFORMACOES GERAIS
		 * */
		$("#listaOperadoras").show();
		$("#visualizarInfoGeralOperadora").hide();
			
		/* LIMPA REGISTROS DE DETALHES DA OPERADORA */
		$scope.operadorasInfo = [];
		$scope.operadoraIdssLista = [];
		$scope.respostaIdssLista = [];
		
		$scope.operadora = "";
		$scope.operadoraEdit = "";
		$scope.operadoraInfo = "";
		$scope.operadoraInfoEdit = "";
		$scope.operadoraIdss = "";
		$scope.operadoraIdssEdit = "";
		
		/*
		 * RECARREGA LISTA DE OPERADORAS CADASTRADAS
		 * */
		listaOperadorasCadastradas();
		
	}
	
	/*
	 * BUSCAR RESPOSTAS AO QUESTIONARIO IDSS
	 * */
	$scope.respostaIdss = function (idssOperadora) {
		//$scope.operadoraIdss = idssOperadora;
		/*
		 * EXIBE DIV COM NOTAS QUE COMPOE IDSS
		 * */
		$("#tblOperadorasIdssResposta").show();
		
		/*
		 * POPULAR OBJETO COM RESPOSTAS AO QUESTIONARIO IDSS
		 * */
		var operadoraIdssVal = angular.toJson(idssOperadora);
		$http.post('/portalweb/cadOperadoraIdssResposta/operadoraIdssResposta', operadoraIdssVal).success(function(data){
    		$scope.respostaIdssLista = data;
    	});
		
	}
	
	/*
	 * FECHAR O PAINEL DE RESPOSTAS DA OPERADORA IDSS SELECIONADO E INVALIDAR O OBJETO DE RESPOSTAS
	 * */
	$scope.fecharPainelRespostas = function(){
		
		$("#tblOperadorasIdssResposta").hide();
		$scope.respostaIdssLista = "";
	}
	
	/*
	 * HABILITA OPÇÃO DE EDITAR CADASTRO DE OPERADORA
	 * DESABILITA PAINEL DE INFORMACOES GERAIS DA OPERADORA
	 * */
	$scope.habilitaEditarCadOperadora = function(){
		
		$scope.operadoraEdit = angular.copy($scope.operadora);
		
		$("#visualizarInfoGeralOperadora").hide();
		$("#addEditCadOperadora").show();

		$("#addEditUf").val($scope.operadoraEdit.uf);
	}
	
	/*
	 * ALTERA OS DADOS DE CADASTRO DE OPERADORA
	 * */
	$scope.editarCadastroOperadora = function(){
		$scope.operadoraEdit.uf = $("#addEditUf").val();
		var operadora = angular.toJson($scope.operadoraEdit);
		
		$http.put('/portalweb/cadOperadora/editarCadOperadora', operadora).success(function(data){
    		//TODO: IMPLEMENTAR CASO DE FALHA E SUCESSO IMPRIMINDO EM TELA O ERRO OCORRIDO
			$scope.operadora = angular.copy($scope.operadoraEdit);
			$("#visualizarInfoGeralOperadora").show();
			$("#addEditCadOperadora").hide();
			
		});
		
	}
	
	/*
	 * CANCELA EDITAR REGISTRO DE CADASTRO DE OPERADORA
	 * */
	$scope.cancelEditCadastroOperadora = function(){
		$("#visualizarInfoGeralOperadora").show();
		$("#addEditCadOperadora").hide();
	}
	
	/*
	 * HABILITA OPÇÃO DE EDITAR CADASTRO DE INFO DE OPERADORA
	 * DESABILITA PAINEL DE INFORMACOES GERAIS DA OPERADORA
	 * */	
	$scope.habilitaEditarCadOperadoraInfoGeral = function(){
		$("#addEditCadOperadoraInfo").show();
		$("#visualizarInfoGeralOperadora").hide();
		
		$scope.operadoraInfoEdit = angular.copy($scope.operadoraInfo);
		
	}
	
	/*
	 *	CANCELA EDITAR REGISTRO DE CADASTRO DE OPERADORA INFO 
	 * */
	$scope.cancelEditCadastroOperadoraInfo = function(){
		$("#addEditCadOperadoraInfo").hide();
		$("#visualizarInfoGeralOperadora").show();
		
	}
	
	/*
	 * ENVIA DADOS DE CADASTRO OPERADORA INFO PARA ATUALIZACAO
	 * */
	$scope.editarCadastroOperadoraInfo = function(){
		
		var operadoraInfo = angular.toJson($scope.operadoraInfoEdit);
		
		$http.put('/portalweb/cadOperadoraInfo/editarCadOperadoraInfo', operadoraInfo).success(function(data){
    		//TODO: IMPLEMENTAR CASO DE FALHA E SUCESSO IMPRIMINDO EM TELA O ERRO OCORRIDO
			$scope.operadoraInfo = angular.copy($scope.operadoraInfoEdit);
			$("#visualizarInfoGeralOperadora").show();
			$("#addEditCadOperadoraInfo").hide();
			
		});
		
	}

	/*
	 * HABILITA OPÇÃO DE EDITAR CADASTRO DE IDSS DE OPERADORA
	 * DESABILITA PAINEL DE INFORMACOES GERAIS DA OPERADORA
	 * */	
	$scope.habilitaEditarCadOperadoraIdss = function(idss){
		$("#addEditCadOperadoraIdss").show();
		$("#visualizarInfoGeralOperadora").hide();
		
		$scope.operadoraIdss = angular.copy(idss);
		$scope.operadoraIdssEdit = angular.copy(idss);
		
	}	
	
	/*
	 *	CANCELA EDITAR REGISTRO DE CADASTRO DE OPERADORA IDSS 
	 * */
	$scope.cancelEditCadastroOperadoraIdss = function(){
		$("#addEditCadOperadoraIdss").hide();
		$("#visualizarInfoGeralOperadora").show();
		
		var operadoraVal = angular.toJson($scope.operadora);			
		$http.post('/portalweb/cadOperadoraIdss/operadoraIdss', operadoraVal).success(function(data){
    		$scope.operadoraIdss = data;
    	});
		
	}
	
	/*
	 * ENVIA DADOS DE CADASTRO OPERADORA IDSS PARA ATUALIZACAO
	 * */
	$scope.editarCadastroOperadoraIdss = function(){
		
		var operadoraIdss = angular.toJson($scope.operadoraIdssEdit);
		
		$http.put('/portalweb/cadOperadoraIdss/editarCadOperadoraIdss', operadoraIdss).success(function(data){
    		//TODO: IMPLEMENTAR CASO DE FALHA E SUCESSO IMPRIMINDO EM TELA O ERRO OCORRIDO
			
			var operadoraVal = angular.toJson($scope.operadora);			
			$http.post('/portalweb/cadOperadoraIdss/operadoraIdss', operadoraVal).success(function(data){
	    		$scope.operadoraIdss = data;
	    	});
			
			$("#visualizarInfoGeralOperadora").show();
			$("#addEditCadOperadoraIdss").hide();
			
		});
		
	}	
	
	$scope.editarCadastroOperadoraRespostas = function(){
		
		var operadoraIdssRespostas = angular.toJson($scope.respostaIdssLista);
		var operadoraIdss = angular.toJson($scope.operadoraIdss);
		$http.put('/portalweb/cadOperadoraIdssResposta/editarCadOperadoraIdssRespostas', operadoraIdssRespostas ).success(function(data){
    		//TODO: IMPLEMENTAR CASO DE FALHA E SUCESSO IMPRIMINDO EM TELA O ERRO OCORRIDO
		});
	}
	
	
	$scope.openUrl = function(operadora){
		
		window.open(operadora.site, '_blank');
		
	}
	
	/*
	 * LIBERA VISUALIZAÇÃO DE TELA DEPOIS DE TER CARREGADO TODOS OS COMPONENTES
	 * */
	$("#cadOperadorasAddEditInfo").show();

	
}