//indexcontroller.js
var AppClubs = angular.module('AppClubs',[]);

AppClubs.controller('mostrarClubs', function($scope, $http){
    
    $scope.saludo = "Hola mundo";
    
    //Llamada a get con callback
    $http.get('clubs')
            .success(function(data, status){
                $scope.clubs = data;
            });
});
