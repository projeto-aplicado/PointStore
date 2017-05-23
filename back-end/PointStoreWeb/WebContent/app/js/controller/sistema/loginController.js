app.controller('loginController', function ($scope, $http, $route, $routeParams, $location) {

	$scope.deslogar = function() {
		confirm("deseja se deslogar do sistema?");
		window.location.href = 'http://localhost:8080/PointStoreWeb/app/index.html';
	}

});