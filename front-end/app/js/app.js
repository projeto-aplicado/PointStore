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
        controller: 'vendasController'
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
    $routeProvider.when('/qualificacao', {
        templateUrl: 'view/sistema/qualificacao_usuario.html',
        controller: 'controller/sistema/qualificacaoController'
    });
    $routeProvider.when('/login', {
        templateUrl: 'view/login/tela_login.html',
        controller:  'controller/login/loginController'

    });
    $routeProvider.when('/senha', {
        templateUrl: 'view/login/alterar_senha.html',
        controller:  'controller/login/alterar_senhaController'

    });
    $routeProvider.when('/usuario', {
        templateUrl: 'view/usuario/usuario.html',
        controller:  'controller/usuario/usuarioController'

    });
    $routeProvider.otherwise({redirectTo: '/view/sistema/home'});
}]);