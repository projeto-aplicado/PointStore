var app = angular.module('sistemaVendaDePontosDeVantagem', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/view/sistema/home', {
        templateUrl: 'view/sistema/pagina_home.html',
        controller: 'homeController'
    });
    $routeProvider.when('/perfil', {
        templateUrl: 'view/sistema/meu_perfil.html',
        controller: 'perfilController'
    });
    $routeProvider.when('/meus_pontos', {
        templateUrl: 'view/sistema/meus_pontos.html',
        controller: 'perfilController'
    });
    $routeProvider.when('/cadastrar_vendas', {
        templateUrl: 'view/sistema/cadastrar_vendas.html',
        controller: 'vendasController'
    });
    $routeProvider.when('/listar_vendas', {
        templateUrl: 'view/sistema/listar_vendas.html',
        controller: 'vendasController'
    });
    $routeProvider.when('/minhas_compras', {
        templateUrl: 'view/sistema/minhas_compras.html',
        controller: 'comprasController'
    });
    $routeProvider.when('/loja', {
        templateUrl: 'view/sistema/loja.html',
        controller: 'lojaController'
    });
    $routeProvider.when('/qualificacao', {
        templateUrl: 'view/sistema/qualificacao_usuario.html',
        controller: 'qualificacaoController'
    });
    $routeProvider.when('/login', {
        templateUrl: 'view/login/tela_login.html',
        controller:  'loginController'

    });
    $routeProvider.when('/senha', {
        templateUrl: 'view/login/alterar_senha.html',
        controller:  'alterar_senhaController'

    });
    $routeProvider.when('/usuario', {
        templateUrl: 'view/usuario/usuario.html',
        controller:  'usuarioController'

    });
    $routeProvider.otherwise({redirectTo: '/view/sistema/home'});
}]);
