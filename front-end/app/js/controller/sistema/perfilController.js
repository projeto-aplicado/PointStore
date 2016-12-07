app.controller('perfilController', function($scope) {

    $scope.lista = {};
    $scope.listaPontos = [];

    

	$scope.atualizarPerfilUsuario = function(nome, sobrenome, email, cpf, login, senha){
        var usuarioDAO = new Object();
        usuarioDAO.nome = nome;
        usuarioDAO.sobrenome = sobrenome;
        usuarioDAO.email = email;
        usuarioDAO.cpf = cpf;
        usuarioDAO.login = login;
        usuarioDAO.senha = senha;

        var usuario = angular.toJson(usuarioDAO);
        $http.put('http://localhost:8080/PointStoreWeb/rest/usuarioLogin', usuario)
        .success(function(retorno){
            alert(retorno);
        }).error(function(){
            erroMessage = "Usuario "+usuarioDAO.nome+" não foi salvo!";
        });

    }


    $scope.cadastrarTiposDePontos = function(tipoDePontos, quantidadePonto){
        var tipoDePontosDAO = new Object();
        tipoDePontosDAO.tipoDePontos = tipoDePontos;
        tipoDePontosDAO.quantidadePonto = quantidadePonto;

        var tipoDePontosUsuario = angular.toJson(tipoDePontosDAO);
        $http.post('http://localhost:8080/PointStoreWeb/rest/usuario', tipoDePontosUsuario)
        .success(function(retorno){
            alert(retorno);
        }).error(function(){
            erroMessage = "O ponto "+tipoDePontosDAO.tipoDePontos+" não foi salvo!";
        });        
    }

});