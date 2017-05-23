app.controller('usuarioController', function($scope, $http, $route, $routeParams, $location) {

	$scope.cadastrarUsuario = function (nome, sobrenome, email, login, senha) {
		
		var usuarioDAO = new Object();
        usuarioDAO.nome = nome;
        usuarioDAO.sobrenome = sobrenome;
        usuarioDAO.email = email;
        usuarioDAO.login = login;
        usuarioDAO.senha = senha;

        var usuario = angular.toJson(usuarioDAO);
        $http.post('http://localhost:8080/PointStoreWeb/rest/usuario', usuario)
        .success(function(retorno){
            alert(retorno);
        }).error(function(){
            erroMessage = "Usuario "+usuarioDAO.nome+" não foi salvo!";
        });
	}


    $scope.recuperarSenhaUsuario = function(email, senha){
        var usuarioDAO = new Object();
        usuarioDAO.email = email;
        usuarioDAO.senha = senha;

        var usuario = angular.toJson(usuarioDAO);
        $http.put('http://localhost:8080/PointStoreWeb/rest/usuarioLogin/'+email, usuario)
        .success(function(retorno){
            alert(retorno);
        }).error(function(){
            erroMessage = "Usuario "+usuarioDAO.email+" não foi salvo!";
        });

    }

});