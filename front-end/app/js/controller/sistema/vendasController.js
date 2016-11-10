//var app = angular.module('vendasController', []);

app.controller('vendasController', function($scope, $http, $route, $routeParams, $location) {

$scope.tipopontos = null;
$scope.quantidade = null;
$scope.valor = null;

$scope.sucessMessage;
$scope.erroMessage;
$scope.isEditing = false;

    $scope.cadastrarVenda = function(tipopontos, quantidade, valor) {

        $scope.tipopontos = tipopontos;
        $scope.quantidade = quantidade;
        $scope.valor = valor;
        
    }

  
});