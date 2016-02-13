//indexcontroller.js
var AppEquiposred = angular.module('AppEquiposred',[]);

AppEquiposred.controller('mostrarEquiposred', function($scope, $http){
    
    $scope.saludo = "Hola mundo";
    
    //Llamada a get con callback
    $http.get('equiposred')
            .success(function(data, status){
                $scope.Equiposdered = data;
            });
});