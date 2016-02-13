//indexcontroller.js
var AppEquiposred = angular.module('AppEquiposred',[]);

AppEquiposred.controller('mostrarEquiposred', function($scope, $http){
    
    
    
    $scope.cargarEquiposred = function(){
        //Llamada a get con callback
        $http.get('equiposred')
                .success(function(data, status){
                    $scope.Equiposdered = data;
                });
    };
            
    $scope.agregarEquipodered = function(){
        $http.post('equiposred', $scope.nuevoEquipored)
                .success(function(data, status){
                    //$scope.Equiposdered.push($scope.nuevoEquipored);
                    $scope.nuevoEquipored = {};
                    $scope.cargarEquiposred();
                    $scope.estaAgregando = false;
                })
                .error(function(data, status){
                    console.log('ERROR:', data);
                    $scope.estaAgregando = false;
                });
    };
    
    $scope.saludo = "Hola mundo";
    $scope.nuevoEquipored = {};
    $scope.cargarEquiposred();
    
});