var app = angular.module('sistemaVendaDePontosDeVantagem', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/view/sistema/home', {
        templateUrl: 'pagina_home.html',
        controller: 'controller/sistema/homeController'
    });
    $routeProvider.when('/perfil', {
        templateUrl: 'perfil.html',
        controller: 'controller/sistema/perfilController'
    });
    $routeProvider.when('/meu_perfil', {
        templateUrl: 'meu_perfil.html',
        controller: 'controller/sistema/perfilController'
    });
    $routeProvider.when('/meus_pontos', {
        templateUrl: 'meus_pontos.html',
        controller: 'controller/sistema/perfilController'
    });
    $routeProvider.when('/cadastrar_vendas', {
        templateUrl: 'cadastrar_vendas.html',
        controller: 'controller/usuario/vendasController'
    });
    $routeProvider.when('/listar_vendas', {
        templateUrl: 'listar_vendas.html',
        controller: 'controller/usuario/vendasController'
    });
    $routeProvider.when('/minhas_compras', {
        templateUrl: 'minhas_compras.html',
        controller: 'controller/usuario/comprasController'
    });
    $routeProvider.when('/loja', {
        templateUrl: 'loja.html',
        controller: 'controller/usuario/lojaController'
    });
    $routeProvider.otherwise({redirectTo: '/view/sistema/home'});
}]);