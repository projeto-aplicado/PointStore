app.controller('vendasController', function($scope, $http, $route, $routeParams, $location) {

$scope.sucessMessage;
$scope.erroMessage;
$scope.isEditing = false;

    $scope.cadastrarVenda = function(tipopontos, quantidade, valor) {

        var vendaDAO = new Object();
        vendaDAO.tipopontos = tipopontos;
        vendaDAO.quantidade = quantidade;
        vendaDAO.valor = valor;

        var venda = angular.toJson(vendaDAO);
        $http.post('http://localhost:8080/PointStoreWeb/rest/venda', venda)
        .success(function(retorno){
            alert(retorno);
        }).error(function(){
            $scope.erroMessage = "Venda "+$scope.venda.nome+" não foi salva!";
        });
    }

    $scope.listarVenda = function() {
        $http.get('http://localhost:8080/PointStore/rest/listar')
        .success(function(dados){
            $scope.lista = {};
            $scope.listaVendas = [];
            $scope.listaVendas = dados.lista;
           
        }).error(function(){
            $scope.erroMessage = "pontos não encontradas!"
        });
        $scope.isEditing = false;
    }

}
  
);