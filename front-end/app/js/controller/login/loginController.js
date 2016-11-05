var app = angular.module('loginController', ['ngResource'], ['ngRoute']);

app.controller('loginController', function sistemaLogin($scope) {

	$scope.login = null;
	$scope.senha = null;

	$scope.logar = function login(login, senha) {
			this.login = login;
			this.senha = senha;
	}


});