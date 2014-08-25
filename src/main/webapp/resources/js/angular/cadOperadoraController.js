function cadOperadoraController($scope, $window, $http) {
	
	$scope.operadoras = [];
	$scope.operadora ;
	
	$http.get('/portalweb/cadOperadora/lista').success(function(data) {
		$scope.operadoras = data;
	});

    $scope.edit = function(operadora){
		$scope.operadora = operadora;
		$(".btn-success").attr("disabled", "disabled");
		$(".btn-primary").removeAttr("disabled");
    };
	
    $scope.putUser = function () {
    	console.log("passou aqui");
    	var user = angular.toJson({operadora : $scope.operadora});
    	$http.post('/portalweb/cadOperadora/editarCadOperadora', operadora).success(function(data){
    		$scope.operadoras.unshift(data);
    		reset();
    	});
    };
    
    $scope.putUser = function () {
    	var url = '/portalweb/cadOperadora/editarCadOperadora',
    	cadOperadora = angular.toJson({cadOperadora : $scope.operadora});
    	
    	$http.put(url, cadOperadora).success(function(data){
    		//reset();
			$(".btn-primary").attr("disabled", "disabled");
			$(".btn-success").removeAttr("disabled");
    	});
    };    
    
}