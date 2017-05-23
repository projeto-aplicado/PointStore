app.controller('perfilController', function($scope, $http) {

    $scope.lista = {};
    $scope.listaPontos = [];
    $scope.usuario = usuario;
    
    

	$scope.atualizarPerfilUsuario = function(){

        var usuario = angular.toJson($scope.usuario);

        $http.put('http://localhost:8080/PointStoreWeb/rest/usuario', usuario)
        .success(function(retorno){

            localStorage.usuario = JSON.stringify($scope.usuario);    

            alert(retorno);
        }).error(function(){
            erroMessage = "Usuario "+usuarioDAO.nome+" não foi salvo!";
        });

    }


    $scope.cadastrarTiposDePontos = function(tipoDePontos, quantidadePonto){
        var meusPontosDAO = new Object();
        var tipoDePontosDAO = new Loja();


        meusPontosDAO.quantidadePonto = quantidadePonto;

        
        tipoDePontosDAO.tipoDePontos = tipoDePontos;

        meusPontosDAO.loja = tipoDePontosDAO;




        var tipoDePontosUsuario = angular.toJson(meusPontosDAO);
        $http.post('http://localhost:8080/PointStoreWeb/rest/meuspontos', tipoDePontosUsuario)
        .success(function(retorno){
            alert(retorno);
        }).error(function(){
            erroMessage = "O ponto "+tipoDePontosDAO.tipoDePontos+" não foi salvo!";
        });        
    }

});