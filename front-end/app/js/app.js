var app = angular.module('sistemaVendaDePontosDeVantagem', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/view/sistema/home', {
        templateUrl: 'view/sistema/pagina_home.html',
        controller: 'controller/sistema/homeController'
    });
    $routeProvider.when('/perfil', {
        templateUrl: 'view/sistema/perfil.html',
        controller: 'controller/sistema/perfilController'
    });
    $routeProvider.when('/meu_perfil', {
        templateUrl: 'meu_perfil.html',
        controller: 'controller/sistema/perfilController'
    });
    $routeProvider.when('/meus_pontos', {
        templateUrl: 'view/sistema/meus_pontos.html',
        controller: 'controller/sistema/perfilController'
    });
    $routeProvider.when('/cadastrar_vendas', {
        templateUrl: 'view/sistema/cadastrar_vendas.html',
        controller: 'controller/usuario/vendasController'
    });
    $routeProvider.when('/listar_vendas', {
        templateUrl: 'view/sistema/listar_vendas.html',
        controller: 'controller/usuario/vendasController'
    });
    $routeProvider.when('/minhas_compras', {
        templateUrl: 'view/sistema/minhas_compras.html',
        controller: 'controller/usuario/comprasController'
    });
    $routeProvider.when('/loja', {
        templateUrl: 'view/sistema/loja.html',
        controller: 'controller/usuario/lojaController'
    });
    $routeProvider.otherwise({redirectTo: '/view/sistema/home'});
}]);