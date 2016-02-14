//indexcontroller.js
var AppEquiposred = angular.module('AppEquiposred',[]);

AppEquiposred.controller('mostrarEquiposred', function($scope, $http){
    
    
    $scope.cargarEquiposredParaEdicion = function(idequipo){
        console.log('Cargando para edicion');
        for(var k = 0; k < $scope.Equiposred.length; k++){
            if($scope.Equiposdered[k].id === idequipo){
                $scope.equipoRedActual = $scope.Equiposdered[k];
            }
        }
    };
    
    $scope.cargarEquiposred = function(){
        //Llamada a get con callback
        $http.get('equiposred')
                .success(function(data, status){
                    $scope.Equiposdered = data;
                });
    };
            
    $scope.guardarEquipored = function(){
        $scope.estaGuardando = true;
        if(typeof $scope.equipoRedActual.idequipo != 'undefined'){
            $http.put('equiposred', $scope.equipoRedActual)
                .success(function(data, status){
                    //$scope.Equiposdered.push($scope.nuevoEquipored);
                    $scope.equipoRedActual = {};
                    $scope.cargarEquiposred();
                    $scope.estaGuardando = false;
                })
                .error(function(data, status){
                    console.log('ERROR:', data);
                    $scope.estaGuardando = false;
                });
        }
        else{
            $http.post('equiposred', $scope.equipoRedActual)
                .success(function(data, status){
                    //$scope.Equiposdered.push($scope.nuevoEquipored);
                    $scope.equipoRedActual = {};
                    $scope.cargarEquiposred();
                    $scope.estaGuardando = false;
                })
                .error(function(data, status){
                    console.log('ERROR:', data);
                    $scope.estaGuardando = false;
                });
            }
    };
    
    $scope.eliminarEquipRed = function(idequipo){
        for(var k = 0; k< $scope.Equiposred.length; k++){
            if($scope.Equiposdered[k])
        }
    };
    
    $scope.saludo = "Hola mundo";
    $scope.nuevoEquipored = {};
    $scope.cargarEquiposred();
    
});