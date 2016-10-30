var app = angular.module('sistemaVendaDePontosDeVantagem', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/index', {
        templateUrl: 'view/login/login.html',
        controller: 'loginController'
    });
    $routeProvider.when('/meus_pontos', {
        templateUrl: 'view/meus_pontos.html',
        controller: 'listarPontosController'
    });
    $routeProvider.when('/home', {
        templateUrl: 'index.html',
        controller: 'listarPontosController'
    });
    $routeProvider.otherwise({redirectTo: '/view/login/tela_login'});
}]);