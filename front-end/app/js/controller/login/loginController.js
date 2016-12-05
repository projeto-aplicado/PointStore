app.controller('loginController', function ($scope, $http, $route, $routeParams, $location) {

	$scope.login = null;
	$scope.senha = null;

	$scope.logar = function(login, senha) {
			this.login = login;
			this.senha = senha;
			alert("login: " +this.login+ " senha: " +this.senha);
	}

	$scope.atualizarUsuario = function(email, senha) {
		var usuarioDAO = new Object();
        usuarioDAO.email = email;
        usuarioDAO.senha = senha;
        
	}

});