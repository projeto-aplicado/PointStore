var app = angular.module('loginController', ['ngResource'], ['ngRoute']);

app.controller('loginController', function ($scope, $p1, $b) {

	$scope.login = null;
	$scope.senha = null;

	$scope.logar = function login(login, senha) {
			this.login = login;
			this.senha = senha;
	}
});