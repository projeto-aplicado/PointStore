app.controller('usuarioController', function($scope, $http, $route, $routeParams, $location) {

	$scope.cadastrarUsuario = function (nome, sobrenome, email, login, senha) {
		
		alert("tetete");
		
		var usuarioDAO = new Object();
        usuarioDAO.nome = nome;
        usuarioDAO.sobrenome = sobrenome;
        usuarioDAO.email = email;
        usuarioDAO.login = login;
        usuarioDAO.senha = senha;

        var usuario = angular.toJson(usuarioDAO);
        $http.post('http://localhost:8080/PointStoreWeb/rest/usuario', usuario)
        .success(function(retorno){
            $scope.successMessage = retorno;
        }).error(function(){
            $scope.erroMessage = "Venda "+$scope.venda.nome+" não foi salva!";
        });

		//alert("Nome completo: " + usuarioDAO.nome + " " + usuarioDAO.sobrenome + " email: " + usuarioDAO.email + " login: " + usuarioDAO.login + " senha: " + usuarioDAO.senha);

	}

});