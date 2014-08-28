function cadOperadoraController($scope, $window, $http) {
	
	$scope.operadoras = [];
	$scope.operadora ;
	
	$scope.operadorasInfo = [];
	$scope.operadoraIdss = [];
	$scope.respostaIdssLista = [];
	$scope.operadoraInfo ;
	
	$http.get('/portalweb/cadOperadora/lista').success(function(data) {
		$scope.operadoras = data;
	});	
	
	$scope.edit = function(operadora){

    	$("#tblAddEdit").toggle();
    	$("#tblOperadoras").toggle();
    	$("#tblOperadorasInfo").hide();    	
    	$scope.operadora = operadora;
		$(".btn-success").attr("disabled", "disabled");
		$(".btn-primary").removeAttr("disabled");
		
    };

    $scope.fecharPainelDetalhes = function(){
    	
    	$("#listaOperadoras").show();
    	$("#visualizarInfoGeralOperadora").hide();
    	$("#tblOperadorasInfo").hide();
    	
    	$scope.operadora = "";
    	
    }
    
    $scope.infoOperadora = function(operadora){
    	
    	$("#listaOperadoras").hide();
    	$("#visualizarInfoGeralOperadora").show();
    	$("#tblOperadorasInfo").show();
    	
    	$scope.operadora = operadora;
    	
    	var url = '/portalweb/cadOperadoraInfo/operadoraInfo';
    	var operadoraVal = angular.toJson(operadora);
    	$http.post(url, operadoraVal).success(function(data){
    		$scope.operadoraInfo = data;
    	});
    	
    	var urlIdss = '/portalweb/cadOperadoraIdss/operadoraIdss';
    	$http.post(urlIdss, operadoraVal).success(function(data){
    		$scope.operadoraIdss = data;
    	});
    	
    }
    
    $scope.fecharPainelRespostas = function(){
    	
    	$("#tblOperadorasIdssResposta").toggle();
    	$scope.respostaIdssLista = "";
    }
    
    $scope.respostaIdss = function (idssOperadora) {
    	
    	$("#tblOperadorasIdssResposta").toggle();
    	
    	var operadoraIdssVal = angular.toJson(idssOperadora);
    	var url = '/portalweb/cadOperadoraIdssResposta/operadoraIdssResposta';
    	
    	$http.post(url, operadoraIdssVal).success(function(data){
    		$scope.respostaIdssLista = data;
    	});
    	
    }
    
    $scope.putUser = function () {
    	
    	var url = '/portalweb/cadOperadora/editarCadOperadora',
    	operadora = angular.toJson($scope.operadora);
    	
    	$http.put(url, operadora).success(function(data){
    		reset();
			$(".btn-primary").attr("disabled", "disabled");
			$(".btn-success").removeAttr("disabled");
    	});
    	
    	$("#tblAddEdit").toggle();
    	$("#tblOperadoras").toggle();
    	$("#tblOperadorasInfo").toggle();

    };    
    
    var reset = function(){
    	console.log("resetou");
    	$scope.operadora = "";
    	
    	$http.get('/portalweb/cadOperadora/lista').success(function(data) {
    		$scope.operadoras = data;
    	});   	
    };
    
}