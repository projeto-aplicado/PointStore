var app = angular.module('sistemaVendaDePontosDeVantagem', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/view/login/tela_login', {
        templateUrl: 'view/login/tela_login.html',
        controller: 'loginController'
    });
    $routeProvider.when('/alterar_senha', {
        templateUrl: 'view/login/alterar_senha.html',
        controller: 'usuarioController'
    });
    $routeProvider.when('/cadastro_usuario', {
        templateUrl: 'view/usuario/cadastro_usuario.html',
        controller: 'usuarioController'
    });
    $routeProvider.otherwise({redirectTo: '/view/login/tela_login'});
}]);