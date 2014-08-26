function cadOperadoraController($scope, $window, $http) {
	
	$scope.operadoras = [];
	$scope.operadora ;
	
	$http.get('/portalweb/cadOperadora/lista').success(function(data) {
		$scope.operadoras = data;
	});

    $scope.edit = function(operadora){
    	$("#tblAddEdit").show();
    	$("#tblOperadoras").hide();
    	$scope.operadora = operadora;
		$(".btn-success").attr("disabled", "disabled");
		$(".btn-primary").removeAttr("disabled");
    };

    $scope.putUser = function () {
    	
    	var url = '/portalweb/cadOperadora/editarCadOperadora',
    	operadora = angular.toJson($scope.operadora);
    	
    	$http.put(url, operadora).success(function(data){
    		reset();
			$(".btn-primary").attr("disabled", "disabled");
			$(".btn-success").removeAttr("disabled");
    	});
    	
    	$("#tblAddEdit").hide();
    	$("#tblOperadoras").show();

    };    
    
    var reset = function(){
    	
    	$scope.operadora = "";
    	
    };
    
}